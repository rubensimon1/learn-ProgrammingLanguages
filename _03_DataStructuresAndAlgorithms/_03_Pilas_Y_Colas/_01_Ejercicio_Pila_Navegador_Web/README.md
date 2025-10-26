# Ejercicio 1: Simulación de Historial Web (PILA)

## 🎯 Objetivo
Simular el historial de navegación de un navegador web usando la estructura de **PILA**.

El historial debe permitir visitar páginas y luego "retroceder" a la página anterior.

## 📝 Instrucciones
1.  Crea una clase llamada `HistorialWeb`.
2.  Debe tener una lista interna (la pila) para almacenar las URLs visitadas.
3.  Implementa el método **`visitar_pagina(url)`**: Añade la URL a la pila (simula el `push`).
4.  Implementa el método **`retroceder()`**: Quita y devuelve la última URL visitada (simula el `pop`). Si la pila está vacía, devuelve el mensaje `"No hay más historial."`.

## 🧐 Análisis de Complejidad
Las operaciones de añadir al final de una lista de Python y quitar del final son **$\mathcal{O}(1)$ (Constante)**. Tu solución debe mantener esta eficiencia.

## ✅ Ejemplo de Uso
1.  `visitar_pagina("google.com")`
2.  `visitar_pagina("github.com")`
3.  `retroceder()` -> Devuelve `"github.com"`
4.  `retroceder()` -> Devuelve `"google.com"`
5.  `retroceder()` -> Devuelve `"No hay más historial."`