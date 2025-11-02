# Scripts - Tema 04

# Scripts de Prueba - Tema 04

Esta carpeta contiene scripts de prueba y utilidades para practicar los conceptos del **tema 04**.

---

## Contenido

- `README.md`: Explicación de los scripts y cómo usarlos.
- `test_requests.py`: Script de prueba para enviar solicitudes y verificar funcionalidades relacionadas con el tema.

---

## test_requests.py

Este script permite realizar pruebas básicas, como solicitudes HTTP, lectura de archivos o cualquier otro test relacionado con el tema 04.

**Ejemplo de uso:**

```python
import requests

# URL de prueba
url = 'https://jsonplaceholder.typicode.com/posts/1'

response = requests.get(url)

if response.status_code == 200:
    print('Solicitud exitosa!')
    print(response.json())
else:
    print('Error en la solicitud:', response.status_code)
```

Este script puede modificarse para realizar otras pruebas según los ejercicios o ejemplos del tema.
