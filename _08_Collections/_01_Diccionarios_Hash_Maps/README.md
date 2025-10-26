# Ejercicio 1: Diccionarios (Hash Maps) y Eficiencia O(1)

## 🎯 Objetivo
Comprender la eficiencia **$\mathcal{O}(1)$ (Constante)** de las estructuras de **Mapeo Clave-Valor (Diccionarios, Hash Maps)** para las operaciones fundamentales de búsqueda e inserción.

## 📝 Instrucciones
1.  **FUNCIÓN: `contar_frecuencia_elementos(lista_de_elementos)`**
2.  La función debe tomar una lista de elementos (ej: palabras, números).
3.  Utiliza una estructura **Hash Map** (Diccionario) para almacenar el conteo.
    * **Clave:** El elemento único.
    * **Valor:** La frecuencia (el número de veces que aparece).
4.  Itera sobre la lista de entrada. En cada paso, utiliza la lógica de **$\mathcal{O}(1)$** para:
    * **Buscar** si el elemento ya está en el mapa.
    * Si está, **actualizar** su valor.
    * Si no está, **insertarlo** con el valor inicial de 1.
5.  Devuelve el mapa resultante.

## 🔑 Conceptos Clave Universales
* **Hashing:** Es la técnica que permite que estas estructuras sean increíblemente rápidas. Una función matemática transforma la **Clave** en una dirección de memoria (hash/índice).
* **Eficiencia:** Gracias al hashing, buscar, insertar o eliminar un elemento toma tiempo **constante** en el caso promedio ($\mathcal{O}(1)$), sin importar qué tan grande sea la colección.

## ✅ Lógica Universal

FUNCION contar_frecuencia_elementos(ListaElementos): MapaFrecuencia = Crear Nuevo Mapa Vacio

PARA CADA elemento EN ListaElementos:
    SI MapaFrecuencia CONTIENE elemento:    // Busqueda O(1)
        MapaFrecuencia[elemento] = MapaFrecuencia[elemento] + 1 // Actualización O(1)
    SINO:
        MapaFrecuencia[elemento] = 1 // Inserción O(1)

DEVOLVER MapaFrecuencia