// Relación embebida (documentos dentro de documentos)

db.libros.insertOne({
titulo: "El Hobbit",
autor: {
    nombre: "J.R.R. Tolkien",
    nacionalidad: "Británica"
},
categorias: ["Fantasía", "Aventura"]
});
