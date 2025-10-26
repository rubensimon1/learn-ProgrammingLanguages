// Crea una función cargarUsuario() que use async/await para simular la carga de un usuario con setTimeout.
function obtenerUsuario() {
return new Promise((resolve) => {
    setTimeout(() => {
    resolve({ nombre: "Laura", edad: 28 });
    }, 2000);
});
}

async function cargarUsuario() {
console.log("Cargando usuario...");
const usuario = await obtenerUsuario();
console.log("Usuario cargado:", usuario);
}

cargarUsuario();
