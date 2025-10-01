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
// Add click listeners to each table cell that has a .date-number div
document.querySelectorAll('td').forEach(cell => {
  const dateNumber = cell.querySelector('.date-number');
  if (!dateNumber) return; // skip cells without dates

  cell.addEventListener('click', () => {
    const entriesDiv = cell.querySelector('.entries');
    const currentEntry = entriesDiv.innerText || '';
    const userInput = prompt(`Add/Edit entry for date ${dateNumber.innerText}:`, currentEntry);
    if (userInput !== null) {
      entriesDiv.innerText = userInput;
    }
  });
});
