# 📦 08 - Colecciones y Estructuras de Datos Nativas

Esta sección se centra en las **estructuras de datos internas** (o nativas) que todo lenguaje de programación moderno proporciona. Entender cómo funcionan por dentro es vital para la **eficiencia** y la elección correcta de la herramienta para cada tarea.

## 📊 Tipos de Colecciones Fundamentales (Lógica Universal)

| Colección | Concepto Lógico | Característica Clave | Eficiencia Típica (Búsqueda/Inserción) |
| :---: | :---: | :--- | :---: |
| **Lista/Array Dinámico** | Secuencia ordenada y mutable. | Permite duplicados. Acceso por índice. | Búsqueda: $\mathcal{O}(n)$, Acceso por índice: $\mathcal{O}(1)$ |
| **Diccionario/Hash Map** | Mapeo desordenado de **Clave-Valor**. | Las claves son únicas y se usan para el *hashing*. | Búsqueda/Inserción: $\mathcal{O}(1)$ (en promedio) |
| **Conjunto (Set)** | Colección desordenada de elementos **únicos**. | Ideal para verificar pertenencia y operaciones matemáticas. | Búsqueda/Inserción/Eliminación: $\mathcal{O}(1)$ (en promedio) |

---

## 🎯 Estructura de Ejercicios

* **01-Diccionarios-Hash-Maps:** Implementar el conteo de frecuencia para demostrar la eficiencia $\mathcal{O}(1)$ del *hashing*.
* **02-Conjuntos-Set-Operations:** Demostrar cómo las operaciones de conjuntos (unión, intersección, diferencia) son inherentemente más eficientes que los bucles.