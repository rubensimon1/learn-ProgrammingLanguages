# Ejercicio 1: Implementación de un Grafo No Dirigido

## 🎯 Objetivo
Implementar una clase `Grafo` simple utilizando la **Lista de Adyacencia** y métodos para añadir vértices y aristas.

## 📝 Instrucciones
1.  Crea una clase `Grafo`.
2.  En el constructor (`__init__`), inicializa la `lista_adyacencia` como un diccionario vacío de Python.
3.  Implementa el método **`agregar_vertice(vertice)`**:
    * Añade el `vertice` como una nueva clave al diccionario, asignándole una lista vacía de vecinos.
4.  Implementa el método **`agregar_arista(v1, v2)`**:
    * Asume un **Grafo No Dirigido**. Esto significa que si `v1` se conecta a `v2`, `v2` también se conecta a `v1`.
    * Añade `v2` a la lista de vecinos de `v1`.
    * Añade `v1` a la lista de vecinos de `v2`.

## 🧐 Análisis de Complejidad
* **Agregar Vértice:** $\mathcal{O}(1)$ (Agregar una clave a un diccionario).
* **Agregar Arista:** $\mathcal{O}(1)$ (Añadir un elemento al final de una lista).

## ✅ Ejemplo de Uso
1.  `agregar_vertice("A")`, `agregar_vertice("B")`
2.  `agregar_arista("A", "B")`
3.  **Lista de Adyacencia final:** `{'A': ['B'], 'B': ['A']}`