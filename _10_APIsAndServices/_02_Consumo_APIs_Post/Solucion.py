import requests
import json

# URL de una API pública de prueba para crear recursos (JSONPlaceholder)
API_URL = "https://jsonplaceholder.typicode.com/posts" 

def crear_recurso_post(url, payload_data):
    """
    Realiza una solicitud POST para crear un nuevo recurso.

    Lógica Universal: Definir el payload, enviar la cabecera Content-Type,
    y esperar un código de creación (201).
    """
    
    print(f"-> 1. Enviando solicitud POST a: {url}")
    print(f"Payload a enviar: {payload_data}")

    # Cabeceras (Headers) - Indican al servidor el tipo de datos que enviamos
    # Esto es crucial para los métodos POST/PUT
    headers = {
        "Content-Type": "application/json"
    }

    try:
        # ACT: Realizar la solicitud HTTP, enviando el payload serializado como JSON
        response = requests.post(url, json=payload_data, headers=headers)
        
        # 2. Verificar el código de estado HTTP
        # Un POST exitoso que crea un recurso suele devolver 201 Created.
        if response.status_code == 201:
            print(f"\n-> 2. Creación exitosa (Código: {response.status_code} Created).")
            
            # 3. La API suele devolver el recurso creado, incluyendo su ID generado.
            data = response.json()
            return data
        else:
            print(f"\n-> 2. Error al crear el recurso. Código de estado: {response.status_code}")
            print(f"Mensaje de error: {response.text}")
            return None

    except requests.exceptions.RequestException as e:
        print(f"Error de conexión o de red: {e}")
        return None

# --- Zona de Pruebas ---
print("--- Ejercicio 2: Consumo de APIs (POST) ---")

# ARRANGE: El cuerpo de la solicitud (Payload)
nuevo_post = {
    "title": "Mi Primer Post desde API",
    "body": "Este es el contenido del nuevo recurso creado por un cliente.",
    "userId": 10
}

# ACT: Llamar a la función
recurso_creado = crear_recurso_post(API_URL, nuevo_post)

if recurso_creado:
    print("\nRespuesta de la API (Recurso Creado):")
    # Imprimimos la respuesta del servidor, que incluye el ID generado (ej: id: 101)
    print(json.dumps(recurso_creado, indent=4))
    print(f"\nVerificación: El nuevo recurso tiene el ID: {recurso_creado.get('id')}")