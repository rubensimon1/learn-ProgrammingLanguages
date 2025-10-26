# 🚀 Major Projects — Proyectos Integradores

> _“La mejor forma de aprender es construyendo.”_

Estos proyectos combinan todo lo aprendido: programación orientada a objetos, colecciones, ficheros, concurrencia, testing, documentación y bases de datos.

---

## 🧠 Estructura

| Nivel | Descripción |
|-------|--------------|
| 🟢 Básico | Fundamentos, lógica y control de flujo. |
| 🟡 Intermedio | POO, ficheros, validaciones y documentación. |
| 🔴 Avanzado | Bases de datos, concurrencia y testing. |
| ⚫ Experto | Integración total, APIs y arquitectura completa. |

---

## 🎯 Objetivos

- Reforzar lo aprendido con proyectos aplicados.  
- Desarrollar lógica y estructura en programas completos.  
- Documentar, probar y mantener código profesional.  
- Introducirte a entornos reales de desarrollo.  

---

## 💬 Consejo

> Empieza desde los básicos y sube el nivel progresivamente.  
> Cada proyecto está pensado para unir varios temas del temario.  
> Al final tendrás un portafolio con proyectos reales y bien estructurados.

---

# 🟢 Proyectos Básicos — Fundamentos de Programación

> _“Pequeños programas para afianzar la lógica y el control del flujo.”_

Estos proyectos usan estructuras básicas, control de flujo, colecciones simples y entrada/salida por consola.

---

### 🎮 Proyecto 1 — Juego del Ahorcado

> _“Adivina la palabra antes de que sea demasiado tarde.”_

#### 🧩 Descripción
Implementa el clásico **Juego del Ahorcado** en consola:
- Elige una palabra secreta.
- El usuario intenta adivinar letra a letra.
- Cada error dibuja una parte del ahorcado.
- El juego termina cuando se acierta o se agotan los intentos.

#### 🧠 Conceptos aplicados
- Bucles y condicionales  
- Manejo de cadenas  
- Arrays o listas  
- Entrada por teclado  

#### 🧪 Extensión
Guarda el historial de partidas en un fichero `.txt`.

#### 💡 Consejo
Empieza con una sola palabra fija y luego añade dificultad o lista de palabras.

---

### 💱 Proyecto 2 — Conversor de Monedas

#### 🧩 Descripción
Crea un programa que convierta entre distintas monedas (EUR, USD, GBP...).

#### 🧠 Conceptos aplicados
- Operaciones matemáticas simples  
- Uso de `Scanner`  
- Control de flujo con `if` o `switch`

#### 🧪 Extensión
Usa una API de tipo “Exchange Rates” para obtener valores reales.

#### 💡 Consejo
Empieza con tasas fijas y luego añade actualización automática.

---

### ⏱ Proyecto 3 — Temporizador con Hilos

#### 🧩 Descripción
Crea un programa que funcione como un temporizador:
- Pide al usuario cuántos segundos quiere contar.
- Muestra el tiempo restante cada segundo usando un hilo.

#### 🧠 Conceptos aplicados
- Clase `Thread`
- Métodos `sleep()` y `run()`
- Control del flujo concurrente

#### 💡 Consejo
Agrega una opción para pausar o reiniciar el temporizador.

---

# 🟡 Proyectos Intermedios — POO, Ficheros y Validaciones

> _“Comienza a pensar como un programador orientado a objetos.”_

---

### 📋 Proyecto 4 — Gestor de Tareas

#### 🧩 Descripción
Crea un gestor de tareas simple con opciones de:
- Agregar, eliminar, listar y marcar tareas como completadas.
- Guardar los datos en un archivo `.txt`.

#### 🧠 Conceptos aplicados
- POO (clases `Tarea`, `GestorTareas`)  
- Colecciones (`ArrayList`)  
- Ficheros (`FileReader`, `FileWriter`)  

#### 💡 Consejo
Añade validación para evitar tareas duplicadas.

---

### 🧾 Proyecto 5 — Sistema de Notas

#### 🧩 Descripción
Crea una aplicación para registrar calificaciones de alumnos, calcular medias y generar reportes.

#### 🧠 Conceptos aplicados
- Clases (`Alumno`, `Asignatura`)
- Estructuras de datos (listas, mapas)
- Lectura/escritura de ficheros
- Validación de datos

