# Ejercicio 1: Acceso Directo por Índice ($\mathcal{O}(1)$)

## 🎯 Objetivo
El acceso por índice es la operación más rápida en una lista. Vamos a crear una función que demuestre este acceso constante.

## 📝 Instrucciones
1.  Crea una función llamada `obtener_elemento`.
2.  La función debe aceptar dos parámetros: `lista` y `posicion` (el índice que buscamos).
3.  La función debe devolver el valor almacenado en esa `posicion` de la `lista`.
4.  Si el índice es inválido (está fuera de los límites de la lista), la función debe devolver el valor `None`.

## 🧐 Análisis de Complejidad
Independientemente de si la lista tiene 10 elementos o 1 millón, el tiempo para encontrar el elemento en una posición conocida es el mismo. Por lo tanto, la complejidad es **$\mathcal{O}(1)$ (Constante)**.

## ✅ Ejemplos
- `obtener_elemento(['a', 'b', 'c'], 1)` debería devolver `'b'`.
- `obtener_elemento([10, 20, 30], 0)` debería devolver `10`.
- `obtener_elemento(['x', 'y'], 5)` debería devolver `None`.