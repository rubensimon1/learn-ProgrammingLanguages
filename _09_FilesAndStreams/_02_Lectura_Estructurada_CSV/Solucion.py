DATOS_CSV_BRUTOS = """ID,Nombre,Edad,Ciudad
1,Alice,30,NY
2,Bob,24,LA
3,Charlie,45,Chicago
4,David,28,NY"""

def procesar_csv_a_mapas(datos_csv):
    """
    Convierte datos CSV brutos en una lista de diccionarios (Lógica Universal: Lista de Mapas).

    Args:
    datos_csv (str): La cadena de texto que simula el archivo CSV.

    Returns:
    list: Lista de diccionarios/mapas, donde cada diccionario es una fila.
    """
    
    # 1. Dividir por líneas (salto de línea)
    lineas = datos_csv.strip().split('\n')
    
    if not lineas:
        return []

    # 2. La primera línea es la cabecera (claves del mapa)
    cabecera = [columna.strip() for columna in lineas[0].split(',')]
    
    lista_de_mapas = []
    
    # 3. Iterar sobre las líneas de datos (saltando la primera línea de cabecera)
    for linea in lineas[1:]:
        if not linea.strip(): continue 
        
        # Dividir por el delimitador (coma)
        valores = [valor.strip() for valor in linea.split(',')]
        
        fila_mapa = {}
        
        # 4. Emparejar Clave-Valor (Iterar y asociar por índice)
        for i, valor in enumerate(valores):
            # Verificar que el número de columnas coincida
            if i < len(cabecera):
                # El mapeo: clave = cabecera[i], valor = valor
                fila_mapa[cabecera[i]] = valor
        
        lista_de_mapas.append(fila_mapa)
        
    return lista_de_mapas

# --- Zona de Pruebas ---
print("\n--- Ejercicio 2: Lectura Estructurada de CSV ---")
resultados = procesar_csv_a_mapas(DATOS_CSV_BRUTOS)

print("Datos CSV Brutos:")
print(DATOS_CSV_BRUTOS)

print("\nEstructura de Datos Procesada (Lista de Mapas/Diccionarios):")
for fila in resultados:
    print(fila)

# Ejemplo de uso de la estructura en memoria:
print(f"\nNombre del segundo usuario: {resultados[1]['Nombre']}")
print(f"Ciudad del cuarto usuario: {resultados[3]['Ciudad']}")