def busqueda_binaria(lista_ordenada, valor_buscado):
  """
  Implementa la Búsqueda Binaria (O(log n)).

  Args:
    lista_ordenada (list): La lista de elementos, DEBE estar ordenada.
    valor_buscado: El elemento que se quiere encontrar.

  Returns:
    int: El índice del elemento si se encuentra, o -1 si no está.
  """
  
  # 1. Definir los límites de búsqueda
  inicio = 0
  fin = len(lista_ordenada) - 1
  
  # Mientras el puntero de inicio no haya pasado al de fin
  while inicio <= fin:
    
    # 2. Calcular el punto medio (división entera)
    # Se usa (fin - inicio) // 2 + inicio para evitar un posible overflow en otros lenguajes
    medio = (inicio + fin) // 2 
    
    # 3. Comprobar el elemento del medio
    if lista_ordenada[medio] == valor_buscado:
      return medio  # ¡Encontrado!
      
    elif lista_ordenada[medio] < valor_buscado:
      # El valor buscado está en la mitad derecha. Descartamos la izquierda.
      inicio = medio + 1
      
    else: # lista_ordenada[medio] > valor_buscado
      # El valor buscado está en la mitad izquierda. Descartamos la derecha.
      fin = medio - 1
      
  # 4. Si el bucle termina, el valor no fue encontrado
  return -1

# --- Zona de Pruebas ---
lista = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
print(f"Buscando 23 (esperado 5): {busqueda_binaria(lista, 23)}")
print(f"Buscando 91 (esperado 9): {busqueda_binaria(lista, 91)}")
print(f"Buscando 7 (esperado -1): {busqueda_binaria(lista, 7)}")