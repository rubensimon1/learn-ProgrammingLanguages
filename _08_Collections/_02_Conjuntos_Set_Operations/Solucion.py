# EJERCICIO 2: CONJUNTOS (SETS) Y OPERACIONES MATEMÁTICAS (LÓGICA UNIVERSAL)
# Objetivo: Demostrar las operaciones de conjuntos (Unión, Intersección, Diferencia)
# que son O(n) y mucho más rápidas que las implementaciones con Listas (O(n^2)).

def analizar_colecciones(coleccion_a, coleccion_b):
    """
    Compara dos colecciones usando Sets.

    Args:
    coleccion_a (list): La primera colección de elementos.
    coleccion_b (list): La segunda colección de elementos.

    Returns:
    dict: Resultados de las operaciones de conjuntos.
    """
    
    # 1. Convertir las colecciones a Conjuntos (Sets)
    set_a = set(coleccion_a) # Asegura unicidad
    set_b = set(coleccion_b) 
    
    # 2. Operaciones de Conjuntos (Set Operations - Lógica O(n)):
    
    # Diferencia (A - B): Elementos que están en A pero NO en B
    solo_en_a = set_a.difference(set_b)
    
    # Intersección (A ∩ B): Elementos comunes a A y B
    en_ambos = set_a.intersection(set_b)
    
    # Unión (A ∪ B): Todos los elementos únicos combinados
    todos_unicos = set_a.union(set_b)
    
    return {
        "solo_en_a": list(solo_en_a),
        "en_ambos": list(en_ambos),
        "todos_unicos": list(todos_unicos)
    }

# --- Zona de Pruebas ---
premium = ["Alice", "Bob", "Charlie", "Eve"]
antiguos = ["Bob", "David", "Charlie", "Frank", "Frank"] # Duplicado intencional

print("\n--- Ejercicio 2: Conjuntos (Sets) / O(n) ---")
print(f"Colección A (Premium): {premium}")
print(f"Colección B (Antiguos): {antiguos}")

resultados = analizar_colecciones(premium, antiguos)

print("\nResultados de Operaciones de Conjuntos:")
print(f"1. Solo en A (Diferencia): {resultados['solo_en_a']}")
print(f"2. En Ambos (Intersección): {resultados['en_ambos']}")
print(f"3. Todos Únicos (Unión): {resultados['todos_unicos']}")