// Eliminar un documento

db.usuarios.deleteOne({ nombre: "Lucía" });

// Eliminar todos los usuarios mayores de 28 años

db.usuarios.deleteMany({ edad: { $gt: 28 } });
