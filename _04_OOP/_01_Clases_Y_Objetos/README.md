# Ejercicio 1: Clases, Objetos y Métodos (La Base)

## 🎯 Objetivo
Crear una clase sencilla que modele una entidad del mundo real y luego crear múltiples objetos (instancias) de esa clase.

## 📝 Instrucciones
1.  Crea una clase llamada `Coche`.
2.  Define el constructor (`__init__` en Python) que acepte e inicialice tres atributos:
    * `marca` (string)
    * `modelo` (string)
    * `velocidad_actual` (entero, inicializado en 0)
3.  Implementa un método llamado **`acelerar(cantidad)`**:
    * Suma la `cantidad` a la `velocidad_actual`.
4.  Implementa un método llamado **`frenar(cantidad)`**:
    * Resta la `cantidad` a la `velocidad_actual`. Asegúrate de que la velocidad **nunca sea negativa**.
5.  Crea dos objetos (`coche1` y `coche2`) con diferentes marcas y modelos.
6.  Llama a los métodos `acelerar()` y `frenar()` en cada objeto.

## ✅ Ejemplo de Uso
1.  Crear `coche1` (Marca: Toyota, Modelo: Corolla).
2.  `coche1.acelerar(50)` -> `velocidad_actual` = 50.
3.  `coche1.frenar(10)` -> `velocidad_actual` = 40.