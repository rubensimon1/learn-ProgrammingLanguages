# 🌐 10 - APIs y Servicios Web (APIs and Web Services)

Esta sección cubre cómo las aplicaciones se comunican entre sí a través de la red, un concepto fundamental en el desarrollo de software moderno.

Una **API (Application Programming Interface)** es un conjunto de reglas que permite que una aplicación (cliente) se comunique con otra aplicación (servidor). Define el **contrato** de la comunicación.

## 🧱 El Modelo Cliente-Servidor y REST

La arquitectura más común en la web actual es **REST (Representational State Transfer)**, que utiliza el protocolo **HTTP** como su base.

| Concepto | Significado Universal | Propósito |
| :---: | :--- | :--- |
| **Endpoint** | La URL específica a la que se realiza la solicitud. | El "punto de encuentro" donde la API escucha las peticiones. |
| **Método HTTP** | La "intención" de la solicitud. | Indica si el cliente quiere LEER (GET), CREAR (POST), ACTUALIZAR (PUT/PATCH) o ELIMINAR (DELETE). |
| **JSON** | El formato de intercambio de datos. | Es el lenguaje universal (junto con XML) que usan las APIs para enviar y recibir información. |
| **Código de Estado** | Un número de 3 dígitos enviado por el servidor. | Indica el resultado de la petición (ej: 200 OK, 404 Not Found, 500 Server Error). |

## 🔑 Métodos HTTP Esenciales

| Método | Propósito | Resultado Típico (Código) | Lógica (CRUD) |
| :---: | :---: | :---: | :---: |
| **GET** | Obtener un recurso o una lista. | 200 OK | Read (Lectura) |
| **POST** | Crear un nuevo recurso. | 201 Created | Create (Creación) |
| **PUT/PATCH** | Actualizar un recurso existente. | 200 OK | Update (Actualización) |
| **DELETE** | Eliminar un recurso específico. | 204 No Content | Delete (Eliminación) |

---

## 🎯 Estructura de Ejercicios

Nos enfocaremos en el consumo de APIs (el rol de Cliente), que es la tarea más común.

* **01-Consumo-APIs-GET:** La base: obtener y parsear datos JSON.
* **02-Consumo-APIs-POST:** Enviar datos estructurados (payload) para crear un nuevo recurso.