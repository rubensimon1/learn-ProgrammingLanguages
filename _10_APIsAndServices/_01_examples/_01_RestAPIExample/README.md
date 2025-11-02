# RestAPIExample

Este ejemplo muestra cómo **consumir una API REST** usando Python. Aprenderás a enviar solicitudes HTTP, recibir respuestas en formato JSON y procesar los datos.

---

## Objetivo

* Conocer cómo realizar solicitudes a una API REST.
* Aprender a procesar respuestas JSON.
* Entender el flujo básico de consumo de APIs.

---

## Estructura

```
RestAPIExample/
├─ README.md         # Explicación del ejemplo
└─ main.py           # Código de ejemplo
```

---

## Código de ejemplo (`main.py`)

```python
import requests

# URL de la API de ejemplo
url = 'https://jsonplaceholder.typicode.com/posts'

# Hacer una solicitud GET
response = requests.get(url)

# Verificar que la solicitud fue exitosa
if response.status_code == 200:
    data = response.json()
    print('Primeros 5 posts:')
    for post in data[:5]:
        print(f"{post['id']}: {post['title']}")
else:
    print('Error en la solicitud:', response.status_code)
```

---

## Explicación

1. **Importamos `requests`**: Librería para manejar solicitudes HTTP.
2. **URL de la API**: Usamos un servicio de prueba `jsonplaceholder.typicode.com`.
3. **Solicitud GET**: Se envía al servidor para obtener los datos.
4. **Verificación de respuesta**: Comprobamos que el código de estado sea 200 (éxito).
5. **Procesamiento de JSON**: Transformamos la respuesta a formato JSON y mostramos los primeros 5 elementos.

---

## Próximos pasos

* Probar solicitudes POST, PUT y DELETE.
* Añadir parámetros de consulta.
* Manejar errores y excepciones más complejas.
* Conectar este ejemplo con una base de datos o interfaz gráfica.
