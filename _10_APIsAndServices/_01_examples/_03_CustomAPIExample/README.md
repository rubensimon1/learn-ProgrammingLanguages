# CustomAPIExample

# Ejemplo de API Propia

Este ejemplo muestra cómo crear una **API REST simple** usando Python y Flask.

---

## Objetivos

- Crear una API REST básica.
- Manejar rutas y métodos HTTP (GET, POST).
- Devolver respuestas en formato JSON.
- Entender la estructura de un proyecto de API.

---

## Estructura del proyecto
CustomAPIExample/
├─ README.md         # Explicación del ejemplo (este archivo)
└─ main.py           # Código de ejemplo de la API

---

## Contenido de `main.py`

- **GET /books**: Devuelve todos los libros.
- **GET /books/<id>**: Devuelve un libro por ID.
- **POST /books**: Añade un nuevo libro a la lista.

---

## Cómo ejecutar

1. Instalar Flask si no lo tienes:
   pip install flask

2. Ejecutar la API:
   python main.py

3. Probar los endpoints usando Postman, cURL o el navegador.

---

## Próximos pasos
* Añadir endpoints para actualizar y eliminar libros (PUT, DELETE).
* Validar los datos de entrada.
* Añadir autenticación y seguridad.
* Conectar con una base de datos real.
