# 🕸️ 08 - Grafos (Graphs)

Los Grafos son la estructura de datos más general y flexible. Permiten modelar cualquier tipo de **red** o relación no jerárquica (a diferencia de los árboles).

## 🗺️ Conceptos Fundamentales

Piensa en un mapa de carreteras, una red de amigos en Facebook o un circuito eléctrico:

* **Vértice (Vertex / Nodo):** Los puntos o elementos individuales. (Ej: Una ciudad, una persona).
* **Arista (Edge):** Las conexiones entre los vértices. (Ej: Una carretera, una amistad).
* **Peso:** Un valor asociado a la arista (opcional). (Ej: La distancia de la carretera o el costo de un vuelo).

## 📐 Tipos de Grafos

1.  **Dirigido (Directed):** Las aristas tienen una dirección. Si A está conectado a B, no significa que B esté conectado a A. (Ej: Un camino de ida).
2.  **No Dirigido (Undirected):** Las aristas son bidireccionales. Si A está conectado a B, B está conectado a A. (Ej: Una amistad mutua).

## 🗃️ Formas de Representar un Grafo

Hay dos maneras principales de almacenar un Grafo en la memoria:

1.  **Lista de Adyacencia (Adjacency List):**
    * Es la más común y eficiente para la mayoría de los grafos.
    * Usamos un **diccionario** donde la clave es un Vértice, y el valor es una **lista de todos sus vecinos** (vértices conectados).
2.  **Matriz de Adyacencia (Adjacency Matrix):**
    * Usamos una matriz (tabla bidimensional) donde la celda `[i][j]` indica si hay una arista entre el Vértice `i` y el Vértice `j` (con un 1 o un 0).

## 🚶 Algoritmos de Recorrido

Dos algoritmos vitales para explorar un Grafo:

| Algoritmo | Significado | Estructura que Usa | Complejidad |
| :---: | :--- | :---: | :---: |
| **BFS** | **Búsqueda en Anchura** (Breadth-First Search) | **Cola** (Queue) | $\mathcal{O}(V + E)$ |
| **DFS** | **Búsqueda en Profundidad** (Depth-First Search) | **Pila** (Stack) o Recursión | $\mathcal{O}(V + E)$ |
> *V es el número de Vértices y E es el número de Aristas.*

---

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Implementacion-Basica:** Crear la clase Grafo y el método para añadir aristas, usando la **Lista de Adyacencia**.