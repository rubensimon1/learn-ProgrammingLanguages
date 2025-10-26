# Ejercicio 1: Creación e Inversión de una Lista Enlazada

## 🎯 Objetivo
Implementar las clases necesarias para crear una Lista Enlazada y luego escribir una función que invierta el orden de la lista.

## 📝 Instrucciones (Parte 1: Creación)
1.  Crea una clase `Nodo` que acepte un `valor` y tenga una referencia (puntero) `siguiente`, que inicialmente será `None`.
2.  Crea una clase `ListaEnlazada` que contenga solo el puntero inicial `cabeza` (`head`).
3.  Implementa un método `insertar_al_final(valor)` que añada un nuevo nodo al final de la lista.

## 📝 Instrucciones (Parte 2: Inversión)
4.  Implementa una función **fuera de la clase** llamada `invertir_lista(cabeza_inicial)`.
    * Esta función debe recorrer la lista y cambiar los punteros de los nodos para que apunten en la dirección opuesta.
    * Debe devolver la nueva `cabeza` (el nodo que antes era el final).

## 🧐 Análisis de Complejidad
La inversión de la lista requiere visitar cada nodo exactamente una vez para cambiar su puntero. Por lo tanto, su complejidad es **$\mathcal{O}(n)$ (Lineal)**.

## ✅ Ejemplo de Inversión
1.  **Lista Original:** `A -> B -> C -> None`
2.  **Lista Invertida:** `C -> B -> A -> None`