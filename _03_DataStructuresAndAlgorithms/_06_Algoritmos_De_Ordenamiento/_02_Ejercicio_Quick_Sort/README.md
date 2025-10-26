# Ejercicio 2: Quick Sort (Ordenamiento Rápido)

## 🎯 Objetivo
Implementar el algoritmo **Quick Sort**. Este es uno de los algoritmos más rápidos y se basa en la estrategia "Divide y Vencerás" (Divide and Conquer).

## 📝 Instrucciones
La versión más simple (y didáctica) de Quick Sort en Python utiliza recursión y filtrado de listas:

1.  Crea una función llamada `quick_sort`.
2.  La función debe aceptar un parámetro: `lista`.
3.  Establece la **condición base de la recursión**: Si la lista tiene 0 o 1 elemento, ya está ordenada, así que devuélvela.
4.  Elige un elemento de la lista y llámalo **Pivote** (puedes usar el primer elemento).
5.  Divide la lista en tres partes:
    * `menores`: Elementos menores que el Pivote.
    * `iguales`: Elementos iguales al Pivote.
    * `mayores`: Elementos mayores que el Pivote.
6.  Aplica **recursivamente** `quick_sort` a las listas `menores` y `mayores`.
7.  Combina los resultados finales: `quick_sort(menores) + iguales + quick_sort(mayores)`.

## 🧐 Análisis de Complejidad
* **Caso Promedio:** $\mathcal{O}(n \log n)$ (Muy rápido).
* **Peor Caso:** $\mathcal{O}(n^2)$ (Si el Pivote es siempre el elemento más pequeño o más grande, lo que es raro en la práctica).

Por su velocidad en el caso promedio, es el algoritmo de ordenamiento más usado en muchas bibliotecas de lenguajes de programación.

## ✅ Ejemplos
- `quick_sort([3, 6, 8, 1, 2, 1])` debería devolver `[1, 1, 2, 3, 6, 8]`.
- `quick_sort([9, 3, 7, 2])` debería devolver `[2, 3, 7, 9]`.