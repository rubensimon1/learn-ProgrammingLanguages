document.getElementById("botonColor").addEventListener("click", () => {
    document.body.style.backgroundColor = "#" + Math.floor(Math.random()*16777215).toString(16);
});
