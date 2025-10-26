// Pide al usuario un número con prompt() y lanza un error si no introduce un número válido.

// Si ejecutas esto fuera del navegador, reemplaza prompt() por un valor manual:
// const entrada = "abc"; // Ejemplo para Node.js

try {
const entrada = prompt("Introduce un número:");
const numero = Number(entrada);

if (isNaN(numero)) {
    throw new Error("No introdujiste un número válido");
}

console.log("Número ingresado:", numero);
} catch (error) {
console.error("Error:", error.message);
}