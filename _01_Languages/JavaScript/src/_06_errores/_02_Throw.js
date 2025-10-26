// Crea una función que verifique si una edad es válida (mayor o igual a 0).
// Si no lo es, lanza un error usando throw.
function verificarEdad(edad) {
if (edad < 0) {
    throw new Error("La edad no puede ser negativa");
}
console.log("Edad válida:", edad);
}

try {
verificarEdad(-5);
} catch (error) {
console.error("Error capturado:", error.message);
}
