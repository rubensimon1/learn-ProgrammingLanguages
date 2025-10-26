# Ejercicio 1: Bubble Sort (Ordenamiento Burbuja)

## 🎯 Objetivo
Implementar el algoritmo **Bubble Sort**. El nombre viene de que los elementos más grandes "flotan" o "suben" lentamente al final de la lista, como burbujas.

## 📝 Instrucciones
1.  Crea una función llamada `ordenamiento_burbuja`.
2.  La función debe aceptar un parámetro: `lista_desordenada`.
3.  Necesitarás **dos bucles anidados**:
    * El bucle exterior controla cuántas veces revisas la lista.
    * El bucle interior recorre la lista y compara pares de elementos adyacentes.
4.  Si el elemento actual es **mayor** que el siguiente, **intercámbialos**.
5.  La función debe modificar y devolver la lista ya ordenada.

## 🧐 Análisis de Complejidad
Debido a los dos bucles anidados, donde el bucle interior se ejecuta $N$ veces por cada una de las $N$ veces del bucle exterior, la complejidad es **$\mathcal{O}(n^2)$ (Cuadrática)**. Es el algoritmo más lento, ¡pero el mejor para entender la lógica del ordenamiento!

## ✅ Ejemplos
- `ordenamiento_burbuja([5, 1, 4, 2, 8])` debería devolver `[1, 2, 4, 5, 8]`.
- `ordenamiento_burbuja([10, 1, 5])` debería devolver `[1, 5, 10]`.