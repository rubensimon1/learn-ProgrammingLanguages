// Crea una clase ErrorSaldoInsuficiente que extienda Error.
// Lanza este error si un usuario intenta retirar más dinero del disponible.

class ErrorSaldoInsuficiente extends Error {
constructor(mensaje) {
    super(mensaje);
    this.name = "ErrorSaldoInsuficiente";
}
}

function retirarDinero(saldo, cantidad) {
if (cantidad > saldo) {
    throw new ErrorSaldoInsuficiente("Saldo insuficiente para realizar esta operación");
}
console.log(`Has retirado ${cantidad}€. Saldo restante: ${saldo - cantidad}€`);
}

try {
retirarDinero(100, 150);
} catch (error) {
if (error instanceof ErrorSaldoInsuficiente) {
    console.error("⚠️ Error de saldo:", error.message);
} else {
    console.error("Error inesperado:", error);
}
}
