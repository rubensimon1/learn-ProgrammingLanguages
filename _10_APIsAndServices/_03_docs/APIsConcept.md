# Conceptos sobre APIs

Este documento explica los conceptos fundamentales de **APIs (Application Programming Interfaces)**, tipos de APIs, autenticación y buenas prácticas.

---

## 1. ¿Qué es una API?

Una **API** permite que diferentes aplicaciones o servicios se comuniquen entre sí. 
Permite **intercambiar datos y funciones** de manera segura y estandarizada.

**Ejemplo:** Una app de clima que obtiene datos de un servicio externo mediante su API.

---

## 2. Tipos de APIs

### 2.1 REST (Representational State Transfer)
- Basada en HTTP y URLs.
- Formato de intercambio de datos: JSON (principalmente) o XML.
- Operaciones CRUD usando métodos HTTP:
  - **GET**: obtener datos.
  - **POST**: crear nuevos recursos.
  - **PUT** / **PATCH**: actualizar recursos.
  - **DELETE**: eliminar recursos.
- Stateless: Cada solicitud es independiente.

### 2.2 SOAP (Simple Object Access Protocol)
- Basada en XML.
- Protocolo más estricto y formal.
- Soporta transacciones complejas y seguridad avanzada.
- Usada en entornos corporativos.

### 2.3 GraphQL
- Lenguaje de consultas para APIs.
- El cliente especifica exactamente qué datos necesita.
- Permite obtener múltiples recursos en una sola solicitud.
- Muy flexible y eficiente.

---

## 3. Autenticación en APIs

- **API Key**: Clave única para identificar al cliente.
- **OAuth 2.0**: Protocolo de autorización seguro.
- **JWT (JSON Web Token)**: Token seguro que se envía en cada solicitud.

---

## 4. Buenas prácticas

- Documentar la API claramente (Swagger, OpenAPI).
- Manejar errores correctamente (códigos HTTP: 404, 500, 401…).
- Validar y sanitizar datos de entrada.
- Mantener versionado de la API (v1, v2…).

---

## 5. Recursos y ejemplos

- [JSONPlaceholder](https://jsonplaceholder.typicode.com/) – API de prueba para aprender.
- [Swagger/OpenAPI](https://swagger.io/) – Documentación y prueba de APIs.
