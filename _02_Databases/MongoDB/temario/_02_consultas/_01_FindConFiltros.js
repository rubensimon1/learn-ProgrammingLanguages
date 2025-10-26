// Buscar usuarios cuya edad sea mayor a 24

db.usuarios.find({ edad: { $gt: 24 } });

// Buscar usuarios de Madrid o Valencia

db.usuarios.find({ ciudad: { $in: ["Madrid", "Valencia"] } });