#### 💡 Consejo
Guarda los reportes en formato `.csv` o `.json`.

---

### 🌦️ Proyecto 6 — Consulta de Clima

#### 🧩 Descripción
Crea un programa que pida el nombre de una ciudad y muestre su clima actual.

#### 🧠 Conceptos aplicados
- Consumo de API REST (por ejemplo, OpenWeather)
- Parseo de JSON
- Manejo de errores y validación de entradas

#### 💡 Consejo
Agrega un modo “histórico” que guarde las consultas anteriores.

---

# 🔴 Proyectos Avanzados — Concurrencia, Testing y Bases de Datos

> _“Aplicaciones completas con datos, sincronización y pruebas unitarias.”_

---

### 📚 Proyecto 7 — Sistema de Biblioteca

#### 🧩 Descripción
Crea un CRUD completo para gestionar:
- Libros  
- Usuarios  
- Préstamos  

Usa **SQLite** o **MySQL** y **Java JDBC**.

#### 🧠 Conceptos aplicados
- JDBC (consultas, inserciones, actualizaciones)  
- MVC básico  
- Validación de datos  

#### 💡 Consejo
Agrega pruebas con JUnit para las funciones CRUD.

---

### 👥 Proyecto 8 — Simulador de Red Social

#### 🧩 Descripción
Simula una mini red social donde los usuarios pueden:
- Crear publicaciones  
- Seguir a otros  
- Comentar  

#### 🧠 Conceptos aplicados
- POO avanzada  
- Persistencia con ficheros o BD  
- Concurrencia (para manejar interacciones simultáneas)  

#### 💡 Consejo
Agrega un sistema de notificaciones o mensajes directos.

---

### 💰 Proyecto 9 — Sistema Bancario Concurrente

#### 🧩 Descripción
Simula un sistema bancario con varias cuentas y operaciones simultáneas:
- Depósitos, retiros y transferencias.  
- Controla la concurrencia para evitar inconsistencias.

#### 🧠 Conceptos aplicados
- Sincronización (`synchronized`, `Lock`)  
- Hilos y estados compartidos  
- Pruebas unitarias de concurrencia  

#### 💡 Consejo
Implementa logs que registren cada transacción en un fichero.

---

# ⚫ Proyectos Expertos — APIs, Web y Full Stack

> _“El paso final antes de construir tus propias aplicaciones profesionales.”_

---

### 🧩 Proyecto 10 — API de Usuarios

#### 🧩 Descripción
Desarrolla una API REST para gestionar usuarios:
- CRUD (crear, leer, actualizar, eliminar)
- Validación de entradas
- Conexión con base de datos

#### 🧠 Conceptos aplicados
- Servidor con frameworks (Spring Boot, Flask o Express)
- Rutas y controladores
- Testing de endpoints

#### 💡 Consejo
Documenta la API con Swagger o Postman.

---

### 💻 Proyecto 11 — Aplicación Web Full Stack

#### 🧩 Descripción
Crea una aplicación web completa que integre:
- Backend (Java + JDBC o Spring Boot)
- Frontend (HTML, CSS, JS)
- Base de datos (MySQL o PostgreSQL)

#### 🧠 Conceptos aplicados
- Arquitectura MVC  
- Sesiones y validación de usuarios  
- Integración de APIs  

#### 💡 Consejo
Puedes basarte en un **gestor de eventos**, **tienda online** o **sistema de reservas**.

---

### 💬 Proyecto 12 — Chat Multihilo

#### 🧩 Descripción
Crea un chat por consola o red local con varios clientes.

#### 🧠 Conceptos aplicados
- Sockets (`ServerSocket`, `Socket`)
- Concurrencia (hilos por cliente)
- Comunicación cliente-servidor

#### 💡 Consejo
Empieza con dos usuarios, luego amplíalo a múltiples clientes y guarda los mensajes en fichero o BD.

---

## 🧩 Consejo final

> Cada uno de estos proyectos consolida varias partes del temario.  
> No intentes hacerlos todos de golpe: termina uno, documenta, añade mejoras y luego pasa al siguiente.  
> Al final tendrás una base sólida para proyectos profesionales o tu propio portafolio.

---
