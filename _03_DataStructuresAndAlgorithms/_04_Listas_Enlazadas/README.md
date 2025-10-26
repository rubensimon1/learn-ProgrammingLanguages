# 🔗 04 - Listas Enlazadas (Linked Lists)

La Lista Enlazada es una de las estructuras más importantes para entender cómo manejar la memoria de forma **dinámica**. A diferencia de los Arrays (que usan espacio contiguo), las Listas Enlazadas pueden estar dispersas por la memoria.

## ¿Qué es una Lista Enlazada?

Imagina un **Juego de la Oca o una Cadena**:

* Se compone de **Nodos**.
* Cada **Nodo** tiene dos cosas:
    1.  El **Valor** (el dato que guarda).
    2.  Un **Puntero** (una flecha que apunta al siguiente Nodo en la secuencia).

El inicio de la lista siempre se llama **'Head'** (cabeza).

## 🚀 Propiedades Clave (Ventajas y Desventajas)

| Operación | Arrays (Listas de Python) | Listas Enlazadas | Observaciones |
| :---: | :---: | :---: | :--- |
| **Acceso/Búsqueda** | $\mathcal{O}(1)$ (Instantáneo) | $\mathcal{O}(n)$ (Tienes que recorrerla) | La gran debilidad de la Lista Enlazada. |
| **Inserción/Eliminación** | $\mathcal{O}(n)$ (Hay que mover elementos) | $\mathcal{O}(1)$ (Solo hay que cambiar 2 punteros) | La gran ventaja de la Lista Enlazada. |
| **Uso de Memoria** | Contigua (Bloque de memoria fijo) | Dispersa (Memoria dinámica y flexible) | Ideal cuando no sabes cuántos elementos tendrás. |

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Crear-e-invertir-lista:** Implementar las clases básicas de la lista y un algoritmo clásico de inversión.