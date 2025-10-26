// Repite el ejercicio anterior, pero usando async/await para obtener y mostrar un post completo de una API.
async function obtenerPost(id) {
try {
    const respuesta = await fetch(`https://jsonplaceholder.typicode.com/posts/${id}`);
    const datos = await respuesta.json();
    console.log("Post obtenido:");
    console.log("Título:", datos.title);
    console.log("Contenido:", datos.body);
} catch (error) {
    console.error("Error al obtener el post:", error);
}
}

obtenerPost(3);
