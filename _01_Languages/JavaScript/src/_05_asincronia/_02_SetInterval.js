// Crea un programa que muestre "Tick" cada segundo y se detenga después de 5
let contador = 0;

const intervalo = setInterval(() => {
contador++;
console.log("Tick:", contador);

if (contador === 5) {
    clearInterval(intervalo);
    console.log("Temporizador detenido");
}
}, 1000);
