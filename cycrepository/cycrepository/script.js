// Button click alert
document.getElementById('clickMe')?.addEventListener('click', () => {
  alert('ts animations so peak');
});

// Responsive menu toggle (accessible)
const menuToggle = document.querySelector('.menu-toggle');
const navLinks = document.querySelector('.nav-links');
if (menuToggle && navLinks) {
  menuToggle.addEventListener('click', () => {
    const expanded = menuToggle.getAttribute('aria-expanded') === 'true';
    menuToggle.setAttribute('aria-expanded', (!expanded).toString());
    navLinks.classList.toggle('active');
  });

  // Close menu on outside click
  document.addEventListener('click', (e) => {
    if (!navLinks.contains(e.target) && !menuToggle.contains(e.target)) {
      navLinks.classList.remove('active');
      menuToggle.setAttribute('aria-expanded', 'false');
    }
  });

  // Close on Escape
  document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape') {
      navLinks.classList.remove('active');
      menuToggle.setAttribute('aria-expanded', 'false');
    }
  });
}

// Fade-in sections on scroll
const sections = document.querySelectorAll('.fade-in-section');

const observer = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    if(entry.isIntersecting) {
      entry.target.classList.add('visible');
    }
  });
}, {
  threshold: 0.1
});

sections.forEach(section => {
  observer.observe(section);
});

// --- Calendar entries feature ---
// Historically we used prompt() for quick edits. Only attach that behavior
// on pages that do NOT include the richer event modal (id="eventModal").
if (!document.getElementById('eventModal')) {
  // Add click listeners to each table cell that has a .date-number div
  document.querySelectorAll('td').forEach(cell => {
    const dateNumber = cell.querySelector('.date-number');
    if (!dateNumber) return; // skip cells without dates

    cell.addEventListener('click', () => {
      const entriesDiv = cell.querySelector('.entries');
      const currentEntry = entriesDiv ? entriesDiv.innerText : '';
      const userInput = prompt(`Add/Edit entry for date ${dateNumber.innerText}:`, currentEntry);
      if (userInput !== null && entriesDiv) {
        entriesDiv.innerText = userInput;
      }
    });
  });
}

// Apply consistent button classes and animations across pages
document.addEventListener('DOMContentLoaded', () => {
  // Ensure every <button> has the .btn class so styles apply consistently
  document.querySelectorAll('button').forEach(btn => {
    if (!btn.classList.contains('btn')) btn.classList.add('btn');
  });

  // Promote common action buttons to primary for consistent emphasis
  ['openCalendarBtn','saveSurvey','saveEventBtn','prevMonthBtn','nextMonthBtn','skipSurvey','cancelEventBtn'].forEach(id => {
    const el = document.getElementById(id);
    if (el && !el.classList.contains('primary')) el.classList.add('primary');
  });

  // Idle pulse on the first primary CTA found — pause on interaction
  const primary = document.querySelector('.btn.primary');
  if (primary) {
    primary.classList.add('idle-pulse');
    ['mouseenter','focus'].forEach(ev => primary.addEventListener(ev, () => primary.classList.remove('idle-pulse')));
    ['mouseleave','blur'].forEach(ev => primary.addEventListener(ev, () => primary.classList.add('idle-pulse')));
  }
});

