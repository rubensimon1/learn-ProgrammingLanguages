// Mostrar solo nombre y ciudad (ocultar _id)

db.usuarios.find({}, { _id: 0, nombre: 1, ciudad: 1 });
