// Agrupar usuarios por ciudad y contar cuántos hay

db.usuarios.aggregate([
{ $group: { _id: "$ciudad", total: { $sum: 1 } } }
]);

// Calcular edad promedio
db.usuarios.aggregate([
{ $group: { _id: null, edad_promedio: { $avg: "$edad" } } }
]);
