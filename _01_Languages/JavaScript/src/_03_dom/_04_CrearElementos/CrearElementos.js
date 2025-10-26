// Agrega un botón que, al hacer clic, cree y añada un nuevo elemento <li> a una lista.
document.getElementById("agregar").addEventListener("click", () => {
const li = document.createElement("li");
li.textContent = "Nuevo elemento";
document.getElementById("lista").appendChild(li);
});
