NOMBRE_ARCHIVO = "datos_de_prueba.txt"

def escribir_y_leer_archivo():
    """
    Realiza el ciclo completo de I/O de un archivo, asegurando el cierre (Lógica Universal).
    
    En Python, la estructura 'with open(...)' garantiza el cierre del recurso.
    """
    contenido_escrito = [
        "Línea 1: Este es un mensaje importante.\n",
        "Línea 2: La I/O es la base de la persistencia.\n",
        "Línea 3: Siempre se debe cerrar el recurso."
    ]
    
    # PARTE 1: Escritura (Modo 'w')
    print(f"-> 1. Escribiendo en {NOMBRE_ARCHIVO} (Modo 'w')...")
    try:
        # El bloque 'with' asegura el cierre automático (finally en otros lenguajes)
        with open(NOMBRE_ARCHIVO, 'w', encoding='utf-8') as archivo_salida:
            archivo_salida.writelines(contenido_escrito)
    except Exception as e:
        print(f"Error durante la escritura: {e}")
        return []

    # PARTE 2: Lectura (Modo 'r')
    print(f"-> 2. Leyendo desde {NOMBRE_ARCHIVO} (Modo 'r')...")
    lineas_leidas = []
    try:
        # Reabrir el archivo para leer
        with open(NOMBRE_ARCHIVO, 'r', encoding='utf-8') as archivo_entrada:
            lineas_leidas = archivo_entrada.readlines()
    except FileNotFoundError:
        print(f"Error: El archivo {NOMBRE_ARCHIVO} no se encontró.")
        return []
    except Exception as e:
        print(f"Error durante la lectura: {e}")
        return []
    
    print("-> 3. Proceso de I/O completado.")
    return lineas_leidas

# --- Zona de Pruebas ---
print("--- Ejercicio 1: Manejo Básico de I/O ---")
lineas = escribir_y_leer_archivo()

print("\nContenido Leído y Devuelto:")
for i, linea in enumerate(lineas):
    print(f"Línea {i+1}: {linea.strip()}")