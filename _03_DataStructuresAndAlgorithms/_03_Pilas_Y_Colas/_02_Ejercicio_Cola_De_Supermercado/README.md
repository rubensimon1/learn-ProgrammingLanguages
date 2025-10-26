# Ejercicio 2: Simulación de Cajero de Supermercado (COLA)

## 🎯 Objetivo
Simular la gestión de clientes en un cajero de supermercado usando la estructura de **COLA**.

La cola debe garantizar que el cliente que llegó primero sea el primero en ser atendido.

## 📝 Instrucciones
1.  Crea una clase llamada `CajeroSupermercado`.
2.  Debe tener una lista interna (la cola) para almacenar los nombres de los clientes.
3.  Implementa el método **`llega_cliente(nombre)`**: Añade un cliente al final de la cola (simula el `enqueue`).
4.  Implementa el método **`atender_cliente()`**: Quita y devuelve el cliente que está al frente de la cola (simula el `dequeue`). Si la cola está vacía, devuelve el mensaje `"No hay clientes esperando."`.

## 🧐 Análisis de Complejidad
Para que una cola sea eficiente, tanto añadir al final como quitar del principio deben ser **$\mathcal{O}(1)$**.

> **⚠️ Advertencia en Python:** Quitar el primer elemento de una lista (`lista.pop(0)`) es $\mathcal{O}(n)$, lo cual es ineficiente para una cola. Para una Cola real en Python, es mejor usar `collections.deque` o implementar tu propia lógica eficiente. **Para este ejercicio, usaremos `list.pop(0)` para simplificar el código, pero ten en cuenta que no es la solución O(1) ideal.**

## ✅ Ejemplo de Uso
1.  `llega_cliente("Alice")`
2.  `llega_cliente("Bob")`
3.  `atender_cliente()` -> Devuelve `"Alice"`
4.  `llega_cliente("Charlie")`
5.  `atender_cliente()` -> Devuelve `"Bob"`