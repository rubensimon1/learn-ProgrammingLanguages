// Crea un cuadro de color que cambie de color al pasar el ratón encima y vuelva al salir.
const cuadro = document.getElementById("cuadro");

cuadro.addEventListener("mouseover", () => {
cuadro.style.background = "blue";
});

cuadro.addEventListener("mouseout", () => {
cuadro.style.background = "red";
});
