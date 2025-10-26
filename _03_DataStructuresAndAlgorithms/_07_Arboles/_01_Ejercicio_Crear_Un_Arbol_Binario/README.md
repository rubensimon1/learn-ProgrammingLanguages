# Ejercicio 1: Creación de un Árbol Binario de Búsqueda (BST)

## 🎯 Objetivo
Implementar las clases `Nodo` y `BST` (Árbol Binario de Búsqueda) y las funciones de **inserción** y **recorrido `in-order`**.

## 📝 Instrucciones (Parte 1: Estructura e Inserción)
1.  Crea una clase `Nodo` que contenga un `valor` y punteros `izquierda` y `derecha` (inicialmente `None`).
2.  Crea una clase `BST` que solo contenga el puntero a la `raiz`.
3.  Implementa el método `insertar(valor)` dentro de la clase `BST` de forma **recursiva** o **iterativa**, siguiendo la regla BST:
    * Si el valor es menor, ve a la izquierda.
    * Si el valor es mayor, ve a la derecha.

## 📝 Instrucciones (Parte 2: Recorrido In-order)
4.  Implementa una función `recorrido_inorder(nodo)` que, dado un nodo, visite todos los nodos de la siguiente forma:
    * Visita el sub-árbol **IZQUIERDO**.
    * Procesa la **RAÍZ** (imprime el valor).
    * Visita el sub-árbol **DERECHO**.

## 🧐 Análisis de Complejidad
* **Inserción y Búsqueda:** En un BST bien balanceado, es **$\mathcal{O}(\log n)$**. En el peor caso (si insertas todo en orden), degenera a $\mathcal{O}(n)$.
* **Recorridos:** Visita cada nodo exactamente una vez, por lo que es **$\mathcal{O}(n)$**.

## ✅ Ejemplo de Inserción y Recorrido
1.  Insertar: 50, 30, 70, 20, 40, 60, 80
2.  Recorrido In-order: Debería imprimir: `20 30 40 50 60 70 80` (¡la lista ordenada!)