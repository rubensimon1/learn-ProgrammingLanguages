// Ordenar usuarios por edad descendente y limitar resultados

db.usuarios.find().sort({ edad: -1 }).limit(2);
