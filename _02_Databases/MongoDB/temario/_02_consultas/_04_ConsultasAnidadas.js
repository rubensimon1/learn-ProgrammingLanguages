// Insertar colección con documentos anidados
db.productos.insertMany([
{
    nombre: "Portátil",
    precio: 1200,
    especificaciones: { ram: "16GB", cpu: "i7", marca: "Dell" }
},
{
    nombre: "Teléfono",
    precio: 800,
    especificaciones: { ram: "8GB", cpu: "Snapdragon", marca: "Samsung" }
}
]);

// Buscar productos de una marca específica
db.productos.find({ "especificaciones.marca": "Dell" });
