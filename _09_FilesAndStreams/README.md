# 💾 09 - Archivos y Flujos de Datos (Files and Streams)

Esta sección cubre el concepto fundamental de **Entrada/Salida (I/O)**, es decir, cómo un programa interactúa con el mundo exterior: leyendo datos de archivos, teclados, redes o escribiendo datos en el disco o en la consola.

El manejo de I/O es crucial para cualquier aplicación persistente que necesite guardar datos o comunicarse con otros sistemas.

---

## 🌊 Flujos (Streams) y Archivos

En programación, el concepto de **Flujo (Stream)** es una abstracción universal.

| Concepto | Significado Universal | Analogía |
| :---: | :--- | :--- |
| **Flujo (Stream)** | Una secuencia de datos (bytes o caracteres) que fluye de una fuente a un destino. | El agua que fluye por una tubería: un dato tras otro. |
| **I/O de Entrada** | Flujo que entra al programa (leer). | Leer datos de un archivo, del teclado o de una conexión de red. |
| **I/O de Salida** | Flujo que sale del programa (escribir). | Escribir datos en un archivo, en la consola o enviarlos por la red. |

## ⚙️ Modos de Acceso a Archivos

Cuando un programa abre un archivo, debe especificar el **modo** en que desea interactuar con él.

| Modo | Nombre Común | Propósito | Resultado si el archivo NO existe |
| :---: | :---: | :--- | :--- |
| **`r`** | Lectura (Read) | Solo leer el contenido desde el inicio. | Falla (Error) |
| **`w`** | Escritura (Write) | Escribir, sobrescribiendo **todo** el contenido existente. | Lo crea |
| **`a`** | Añadir (Append) | Escribir, añadiendo el nuevo contenido al **final** del archivo. | Lo crea |

---

## 🎯 Estructura de Ejercicios

Nos centraremos en la gestión del ciclo de vida de un archivo y la lectura de datos estructurados.

* **01-Manejo-Basico-I/O:** Implementar el ciclo completo: abrir, escribir, cerrar y leer de forma segura.
* **02-Lectura-Estructurada-CSV:** Procesar datos tabulares (como un CSV), una tarea común en la programación, convirtiéndolos en estructuras de datos en memoria.