# Ejercicio 2: Encapsulamiento y Abstracción (Protegiendo Datos)

## 🎯 Objetivo
Aplicar el **Encapsulamiento** para proteger los atributos internos de una clase y la **Abstracción** para exponer solo lo esencial.

En Python, el encapsulamiento se implementa por convención usando prefijos.

## 📝 Instrucciones
1.  Crea una clase llamada `CuentaBancaria`.
2.  Define el constructor (`__init__`) con dos atributos internos que deben ser **privados** (Encapsulamiento):
    * **`__titular`**: (string) El nombre del titular.
    * **`__saldo`**: (float) El saldo actual, inicializado en 0.
3.  Implementa el método **`depositar(cantidad)`**:
    * Suma la `cantidad` al `__saldo`.
    * **Abstracción:** El usuario no necesita saber cómo se almacena `__saldo`, solo que el depósito funciona.
4.  Implementa el método **`retirar(cantidad)`**:
    * Resta la `cantidad` del `__saldo`.
    * Debe verificar que el `__saldo` sea suficiente (`if __saldo >= cantidad`).
5.  Implementa un método **"Getter"** llamado **`obtener_saldo()`**:
    * Es el único modo *permitido* para que el usuario pueda ver el saldo.

## 🔑 Conceptos Clave
* En Python, usamos un doble guion bajo (`__`) antes del nombre del atributo (ej: `__saldo`) para indicar que es **privado** y no debe modificarse directamente desde fuera de la clase.
* El encapsulamiento fuerza a usar los métodos (`depositar`, `retirar`) para interactuar con los datos.

## ✅ Ejemplo de Uso
1.  Crear `cuenta` ("Alice").
2.  `cuenta.depositar(200)`
3.  Intentar `cuenta.saldo = 5000` (esto NO debe funcionar como se espera, es una mala práctica).
4.  `cuenta.retirar(50)`
5.  `cuenta.obtener_saldo()` -> Devuelve el saldo restante.