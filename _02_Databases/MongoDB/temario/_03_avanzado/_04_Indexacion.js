// Crear índice por ciudad

db.usuarios.createIndex({ ciudad: 1 });

// Ver índices creados
db.usuarios.getIndexes();
