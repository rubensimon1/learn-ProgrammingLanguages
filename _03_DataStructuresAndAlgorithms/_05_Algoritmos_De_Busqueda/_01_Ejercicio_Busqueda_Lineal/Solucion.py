def busqueda_lineal(lista, valor_buscado):
  """
  Implementa la Búsqueda Lineal (O(n)).

  Args:
    lista (list): La lista a recorrer. No necesita estar ordenada.
    valor_buscado: El elemento que se quiere encontrar.

  Returns:
    int: El índice del elemento si se encuentra, o -1 si no está.
  """

  # Itera sobre la lista. La función 'enumerate' te da el índice y el valor.
  for indice, elemento in enumerate(lista):
    
    # 1. Compara el elemento actual con el valor buscado.
    if elemento == valor_buscado:
      # 2. Si es igual, devuelve el índice inmediatamente y la función termina.
      return indice

  # 3. Si el bucle termina, el valor no fue encontrado.
  return -1

# --- Zona de Pruebas ---
numeros = [10, 20, 30, 40]
letras = ['a', 'b', 'c']

print(f"Buscando 30 (esperado 2): {busqueda_lineal(numeros, 30)}")
print(f"Buscando 'c' (esperado 2): {busqueda_lineal(letras, 'c')}")
print(f"Buscando 99 (esperado -1): {busqueda_lineal(numeros, 99)}")