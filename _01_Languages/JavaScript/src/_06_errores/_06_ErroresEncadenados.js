// Simula una función que carga datos de usuario, pero puede fallar en varios niveles.
// Captura y vuelve a lanzar errores con más contexto.

function obtenerUsuario(id) {
if (id <= 0) throw new Error("ID inválido");
if (id === 13) throw new Error("Error del servidor");
return { id, nombre: "Carlos" };
}

function cargarUsuario(id) {
try {
    const usuario = obtenerUsuario(id);
    console.log("Usuario cargado:", usuario);
} catch (error) {
    throw new Error(`Error al cargar usuario (${id}): ${error.message}`);
}
}

try {
cargarUsuario(13);
} catch (error) {
console.error("Error global:", error.message);
}
