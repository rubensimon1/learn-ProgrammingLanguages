# 🔍 05 - Algoritmos de Búsqueda

Los algoritmos de búsqueda son procedimientos que nos permiten encontrar la posición (índice) de un valor dentro de una colección de datos (como una lista).

Aprenderemos dos métodos fundamentales con rendimientos completamente distintos.

---

## 🚶‍♂️ 1. Búsqueda Lineal (Linear Search)

Este es el método más simple, pero también el menos eficiente.

* **Concepto:** Es como buscar una aguja en un pajar **desordenado**. Empiezas por el primer elemento y vas revisando uno por uno hasta encontrar lo que buscas.
* **Complejidad:** **$\mathcal{O}(n)$ (Lineal)**. En el peor caso (si el elemento está al final o no existe), tienes que revisar los $N$ elementos de la lista.

## ✂️ 2. Búsqueda Binaria (Binary Search)

Este es un algoritmo "inteligente" que solo funciona si la lista está **¡ORDENADA!**

* **Concepto:** Es como buscar una palabra en un **diccionario**. Abres por la mitad. Si tu palabra está antes, descartas la mitad derecha; si está después, descartas la mitad izquierda. ¡Repites este proceso hasta encontrarla!
* **Complejidad:** **$\mathcal{O}(\log n)$ (Logarítmica)**. Es extremadamente rápido porque en cada paso eliminas la mitad del problema.

| Algoritmo | ¿Lista Ordenada? | Complejidad | Velocidad |
| :---: | :---: | :---: | :---: |
| Lineal | ❌ No necesaria | $\mathcal{O}(n)$ | Lenta |
| Binaria | ✅ **OBLIGATORIO** | $\mathcal{O}(\log n)$ | **¡Muy Rápida!** |

---

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Busqueda-Lineal:** Implementar el método simple $\mathcal{O}(n)$.
* **02-Ejercicio-Busqueda-Binaria:** Implementar el método eficiente $\mathcal{O}(\log n)$.