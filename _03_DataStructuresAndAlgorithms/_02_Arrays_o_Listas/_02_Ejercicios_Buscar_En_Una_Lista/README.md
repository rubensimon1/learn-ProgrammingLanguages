# Ejercicio 2: Búsqueda Lineal (O(n))

## 🎯 Objetivo
Implementar el algoritmo de **Búsqueda Lineal** desde cero.

Este algoritmo consiste en recorrer la lista elemento por elemento de principio a fin, hasta encontrar el valor deseado.

## 📝 Instrucciones
1.  Crea una función llamada `busqueda_lineal`.
2.  La función debe aceptar dos parámetros: `lista` (la lista donde buscar) y `valor_buscado`.
3.  Debe devolver el **índice** (la posición) donde se encuentra el `valor_buscado`.
4.  Si el valor no se encuentra en la lista, la función debe devolver **-1**.

## 🧐 Análisis de Complejidad
¿Cuál es la complejidad Big O en el **peor caso**? 
El peor caso es cuando el elemento está al final o no está. Tienes que mirar todos los $N$ elementos. Por lo tanto, es **$\mathcal{O}(n)$** (Lineal).

## ✅ Ejemplos
- `busqueda_lineal([10, 20, 30, 40], 30)` debe devolver `2`.
- `busqueda_lineal(['a', 'b', 'c', 'd'], 'a')` debe devolver `0`.
- `busqueda_lineal([5, 8, 12], 99)` debe devolver `-1`.

---

### `solucion.py` para el Ejercicio 2 (Estructura base)

```python
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