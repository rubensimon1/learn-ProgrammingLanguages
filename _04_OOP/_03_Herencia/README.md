# Ejercicio 3: Herencia (Reutilización de Código)

## 🎯 Objetivo
Aplicar el concepto de **Herencia** para crear una relación jerárquica donde una clase (hija o subclase) toma prestados atributos y métodos de otra clase (padre o superclase).

## 📝 Instrucciones (Parte 1: Superclase)
1.  Crea la clase **padre** llamada `Animal`.
2.  Define el constructor con un atributo: `nombre`.
3.  Implementa un método llamado **`comer()`** que simplemente imprima: `"{self.nombre} está comiendo."`.

## 📝 Instrucciones (Parte 2: Subclases)
4.  Crea la clase **hija** llamada `Perro` que **herede** de `Animal`.
5.  Crea la clase **hija** llamada `Gato` que **herede** de `Animal`.
6.  En el constructor de `Perro` y `Gato`, asegúrate de llamar al constructor del padre (`Animal`) usando `super().__init__(nombre)`.
7.  Implementa un método único para `Perro` llamado **`ladrar()`**.
8.  Implementa un método único para `Gato` llamado **`maullar()`**.

## 🔑 Conceptos Clave
* **Reutilización:** Los objetos `Perro` y `Gato` obtienen automáticamente el método `comer()` sin necesidad de escribirlo de nuevo.
* **Relación "es un":** Un Perro **es un** Animal; un Gato **es un** Animal.

## ✅ Ejemplo de Uso
1.  Crear `perro1` ("Fido") y `gato1` ("Garfield").
2.  Llamar a `perro1.comer()` (método heredado).
3.  Llamar a `gato1.maullar()` (método propio).