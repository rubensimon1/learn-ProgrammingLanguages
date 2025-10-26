// Actualizar un campo

db.usuarios.updateOne(
{ nombre: "Carlos" },
{ $set: { edad: 26 } }
);

// Incrementar edad de todos los usuarios

db.usuarios.updateMany({}, { $inc: { edad: 1 } });
