# Ejercicio 2: Patrón Adapter (Adaptador)

## 🎯 Objetivo
Implementar el patrón **Adapter**. Este patrón estructural permite que la interfaz de una clase existente sea usada como otra interfaz.

Piensa en un adaptador de corriente: convierte una clavija de un tipo (ej: europea) en otra (ej: americana) para que un dispositivo pueda funcionar.

## 📝 Instrucciones
Modelaremos un sistema donde queremos usar dos tipos de notificaciones (una antigua y una moderna) bajo una única interfaz.

1.  Crea la clase **Target (Objetivo)**, la interfaz deseada: `SistemaNotificacion`.
    * Define el método **`enviar_mensaje(texto)`**.

2.  Crea la clase **Adaptee (Incompatible)**: `NotificacionAntigua`.
    * Esta clase tiene un método incompatible: **`lanzar_alerta(alerta)`**.

3.  Crea la clase **Adapter (Adaptador)**: `AdaptadorNotificacionAntigua`.
    * Esta clase debe **heredar** de `SistemaNotificacion` para cumplir con la interfaz deseada.
    * Debe **contener** (composición) una instancia de `NotificacionAntigua` (el Adaptado).
    * Implementa el método **`enviar_mensaje(texto)`** requerido por el Target. Dentro de este método, traduce la llamada a **`lanzar_alerta(alerta)`** del Adaptado.

## ✅ Ejemplo de Uso
1.  Crear `sistema_antiguo = NotificacionAntigua()`.
2.  Crear `adaptador = AdaptadorNotificacionAntigua(sistema_antiguo)`.
3.  Llamar a `adaptador.enviar_mensaje("Mensaje Unificado")`.
4.  El Adaptador recibirá `enviar_mensaje`, pero internamente llamará a `lanzar_alerta`.