def ordenamiento_burbuja(lista_desordenada):
  """
  Implementa el Bubble Sort (O(n^2)).

  Args:
    lista_desordenada (list): La lista de números a ordenar.

  Returns:
    list: La lista ordenada.
  """
  n = len(lista_desordenada)
  
  # Bucle exterior: Itera N veces para asegurar que todo esté ordenado
  # En cada pasada, el elemento más grande "burbujea" hasta su posición final.
  for i in range(n):
    
    # Bucle interior: Recorre la lista y compara pares adyacentes.
    # No necesitamos revisar los últimos 'i' elementos, ya que ya están en su lugar.
    for j in range(0, n - i - 1):
      
      # Compara el par adyacente:
      if lista_desordenada[j] > lista_desordenada[j + 1]:
        
        # Intercambio de elementos:
        # Python permite hacer esto en una sola línea de forma muy limpia.
        lista_desordenada[j], lista_desordenada[j + 1] = lista_desordenada[j + 1], lista_desordenada[j]

  return lista_desordenada

# --- Zona de Pruebas ---
lista1 = [5, 1, 4, 2, 8]
print(f"Lista original: {lista1}")
print(f"Lista ordenada: {ordenamiento_burbuja(lista1)}")

lista2 = [10, 1, 5, 2, 8, 15, 3]
print(f"Lista original: {lista2}")
print(f"Lista ordenada: {ordenamiento_burbuja(lista2)}")