def busqueda_lineal(lista, valor_buscado):
  """
  Implementa la Búsqueda Lineal (O(n)).

  Args:
    lista (list): La lista a recorrer.
    valor_buscado: El elemento que se quiere encontrar.

  Returns:
    int: El índice del elemento si se encuentra, o -1 si no está.
  """

  # Itera sobre la lista, obteniendo el índice y el elemento a la vez.
  for indice, elemento in enumerate(lista):
    
    # Compara si el elemento actual es el valor_buscado
    if elemento == valor_buscado:
      # Si lo encuentras, ¡devuelve el índice y termina la función!
      return indice

  # Si el bucle termina, significa que el valor_buscado no estaba en la lista.
  return -1

# --- Zona de Pruebas ---
print(f"30 está en el índice: {busqueda_lineal([10, 20, 30, 40], 30)}")
print(f"'a' está en el índice: {busqueda_lineal(['a', 'b', 'c', 'd'], 'a')}")
print(f"99 está en el índice: {busqueda_lineal([5, 8, 12], 99)}")