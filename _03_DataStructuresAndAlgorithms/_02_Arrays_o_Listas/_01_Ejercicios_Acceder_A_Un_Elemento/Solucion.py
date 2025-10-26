def obtener_elemento(lista, posicion):
  """
  Accede a un elemento de la lista por su índice. 
  Complejidad: O(1)

  Args:
    lista (list): La lista de elementos.
    posicion (int): El índice del elemento deseado.

  Returns:
    El elemento en la posición o None si el índice es inválido.
  """

  # En Python, el acceso directo se hace con lista[indice].
  # Para manejar el caso del índice inválido de forma segura, usamos un bloque try-except.

  try:
    # 1. Intenta acceder al elemento
    return lista[posicion]
  except IndexError:
    # 2. Si el índice no existe (IndexError), devuelve None
    return None
  
# --- Zona de Pruebas ---
mi_lista = ['Manzana', 'Pera', 'Naranja']
print(f"Elemento en el índice 1: {obtener_elemento(mi_lista, 1)}")
print(f"Elemento en el índice 0: {obtener_elemento(mi_lista, 0)}")
print(f"Elemento en el índice 10: {obtener_elemento(mi_lista, 10)}")