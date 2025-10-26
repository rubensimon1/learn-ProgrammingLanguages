# Ejercicio 4: Polimorfismo (Muchas Formas)

## 🎯 Objetivo
Aplicar el concepto de **Polimorfismo**, que significa "muchas formas". Es la habilidad de objetos de diferentes clases para responder a un mismo método de manera distinta.

## 📝 Instrucciones (Parte 1: Clase Padre)
1.  Crea una clase padre (superclase) llamada `Instrumento`.
2.  Define el constructor con un atributo: `nombre`.
3.  Implementa un método llamado **`tocar()`** que **no haga nada** (o imprima un mensaje genérico). Este será el método que será sobrescrito.

## 📝 Instrucciones (Parte 2: Subclases Polimórficas)
4.  Crea dos clases hijas: `Guitarra` y `Bateria`, que hereden de `Instrumento`.
5.  En cada subclase, **sobrescribe** (override) el método **`tocar()`** para que imprima un sonido específico de ese instrumento.
    * `Guitarra.tocar()` debe imprimir: "La guitarra está rasgueando un acorde."
    * `Bateria.tocar()` debe imprimir: "La batería está golpeando un ritmo."

## 📝 Instrucciones (Parte 3: Función Polimórfica)
6.  Crea una función **externa** llamada **`hacer_musica(instrumento)`** que acepte cualquier objeto y simplemente llame a `instrumento.tocar()`.

## 🔑 Conceptos Clave
* **Sobrescritura (Overriding):** Una subclase reemplaza la implementación de un método heredado.
* **Función Universal:** La función `hacer_musica` no necesita saber si le pasas una guitarra o una batería; sabe que si es un `Instrumento`, tendrá el método `tocar()`.

## ✅ Ejemplo de Uso
1.  Crear `mi_guitarra` y `mi_bateria`.
2.  Llamar a `hacer_musica(mi_guitarra)` y luego a `hacer_musica(mi_bateria)`.
3.  El resultado es diferente aunque el nombre del método (`tocar`) sea el mismo.