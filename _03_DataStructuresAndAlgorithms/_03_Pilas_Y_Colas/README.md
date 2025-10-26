# 🛒 03 - Pilas (Stacks) y Colas (Queues)

Estas estructuras de datos se construyen a menudo sobre **Listas/Arrays**, pero imponen reglas muy estrictas sobre cómo puedes añadir o quitar elementos.

---

## 🏗️ 1. La Pila (Stack) - LIFO

Una Pila funciona bajo el principio **LIFO (Last-In, First-Out)**, que significa: **El Último en Entrar es el Primero en Salir**.

Piensa en una **pila de platos**: solo puedes añadir o quitar el plato de la cima.

### ⚙️ Operaciones Clave
| Operación | Significado | Complejidad |
| :---: | :--- | :---: |
| **`push`** | Añadir un elemento a la cima. | $\mathcal{O}(1)$ |
| **`pop`** | Quitar el elemento de la cima. | $\mathcal{O}(1)$ |
| **`peek`** | Mirar el elemento de la cima sin quitarlo. | $\mathcal{O}(1)$ |

### 💡 Usos Comunes
* La función **"Deshacer" (Undo)** de los programas.
* El **historial** de una página web (el botón "Atrás").
* La gestión de llamadas a funciones en la memoria (Call Stack).

---

## 🚂 2. La Cola (Queue) - FIFO

Una Cola funciona bajo el principio **FIFO (First-In, First-Out)**, que significa: **El Primero en Entrar es el Primero en Salir**.

Piensa en una **fila para el tren**: el primero que llega es el primero que avanza.

### ⚙️ Operaciones Clave
| Operación | Significado | Complejidad |
| :---: | :--- | :---: |
| **`enqueue`** | Añadir un elemento al final de la cola. | $\mathcal{O}(1)$ |
| **`dequeue`** | Quitar el elemento del frente de la cola. | $\mathcal{O}(1)$ |
| **`peek`** | Mirar el elemento del frente sin quitarlo. | $\mathcal{O}(1)$ |

### 💡 Usos Comunes
* Las **colas de impresión** de una impresora.
* El procesamiento de mensajes en orden (por ejemplo, en sistemas de chat).
* Algoritmos de búsqueda como el **BFS** (Búsqueda en Anchura).

---