// Insertar un documento en la colección "usuarios"

db.usuarios.insertOne({
nombre: "Carlos",
edad: 25,
ciudad: "Madrid"
});

// Insertar varios documentos

db.usuarios.insertMany([
{ nombre: "Lucía", edad: 22, ciudad: "Barcelona" },
{ nombre: "David", edad: 30, ciudad: "Valencia" }
]);
