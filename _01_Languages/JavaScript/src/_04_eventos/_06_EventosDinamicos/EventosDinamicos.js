// Crea un botón que, al hacer clic, añada un nuevo botón que también responda a clics mostrando su propio número.
const contenedor = document.getElementById("contenedor");
let contador = 1;

document.getElementById("crear").addEventListener("click", () => {
const nuevo = document.createElement("button");
nuevo.textContent = `Botón ${contador}`;
nuevo.addEventListener("click", () => {
    console.log(`Has hecho clic en el botón ${contador}`);
});
contenedor.appendChild(nuevo);
contador++;
});
