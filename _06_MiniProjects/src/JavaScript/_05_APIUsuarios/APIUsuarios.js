async function cargarUsuarios() {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    const data = await response.json();
    const tbody = document.querySelector("#usuarios tbody");
    data.forEach(user => {
        const tr = document.createElement("tr");
        tr.innerHTML = `<td>${user.name}</td><td>${user.email}</td>`;
        tbody.appendChild(tr);
    });
}
cargarUsuarios();
