// Crea una función operar(a, b, callback) que reciba dos números y una función de operación (callback).
// Ejemplo: sumar, restar, multiplicar.
function operar(a, b, callback) {
return callback(a, b);
}

const sumar = (x, y) => x + y;
const restar = (x, y) => x - y;

console.log("Suma:", operar(5, 3, sumar));
console.log("Resta:", operar(5, 3, restar));
