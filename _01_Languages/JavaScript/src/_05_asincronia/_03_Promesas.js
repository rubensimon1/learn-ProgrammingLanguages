// Crea una Promesa que simule un proceso asincrónico (por ejemplo, descargar datos).
// Debe resolverse o rechazarse después de 2 segundos.

const descargarDatos = new Promise((resolve, reject) => {
console.log("Descargando datos...");
setTimeout(() => {
    const exito = Math.random() > 0.3; // 70% éxito
    if (exito) {
    resolve("Datos descargados correctamente");
    } else {
    reject("Error en la descarga");
    }
}, 2000);
});

descargarDatos
.then((mensaje) => console.log(mensaje))
.catch((error) => console.error(error))
.finally(() => console.log("Proceso finalizado"));
