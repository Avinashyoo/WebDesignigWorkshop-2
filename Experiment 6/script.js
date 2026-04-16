 // Element Selection
const heading = document.getElementById('heading');
const inputField = document.getElementById('userInput');
const paragraph = document.getElementById('paragraph');

// 1. Change Heading: Grabs text from input and updates <h1>
document.getElementById('btnChangeHeading').addEventListener('click', () => {
    const textValue = inputField.value.trim();
    if (textValue !== "") {
        heading.textContent = textValue;
    }
});

// 2. Change Background: Targets the OUTER boundary (the body)
document.getElementById('btnChangeBg').addEventListener('click', () => {
    // Array of colors similar to your screenshots (Teal, Brown, Grey)
    const colors = ['#5f9ea0', '#a0522d', '#778899', '#4682b4', '#bc8f8f'];
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    
    // Applying to body to change the boundary area
    document.body.style.backgroundColor = randomColor;
});

// 3. Increase Font Size: Grows the paragraph text
let fontSize = 18;
document.getElementById('btnIncreaseFont').addEventListener('click', () => {
    fontSize += 2;
    paragraph.style.fontSize = fontSize + 'px';
});

// 4. Show/Hide: Toggles visibility without moving other elements
document.getElementById('btnTogglePara').addEventListener('click', () => {
    if (paragraph.style.opacity === "0") {
        paragraph.style.opacity = "1";
    } else {
        paragraph.style.opacity = "0";
    }
});

// 5. Reset: Restores all original styles and content
document.getElementById('btnReset').addEventListener('click', () => {
    // Reset Content
    heading.textContent = "Welcome to JavaScript Lab";
    inputField.value = "";
    
    // Reset Styles
    document.body.style.backgroundColor = "#f0f0f0";
    paragraph.style.fontSize = "18px";
    paragraph.style.opacity = "1";
    fontSize = 18;
});