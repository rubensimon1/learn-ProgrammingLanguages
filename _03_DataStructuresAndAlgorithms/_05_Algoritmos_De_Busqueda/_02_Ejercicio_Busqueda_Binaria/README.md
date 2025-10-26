# Ejercicio 2: Búsqueda Binaria ($\mathcal{O}(\log n)$)

## 🎯 Objetivo
Implementar el algoritmo de **Búsqueda Binaria**. Este algoritmo requiere que la lista de entrada esté **ordenada**.

## 📝 Instrucciones
1.  Crea una función llamada `busqueda_binaria`.
2.  La función debe aceptar dos parámetros: `lista_ordenada` y `valor_buscado`.
3.  Define dos punteros: `inicio` (índice 0) y `fin` (último índice de la lista).
4.  Mientras `inicio` sea menor o igual a `fin`, calcula el punto **medio**.
5.  Compara el elemento del medio con el `valor_buscado`:
    * Si son iguales, devuelve el índice medio.
    * Si el valor medio es **menor** que el buscado, descarta la mitad izquierda moviendo el `inicio`.
    * Si el valor medio es **mayor** que el buscado, descarta la mitad derecha moviendo el `fin`.
6.  Si el bucle termina, devuelve **-1** (no se encontró el valor).

## 🧐 Análisis de Complejidad
Gracias a que en cada paso descartamos la mitad de los datos restantes, la complejidad es **$\mathcal{O}(\log n)$ (Logarítmica)**.

## ✅ Ejemplos
- `busqueda_binaria([2, 5, 8, 12, 16], 12)` debería devolver `3`.
- `busqueda_binaria([10, 20, 30, 40, 50], 10)` debería devolver `0`.
- `busqueda_binaria([5, 8, 12], 99)` debería devolver `-1`.