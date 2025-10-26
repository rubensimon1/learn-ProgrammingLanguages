// Crea un formulario con un campo de nombre y un botón que muestre el valor ingresado sin recargar la página.
const form = document.getElementById("formulario");

form.addEventListener("submit", (e) => {
e.preventDefault(); // evita recargar la página
const nombre = document.getElementById("nombre").value;
document.getElementById("salida").textContent = `Hola, ${nombre}!`;
});
