# Ejercicio 1: Singleton (Instancia Única)

## 🎯 Objetivo
Implementar el patrón **Singleton**. Este patrón garantiza que una clase solo tenga **una única instancia** y proporciona un punto global para acceder a ella.

Esto es útil para manejar recursos que deben ser compartidos y controlados centralmente, como una configuración de la aplicación o una conexión a la base de datos.

## 📝 Instrucciones
1.  Crea una clase llamada `ConfiguracionAplicacion`.
2.  Define una variable de clase **privada** llamada `_instancia` e inicialízala a `None`.
3.  Sobrescribe el método **`__new__`** de la clase. Este método es el que crea la instancia *antes* de llamar a `__init__`.
4.  Dentro de `__new__`:
    * Verifica si `_instancia` es `None`.
    * Si lo es, llama al método `super().__new__(cls)` para crear la instancia y guárdala en `_instancia`.
5.  Modifica el constructor (`__init__`) para que solo se inicialice la primera vez. Añade un atributo `config_data` con un valor inicial.
6.  Implementa un método `obtener_config()` para acceder a los datos.

## ✅ Ejemplo de Uso
1.  Crear `conf1 = ConfiguracionAplicacion()`.
2.  Crear `conf2 = ConfiguracionAplicacion()`.
3.  Comparar `conf1 is conf2` (debe ser `True`).
4.  Modificar un dato en `conf1` y ver que `conf2` lo refleje.