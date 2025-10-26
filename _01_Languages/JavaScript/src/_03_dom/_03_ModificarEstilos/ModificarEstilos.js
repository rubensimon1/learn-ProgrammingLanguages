// Crea un botón que cambie el color y tamaño de un párrafo al hacer clic.
document.getElementById("cambiar").addEventListener("click", () => {
const p = document.getElementById("parrafo");
p.style.color = "blue";
p.style.fontSize = "20px";
});
