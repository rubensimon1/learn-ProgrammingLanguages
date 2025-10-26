def quick_sort(lista):
  """
  Implementa el Quick Sort (O(n log n) en promedio).

  Args:
    lista (list): La lista de números a ordenar.

  Returns:
    list: La lista ordenada.
  """
  
  # 1. Condición Base de la Recursión
  if len(lista) <= 1:
    return lista

  # 2. Elegir el Pivote (usamos el primer elemento para simplificar)
  pivote = lista[0]

  # 3. Dividir la lista en tres partes:
  # Creamos nuevas listas usando 'comprensión de listas' de Python.
  menores = [x for x in lista if x < pivote]
  iguales = [x for x in lista if x == pivote]
  mayores = [x for x in lista if x > pivote]

  # 4. Aplicar recursivamente Quick Sort a las partes menores y mayores
  # 5. Combinar los resultados finales
  return quick_sort(menores) + iguales + quick_sort(mayores)

# --- Zona de Pruebas ---
lista1 = [3, 6, 8, 1, 2, 1]
print(f"Lista original: {lista1}")
print(f"Lista ordenada: {quick_sort(lista1)}")

lista2 = [9, 3, 7, 2, 5, 4]
print(f"Lista original: {lista2}")
print(f"Lista ordenada: {quick_sort(lista2)}")