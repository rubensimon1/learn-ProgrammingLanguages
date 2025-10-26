# Ejercicio 2: Conjuntos (Sets) y Operaciones Matemáticas

## 🎯 Objetivo
Aprender a usar la estructura de **Conjunto (Set)** para almacenar elementos **únicos** y realizar **operaciones de la teoría de conjuntos** (unión, intersección, diferencia) de manera eficiente.

## 📝 Instrucciones
1.  **FUNCIÓN: `analizar_colecciones(ColeccionA, ColeccionB)`**
2.  La función debe aceptar dos colecciones (Listas) de elementos.
3.  El primer paso es convertirlas a estructuras de **Conjunto (Set)** para asegurar la **unicidad** y preparar las operaciones.
4.  La función debe realizar y devolver los resultados de las siguientes operaciones de conjuntos:
    * **Solo en A (Diferencia):** Elementos que están en A pero NO en B.
    * **En Ambos (Intersección):** Elementos que están presentes tanto en A como en B.
    * **Todos Únicos (Unión):** Todos los elementos únicos de ambas colecciones combinadas.

## 🔑 Conceptos Clave Universales
* **Propiedad de Unicidad:** La principal característica de un Set es que automáticamente elimina duplicados.
* **Eficiencia de Operaciones:** Las operaciones de conjuntos están altamente optimizadas (basadas en hashing), siendo muy rápidas ($\mathcal{O}(n)$, donde $n$ es el total de elementos) en comparación con hacer lo mismo con bucles anidados en listas ($\mathcal{O}(n^2)$).

## ✅ Lógica Universal

FUNCION analizar_colecciones(ListaA, ListaB): SetA = Convertir(ListaA) a Conjunto SetB = Convertir(ListaB) a Conjunto

Resultado = Nuevo Mapa Vacio

// Diferencia: A - B
Resultado["solo_A"] = SetA.Diferencia(SetB) 

// Intersección: A ∩ B
Resultado["en_ambos"] = SetA.Interseccion(SetB) 

// Unión: A ∪ B
Resultado["todos_unicos"] = SetA.Union(SetB) 

DEVOLVER Resultado