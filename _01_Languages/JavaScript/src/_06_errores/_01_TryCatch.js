// Crea un programa que intente ejecutar código incorrecto y capture el error usando try...catch.
try {
console.log("Inicio del programa");
  noExiste(); // Error intencional
console.log("Esto no se ejecutará");
} catch (error) {
console.error("Ocurrió un error:", error.message);
}