// --- Custom right-side scrollbar & back-to-top ---
(function(){
  // Create track + thumb and back-to-top button
  const track = document.createElement('div');
  track.id = 'scrollTrack';
  // outer thumb (translate) and inner element (scale) to avoid janky transform conflicts
  const thumb = document.createElement('div');
  thumb.id = 'scrollThumb';
  const thumbInner = document.createElement('div');
  thumbInner.className = 'scrollThumbInner';
  thumb.appendChild(thumbInner);
  track.appendChild(thumb);
  document.body.appendChild(track);

  const btn = document.createElement('button');
  btn.id = 'backToTop';
  btn.setAttribute('aria-label','Back to top');
  btn.innerHTML = '↑';
  document.body.appendChild(btn);

  let isDragging = false;
  let startY = 0;
  let startScroll = 0;
  // squash state when reaching top/bottom
  let isSquashing = false;
  let squashDir = null; // 'top' | 'bottom' | null
  let squashTimer = null;
  // scroll velocity tracking (px per ms) with smoothing
  let lastScrollTop = window.scrollY || window.pageYOffset || document.documentElement.scrollTop;
  let lastTimestamp = performance.now();
  let lastVelocity = 0; // px per ms (smoothed)
  let lastDy = 0;
  const velocitySmoothing = 0.82; // higher = more smoothing, less jitter
  // current squash scales computed from velocity
  let squashScaleY = 0.64;
  let squashScaleX = 1.18;
  let squashDuration = 320;

  function updateThumb() {
    const doc = document.documentElement;
    const scrollTop = window.scrollY || window.pageYOffset || doc.scrollTop;
    const scrollHeight = doc.scrollHeight;
    const clientH = doc.clientHeight;
    const trackH = track.clientHeight;
    const thumbH = Math.max(48, Math.min(trackH - 8, Math.round((clientH / scrollHeight) * trackH)));
    // set height on outer thumb (so inner scales without affecting layout)
    thumb.style.height = thumbH + 'px';
    const maxScroll = scrollHeight - clientH;
    const pct = maxScroll > 0 ? (scrollTop / maxScroll) : 0;
    const top = Math.round(pct * (trackH - thumbH));
    // Apply translate on outer thumb only (no transition) for smooth movement
    thumb.style.transform = `translateY(${top}px)`;
    // Apply squash scale on inner element to animate independently
    if (isSquashing) {
      if (squashDir === 'top') {
        thumbInner.style.transformOrigin = 'center top';
      } else {
        thumbInner.style.transformOrigin = 'center bottom';
      }
      thumbInner.style.transform = `scaleY(${squashScaleY}) scaleX(${squashScaleX})`;
    } else {
      thumbInner.style.transformOrigin = 'center top';
      thumbInner.style.transform = 'scaleY(1) scaleX(1)';
    }

    // show back-to-top when scrolled enough
    if (scrollTop > 200) btn.classList.add('show'); else btn.classList.remove('show');

    // trigger squash when near extremes (small threshold to avoid accidental triggers)
    if (!isSquashing) {
      // require at least a small strength to avoid tiny, janky triggers
      const strengthPeek = Math.min(1, lastVelocity / 2.5);
      const atBottom = (maxScroll > 0) && (scrollTop >= maxScroll - 2);
      if (pct <= 0.004 && strengthPeek > 0.04) {
        triggerSquash('top', lastVelocity);
      } else if (pct >= 0.996 && (strengthPeek > 0.04 || atBottom || pct >= 0.9995 || lastDy > 4)) {
        triggerSquash('bottom', lastVelocity);
      }
    }
  }

  // ensure squash triggers don't fire too often
  let lastSquashAt = 0;
  function triggerSquash(dir, velocityPxPerMs = 0) {
    const now = performance.now();
    if (isSquashing) return;
    // debounce: require 120ms between squash events
    if (now - lastSquashAt < 120) return;
    lastSquashAt = now;
    isSquashing = true;
    squashDir = dir;
    // map velocity to a strength [0..1]
    const vRef = 1.2; // px per ms reference (≈1200 px/s) — lower for stronger visible squash
    const rawStrength = Math.min(1, velocityPxPerMs / vRef);
    // baseline ensures a clearly visible squash even for moderate hits
    const baseline = 0.28;
    // apply smoothing to avoid spikes but bias towards recent rawStrength
    const strength = Math.max(baseline, (rawStrength * 0.6) + (Math.min(1, lastVelocity / vRef) * 0.4));
    // compute squash scales based on strength (stronger -> more squash)
    squashScaleY = 1 - (0.72 * strength); // can go as low as ~0.28
    squashScaleX = 1 + (0.45 * strength);  // can go as high as ~1.45
    squashDuration = Math.round(160 + (260 * strength));
    // ensure correct anchor depending on direction
    if (dir === 'bottom') {
      thumbInner.style.transformOrigin = 'center bottom';
    } else {
      thumbInner.style.transformOrigin = 'center top';
    }
    // Apply immediate visual via thumbInner (no layout thrash)
    thumbInner.style.transition = `transform ${squashDuration}ms cubic-bezier(.2,0.9,0.3,1)`;
    thumbInner.style.transform = `scaleY(${squashScaleY}) scaleX(${squashScaleX})`;
    // Clear any previous timers and schedule rebound after squashDuration
    clearTimeout(squashTimer);
    squashTimer = setTimeout(() => {
      // start rebound; keep isSquashing true until rebound finishes so we don't retrigger
      const reboundMs = 300;
      // ensure rebound originates from the same edge
      thumbInner.style.transition = `transform ${reboundMs}ms cubic-bezier(.2,0.8,0.22,1)`;
      thumbInner.style.transformOrigin = (dir === 'bottom') ? 'center bottom' : 'center top';
      thumbInner.style.transform = 'scaleY(1) scaleX(1)';
      // after rebound completes, clear squash state and reset origin to top for predictability
      squashTimer = setTimeout(() => {
        isSquashing = false;
        squashDir = null;
        thumbInner.style.transformOrigin = 'center top';
        squashTimer = null;
      }, reboundMs);
    }, squashDuration);
  }

  // sync on scroll
  let raf = null;
  // show/hide track on inactivity
  let trackVisible = true;
  let trackHideTimer = null;
  const TRACK_IDLE_MS = 1200;
  function showTrack() {
    if (!trackVisible) {
      trackVisible = true;
      track.classList.add('visible');
    }
    clearTimeout(trackHideTimer);
    trackHideTimer = setTimeout(() => {
      trackVisible = false;
      track.classList.remove('visible');
    }, TRACK_IDLE_MS);
  }
  window.addEventListener('scroll', () => {
    if (raf) return;
    raf = requestAnimationFrame(() => {
      // compute velocity in px per ms and smooth it to reduce jitter
      const now = performance.now();
      const scrollTop = window.scrollY || window.pageYOffset || document.documentElement.scrollTop;
  const dt = Math.max(1, now - lastTimestamp);
  const dy = scrollTop - lastScrollTop;
  lastDy = dy;
  const instantV = Math.abs(dy) / dt; // px per ms
      // exponential smoothing
      lastVelocity = (velocitySmoothing * lastVelocity) + ((1 - velocitySmoothing) * instantV);
      lastTimestamp = now;
      lastScrollTop = scrollTop;
      updateThumb();
      // show track while user is scrolling
      showTrack();
      raf = null;
    });
  }, { passive: true });

  // show track on pointer near right edge or pointer enter over track
  window.addEventListener('pointermove', (e) => {
    // if pointer is within 48px of right edge, reveal the track
    if (window.innerWidth - e.clientX <= 48) showTrack();
  }, { passive: true });

  track.addEventListener('pointerenter', () => showTrack());
  track.addEventListener('pointerdown', () => showTrack());

  // initial
  updateThumb();

  // track click to jump
  track.addEventListener('click', (e) => {
    if (e.target === thumb) return; // ignore clicking thumb itself
    const rect = track.getBoundingClientRect();
    const clickY = e.clientY - rect.top;
    const trackH = rect.height;
    const doc = document.documentElement;
    const scrollHeight = doc.scrollHeight;
    const clientH = doc.clientHeight;
    const maxScroll = scrollHeight - clientH;
    const pct = Math.min(1, Math.max(0, clickY / trackH));
    window.scrollTo({ top: Math.round(pct * maxScroll), behavior: 'smooth' });
  });

  // drag handling
  thumb.addEventListener('pointerdown', (e) => {
    isDragging = true;
    thumb.setPointerCapture(e.pointerId);
    startY = e.clientY;
    startScroll = window.scrollY || window.pageYOffset || document.documentElement.scrollTop;
    document.documentElement.style.userSelect = 'none';
  });
  window.addEventListener('pointermove', (e) => {
    if (!isDragging) return;
    const rect = track.getBoundingClientRect();
    const trackH = rect.height;
    const thumbH = thumb.clientHeight;
    const delta = e.clientY - rect.top - thumbH/2;
    const pct = Math.min(1, Math.max(0, delta / (trackH - thumbH)));
    const doc = document.documentElement;
    const maxScroll = doc.scrollHeight - doc.clientHeight;
    window.scrollTo(0, Math.round(pct * maxScroll));
  // If dragging and pinned to extreme, trigger a squash to give feedback
  if (pct <= 0.001) triggerSquash('top', lastVelocity);
  if (pct >= 0.999) triggerSquash('bottom', lastVelocity);
  }, { passive: false });
  window.addEventListener('pointerup', (e) => {
    if (!isDragging) return;
    isDragging = false;
    try { thumb.releasePointerCapture(e.pointerId); } catch(e){}
    document.documentElement.style.userSelect = '';
  });

  // smooth scroll to top
  function scrollToTop() {
    const start = window.scrollY || window.pageYOffset;
    const duration = 420;
    const startTime = performance.now();
    function step(t) {
      const elapsed = t - startTime;
      const p = Math.min(1, elapsed / duration);
      const ease = 1 - Math.pow(1 - p, 3);
      window.scrollTo(0, Math.round(start * (1 - ease)));
      if (p < 1) requestAnimationFrame(step);
    }
    requestAnimationFrame(step);
  }

  btn.addEventListener('click', scrollToTop);
  btn.addEventListener('keydown', (e) => { if (e.key === 'Enter' || e.key === ' ') { e.preventDefault(); scrollToTop(); } });
})();
