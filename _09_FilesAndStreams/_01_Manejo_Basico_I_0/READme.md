# Ejercicio 1: Ciclo de Vida Básico de un Archivo (Lógica Universal)

## 🎯 Objetivo
Implementar el ciclo básico de I/O para asegurar que los archivos se manejen correctamente, incluyendo la apertura, escritura y el cierre seguro (independiente del lenguaje).

## 📝 Instrucciones (Parte 1: Escritura Segura)
1.  Crea una función llamada `escribir_y_leer_archivo`.
2.  Abre un archivo llamado **`datos_de_prueba.txt`** en modo **escritura (`w`)**.
3.  Escribe tres líneas de texto separadas.
4.  Asegúrate de que el archivo se **cierre automáticamente** después de la escritura (utiliza la estructura nativa para manejo seguro de recursos del lenguaje, ej: `try-with-resources` en Java, `with open(...)` en Python).

## 📝 Instrucciones (Parte 2: Lectura)
5.  Reabre el mismo archivo en modo **lectura (`r`)**.
6.  Lee y almacena todas las líneas del archivo en una lista.
7.  Devuelve la lista de líneas leídas.

## 🔑 Conceptos Clave
* **Cierre de Recursos:** Si no cierras un archivo, puede causar pérdidas de datos (corrupción) o agotar recursos del sistema. El manejo seguro garantiza el cierre incluso si ocurre un error (excepción).
* **Flushing:** Después de escribir, la información debe ser "vaciada" (flushed) del buffer a disco, generalmente esto ocurre al cerrar el archivo.

## ✅ Lógica Universal Esperada

FUNCION escribir_y_leer_archivo(): // PARTE 1: Escritura (Modo 'w') INTENTAR ABRIR archivo_salida EN "datos_de_prueba.txt" MODO ESCRITURA: Escribir "Línea 1" en archivo_salida Escribir "Línea 2" en archivo_salida Escribir "Línea 3" en archivo_salida // El recurso se cierra automáticamente

// PARTE 2: Lectura (Modo 'r')
ListaLineas = Crear Nueva Lista
INTENTAR ABRIR archivo_entrada EN "datos_de_prueba.txt" MODO LECTURA:
    PARA CADA linea EN archivo_entrada:
        Añadir linea a ListaLineas
// El recurso se cierra automáticamente

DEVOLVER ListaLineas