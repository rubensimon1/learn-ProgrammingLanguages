// Crea un campo de texto y un botón que muestre el valor introducido en un párrafo.
document.getElementById("mostrar").addEventListener("click", () => {
const valor = document.getElementById("nombre").value;
document.getElementById("resultado").textContent = `Hola, ${valor}`;
});
