const body = document.querySelector("body"),
    sidebar = body.querySelector(".sidebar"),
    toggle = body.querySelector(".toggle"),
    searchBtn = body.querySelector(".search-box"),
    modeSwitch = body.querySelector(".toggle-switch"),
    modeText = body.querySelector(".mode-text");

// Check Local Storage for mode preference
const currentMode = localStorage.getItem("darkMode");
if (currentMode === "enabled") {
    enableDarkMode();
} else {
    disableDarkMode();
}

// Function to enable dark mode
function enableDarkMode() {
    body.classList.add("dark");
    localStorage.setItem("darkMode", "enabled");
    modeText.innerText = "Light Mode";
}

// Function to disable dark mode
function disableDarkMode() {
    body.classList.remove("dark");
    localStorage.setItem("darkMode", "disabled");
    modeText.innerText = "Dark Mode";
}

// Toggle sidebar open/close
toggle.addEventListener("click", () => {
    sidebar.classList.toggle("close");
});

// Open sidebar on search
searchBtn.addEventListener("click", () => {
    sidebar.classList.remove("close");
});

// Toggle dark mode
modeSwitch.addEventListener("click", () => {
    if (body.classList.contains("dark")) {
        disableDarkMode();
    } else {
        enableDarkMode();
    }
});