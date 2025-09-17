// Button click alert
document.getElementById('clickMe')?.addEventListener('click', () => {
  alert('ts animations so peak');
});

// Responsive menu toggle
const menuToggle = document.querySelector('.menu-toggle');
const navLinks = document.querySelector('.nav-links');

menuToggle.addEventListener('click', () => {
  navLinks.classList.toggle('active');
});

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
