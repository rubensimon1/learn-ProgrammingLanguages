const input = document.getElementById("tareaInput");
const lista = document.getElementById("lista");
document.getElementById("agregar").addEventListener("click", () => {
    if (input.value === "") return;
    const li = document.createElement("li");
    li.textContent = input.value;
    li.addEventListener("click", () => li.style.textDecoration = "line-through");
    lista.appendChild(li);
    input.value = "";
});
