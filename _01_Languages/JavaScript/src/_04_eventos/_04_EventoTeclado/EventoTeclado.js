// Crea un campo de texto que muestre en consola cada tecla que el usuario presione.
const entrada = document.getElementById("entrada");

entrada.addEventListener("keydown", (evento) => {
console.log("Tecla presionada:", evento.key);
});
