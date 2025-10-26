# 🧩 Ejercicios — Concurrencia e Hilos

> _“Aprender haciendo: cada ejercicio refuerza un aspecto clave del trabajo con hilos en Java.”_

---

## 🟢 Nivel básico

### 🧠 Ejercicio 1 — Hilo simple
Crea un hilo que imprima un mensaje ("Hola desde el hilo") cinco veces, con una pausa de un segundo entre cada mensaje.

---

### 🧠 Ejercicio 2 — Dos hilos en paralelo
Crea dos hilos que impriman mensajes diferentes con distintas velocidades de espera (`sleep()`), y observa cómo se intercalan las salidas.

---

### 🧠 Ejercicio 3 — Esperar hilos (`join`)
Crea tres hilos que realicen tareas sencillas (por ejemplo, imprimir números).  
Haz que el hilo principal espere a que todos terminen antes de mostrar el mensaje “Todos los hilos han finalizado”.

---

## 🟡 Nivel intermedio

### ⚙️ Ejercicio 4 — Contador compartido
Crea un contador global que varios hilos incrementen al mismo tiempo.  
Observa cómo el resultado puede ser incorrecto sin sincronización.

---

### ⚙️ Ejercicio 5 — Solución sincronizada
Modifica el ejercicio anterior para usar el modificador `synchronized` y evitar condiciones de carrera.

---

### ⚙️ Ejercicio 6 — Productor y consumidor
Crea dos hilos:  
- **Productor:** genera números del 1 al 10.  
- **Consumidor:** los muestra por pantalla.  
Usa `wait()` y `notify()` para que se comuniquen correctamente.

---

## 🔴 Nivel avanzado

### 🚀 Ejercicio 7 — Varios productores y consumidores
Extiende el ejercicio anterior para que haya **varios productores y varios consumidores** trabajando sobre un mismo buffer compartido.

---

### 🚀 Ejercicio 8 — Interrupción de hilos
Crea un hilo que simule un proceso largo (por ejemplo, descarga o cálculo).  
Permite interrumpirlo desde el hilo principal con `interrupt()` y maneja la excepción adecuadamente.

---

### 🚀 Ejercicio 9 — Control de tareas en paralelo
Implementa una pequeña cola de tareas donde varios hilos ejecuten diferentes operaciones (por ejemplo, imprimir mensajes, contar, o esperar).  
Cuando todas terminen, muestra un mensaje final.

---

## 💬 Consejo

> Empieza practicando con los primeros ejercicios hasta entender el ciclo de vida de los hilos.  
> Luego pasa a sincronización y comunicación entre ellos.  
> Finalmente, intenta integrar todo en simulaciones o mini proyectos.

---
