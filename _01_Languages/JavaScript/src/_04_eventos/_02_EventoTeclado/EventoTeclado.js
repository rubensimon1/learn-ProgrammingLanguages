// Crea un campo de texto y muestra en consola cada tecla que el usuario presiona.
document.getElementById("campoTexto").addEventListener("keydown", (e) => {
console.log(`Tecla presionada: ${e.key}`);
});
