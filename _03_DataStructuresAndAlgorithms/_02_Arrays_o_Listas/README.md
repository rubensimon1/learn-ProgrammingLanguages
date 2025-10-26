# 📚 02 - Arrays y Listas (La Base de Todo)

Los Arrays (o Listas en Python) son la estructura de datos más fundamental. Si dominas esto, has dominado la base de cómo la memoria se organiza en tu programa.

## ¿Qué es una Lista/Array?

Imagina una **cajonera** donde cada cajón tiene una etiqueta con un **número** (el **índice**), empezando siempre desde el **0**. Cada cajón guarda un solo valor.

| Índice (Etiqueta) | 0 | 1 | 2 | 3 |
| :---: | :---: | :---: | :---: | :---: |
| Valor | "Manzana" | 10 | True | "Uva" |

## 🔑 Propiedades Clave

1.  **Acceso Rápido ($\mathcal{O}(1)$):** Podemos ir directamente al cajón número 2 sin mirar los demás. Esto hace que buscar o leer un elemento por su índice sea instantáneo.
2.  **Tamaño Fijo/Semi-Fijo:** En muchos lenguajes (como Java o C), su tamaño es fijo. En Python, las Listas son más flexibles, pero conceptualmente siguen siendo colecciones ordenadas y contiguas.
3.  **Inserción/Eliminación Lenta ($\mathcal{O}(n)$):** Si quieres meter un nuevo cajón entre el 1 y el 2, tienes que mover todos los cajones siguientes. Esto es lento.

## 🎯 Ejercicios en esta Sección

* **01-Ejercicio-Acceder-a-un-elemento:** Practicar el acceso constante $\mathcal{O}(1)$.
* **02-Ejercicio-Buscar-en-una-lista:** Implementar la Búsqueda Lineal $\mathcal{O}(n)$.