// Realiza una solicitud HTTP a una API pública (por ejemplo, JSONPlaceholder) y muestra el título del primer post.
fetch("https://jsonplaceholder.typicode.com/posts/1")
.then((respuesta) => respuesta.json())
.then((datos) => console.log("Título del post:", datos.title))
.catch((error) => console.error("Error al cargar:", error));
