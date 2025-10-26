// Usa try...catch...finally para mostrar un mensaje final, sin importar si hay o no error.

function dividir(a, b) {
try {
    if (b === 0) throw new Error("No se puede dividir entre 0");
    console.log(`Resultado: ${a / b}`);
} catch (error) {
    console.error("Error:", error.message);
} finally {
    console.log("Operación finalizada");
}
}

dividir(10, 2);
dividir(10, 0);
