# EJERCICIO 1: DICCIONARIOS / HASH MAPS (LÓGICA UNIVERSAL)
# Objetivo: Contar la frecuencia de elementos, demostrando la eficiencia O(1) de los Hash Maps.

def contar_frecuencia_elementos(lista_de_elementos):
    """
    Cuenta la frecuencia de cada elemento en la lista usando un Hash Map (O(n)).

    Args:
    lista_de_elementos (list): Elementos a contar.

    Returns:
    dict: Mapa donde la clave es el elemento y el valor es la frecuencia.
    """
    
    # 1. Inicializar el Hash Map
    mapa_frecuencia = {} # Equivale a HashMap, Dictionary, std::map
    
    # 2. Iterar sobre la lista
    for elemento in lista_de_elementos:
        # La BÚSQUEDA y la INSERCIÓN/ACTUALIZACIÓN son O(1) en promedio.
        if elemento in mapa_frecuencia:
            mapa_frecuencia[elemento] += 1
        else:
            mapa_frecuencia[elemento] = 1
            
    return mapa_frecuencia

# --- Zona de Pruebas ---
elementos = ["manzana", "banana", "manzana", "uva", "banana", "manzana"]
frecuencia_final = contar_frecuencia_elementos(elementos)

print("--- Ejercicio 1: Hash Map / O(1) ---")
print(f"Lista: {elementos}")
print("Frecuencia (Mapa):")
for clave, valor in frecuencia_final.items():
    print(f"'{clave}': {valor}")

# Demostración de O(1) en búsqueda:
print(f"\nBuscar 'banana' (O(1)): {frecuencia_final.get('banana', 0)} veces.")