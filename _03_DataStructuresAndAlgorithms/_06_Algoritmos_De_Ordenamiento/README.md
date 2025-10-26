# 🛠️ 06 - Algoritmos de Ordenamiento (Sorting)

Los algoritmos de ordenamiento se encargan de organizar los elementos de una colección (como una lista) siguiendo un orden específico (ascendente o descendente).

Una lista ordenada es mucho más útil para la búsqueda y el procesamiento de datos.

---

## ⚔️ Clasificación de Algoritmos

Los algoritmos de ordenamiento se dividen en dos grandes grupos según su eficiencia:

### 1. Algoritmos Simples (Para Aprender Lógica)
Son fáciles de entender y codificar, pero **ineficientes** para listas grandes.

| Algoritmo | Complejidad | Idea Simple |
| :---: | :---: | :--- |
| **Bubble Sort** | $\mathcal{O}(n^2)$ | Repetidamente intercambia elementos adyacentes si están en el orden incorrecto. |
| **Selection Sort** | $\mathcal{O}(n^2)$ | Busca el elemento más pequeño y lo pone al principio. Repite con el resto. |
| **Insertion Sort** | $\mathcal{O}(n^2)$ | Construye la lista ordenada tomando elementos uno por uno y colocándolos en su lugar. |

### 2. Algoritmos Eficientes (Para Uso Profesional)
Son más complejos, pero son los que se usan en la vida real porque son **mucho más rápidos** con grandes volúmenes de datos.

| Algoritmo | Complejidad | Idea Simple |
| :---: | :---: | :--- |
| **Merge Sort** | $\mathcal{O}(n \log n)$ | Divide la lista a la mitad repetidamente y luego fusiona las mitades de forma ordenada. |
| **Quick Sort** | $\mathcal{O}(n \log n)$ | Elige un elemento (**Pivote**) y particiona la lista en dos: menores que el pivote, y mayores que el pivote. |

---

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Bubble-Sort:** Implementar el algoritmo cuadrático ($\mathcal{O}(n^2)$).
* **02-Ejercicio-Quick-Sort:** Implementar el algoritmo eficiente ($\mathcal{O}(n \log n)$).