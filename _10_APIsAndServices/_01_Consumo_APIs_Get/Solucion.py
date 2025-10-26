import requests
import json

# URL de una API pública de prueba (JSONPlaceholder)
API_URL = "https://jsonplaceholder.typicode.com/posts/1" 

def obtener_recurso_get(url):
    """
    Realiza una solicitud GET a la URL para obtener un recurso.
    
    Lógica Universal: Enviar la solicitud, verificar el código de estado, 
    y parsear el cuerpo JSON.
    """
    print(f"-> 1. Enviando solicitud GET a: {url}")
    
    try:
        # ACT: Realizar la solicitud HTTP
        response = requests.get(url)
        
        # 2. Verificar el código de estado HTTP (Universal)
        if response.status_code == 200:
            print(f"-> 2. Recepción exitosa (Código: {response.status_code} OK).")
            
            # 3. Parsear la respuesta (JSON a un Diccionario/Mapa en memoria)
            data = response.json()
            
            return data
        else:
            print(f"-> 2. Error en la solicitud. Código de estado: {response.status_code}")
            return None

    except requests.exceptions.RequestException as e:
        print(f"Error de conexión o de red: {e}")
        return None

# --- Zona de Pruebas ---
print("--- Ejercicio 1: Consumo de APIs (GET) ---")
recurso = obtener_recurso_get(API_URL)

if recurso:
    print("\nRecurso obtenido (Parsed JSON):")
    # Imprimimos el objeto como una cadena JSON indentada para mayor claridad
    print(json.dumps(recurso, indent=4))
    
    # Acceso a los datos como un diccionario estándar
    print(f"\nTítulo del recurso: {recurso.get('title')}")
    print(f"ID del Usuario: {recurso.get('userId')}")