// Crea un botón que elimine el último elemento de una lista.
document.getElementById("eliminar").addEventListener("click", () => {
const lista = document.getElementById("lista");
if (lista.lastElementChild) {
    lista.removeChild(lista.lastElementChild);
}
});
