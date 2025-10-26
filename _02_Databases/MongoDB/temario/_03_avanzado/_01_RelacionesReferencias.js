// Crear colecciones relacionadas (referencias)

db.autores.insertOne({ _id: 1, nombre: "J.K. Rowling" });
db.libros.insertOne({ titulo: "Harry Potter", autor_id: 1 });

// Consulta con relación manual
const libro = db.libros.findOne({ titulo: "Harry Potter" });
const autor = db.autores.findOne({ _id: libro.autor_id });
print(`Libro: ${libro.titulo}, Autor: ${autor.nombre}`);
