# Ejercicio 1: Búsqueda Lineal (Linear Search)

## 🎯 Objetivo
Implementar el algoritmo de **Búsqueda Lineal**. Este es el algoritmo de búsqueda más simple, que funciona en **cualquier lista**, esté o no ordenada.

## 📝 Instrucciones
1.  Crea una función llamada `busqueda_lineal`.
2.  La función debe aceptar dos parámetros: `lista` (la lista donde buscar) y `valor_buscado`.
3.  La función debe recorrer la lista elemento por elemento.
4.  Si encuentra el `valor_buscado`, debe devolver el **índice** (la posición) donde se encontró.
5.  Si la lista se recorre completamente sin encontrar el valor, la función debe devolver **-1**.

## 🧐 Análisis de Complejidad
En el peor caso (si el elemento está al final o no está), debemos revisar todos los $N$ elementos de la lista. Por lo tanto, la complejidad es **$\mathcal{O}(n)$ (Lineal)**.

## ✅ Ejemplos
- `busqueda_lineal([10, 20, 30, 40], 30)` debería devolver `2`.
- `busqueda_lineal([5, 8, 12, 99], 5)` debería devolver `0`.
- `busqueda_lineal(['a', 'b', 'c'], 'z')` debería devolver `-1`.