# 🌳 07 - Árboles (Trees)

Los Árboles son estructuras de datos no lineales que representan datos de forma **jerárquica**. Son esenciales para modelar sistemas de archivos, sintaxis de lenguajes y optimizar búsquedas.

## 🌲 Conceptos Fundamentales

Imagina un árbol genealógico o la estructura de carpetas de tu ordenador:

* **Raíz (Root):** El nodo superior, el punto de inicio del árbol. (Ej: La carpeta C:\)
* **Nodos:** Cada elemento que contiene un dato.
* **Hijos:** Nodos directamente conectados y debajo de otro nodo.
* **Padre:** El nodo que está directamente conectado y encima de otro nodo.
* **Hoja (Leaf):** Un nodo que no tiene hijos.

## 🔍 El Árbol Binario de Búsqueda (BST)

Un **Árbol Binario de Búsqueda (Binary Search Tree - BST)** es un tipo especial de árbol que sigue una regla estricta para que la búsqueda sea rápida:

1.  Cada nodo puede tener **como máximo dos hijos** (izquierda y derecha).
2.  Todos los valores en el **sub-árbol IZQUIERDO** deben ser **MENORES** que el valor del nodo padre.
3.  Todos los valores en el **sub-árbol DERECHO** deben ser **MAYORES** que el valor del nodo padre.

Esta regla permite buscar un elemento en tiempo **$\mathcal{O}(\log n)$**, ¡igual que la Búsqueda Binaria!

## 🚶 Recorridos (Traversal)

Hay tres formas principales de visitar todos los nodos de un árbol. Aprenderlas es vital:

| Recorrido | Orden de Visita | Uso Común |
| :---: | :--- | :--- |
| **In-order** | Izquierda $\rightarrow$ Raíz $\rightarrow$ Derecha | Devuelve los elementos del BST **ordenados**. |
| **Pre-order** | Raíz $\rightarrow$ Izquierda $\rightarrow$ Derecha | Útil para copiar o serializar la estructura del árbol. |
| **Post-order** | Izquierda $\rightarrow$ Derecha $\rightarrow$ Raíz | Útil para eliminar o liberar memoria del árbol. |

---

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Crear-un-Arbol-Binario:** Implementar las clases de Nodo y las funciones de inserción y recorrido `in-order`.