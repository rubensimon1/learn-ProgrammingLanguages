# Ejercicio 3: Patrón Observer (Observador/Suscripción)

## 🎯 Objetivo
Implementar el patrón **Observer**. Este patrón de comportamiento define una dependencia **uno-a-muchos** entre objetos, de forma que cuando un objeto (**Sujeto**) cambia de estado, todos sus dependientes (**Observadores**) son notificados y actualizados automáticamente.

Piensa en una suscripción a un canal de YouTube: el canal es el Sujeto, y los suscriptores son los Observadores.

## 📝 Instrucciones (Parte 1: Observador - Suscriptor)
1.  Crea la clase abstracta (o base) **`Observador`**.
2.  Define el método abstracto **`actualizar(mensaje)`** que será implementado por las clases concretas.

3.  Crea la clase concreta **`UsuarioSuscriptor`** que herede de `Observador`.
    * Debe tener un `nombre`.
    * Implementa el método **`actualizar(mensaje)`** imprimiendo que el usuario ha recibido el mensaje.

## 📝 Instrucciones (Parte 2: Sujeto - Publicador)
4.  Crea la clase **`CanalYouTube`** (el Sujeto).
5.  Debe tener una lista interna llamada **`_observadores`** para guardar a sus suscriptores.
6.  Implementa el método **`suscribir(observador)`**: añade el objeto `observador` a la lista.
7.  Implementa el método **`notificar(mensaje)`**:
    * Itera sobre todos los objetos en `_observadores`.
    * Por cada uno, llama a su método **`actualizar(mensaje)`**.
8.  Implementa el método **`subir_video(titulo)`**: este método debe llamar internamente a `notificar()` con el título del nuevo video.

## ✅ Ejemplo de Uso
1.  Crear `canal = CanalYouTube()`.
2.  Crear `usuario1`, `usuario2`.
3.  `canal.suscribir(usuario1)`, `canal.suscribir(usuario2)`.
4.  `canal.subir_video("Patrones de Diseño Explicados")`.
5.  Ambos usuarios deben ser notificados automáticamente.