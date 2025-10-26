// Crea una página con un párrafo y usa JavaScript para seleccionarlo por su id, clase y etiqueta
const porId = document.getElementById("mensaje");
const porClase = document.getElementsByClassName("texto")[0];
const porEtiqueta = document.getElementsByTagName("p")[0];

console.log("Por ID:", porId.textContent);
console.log("Por clase:", porClase.textContent);
console.log("Por etiqueta:", porEtiqueta.textContent);
