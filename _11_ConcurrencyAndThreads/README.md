# 🧵 Tema 11 — Concurrencia e Hilos (Concurrency & Threads)

> _“La programación concurrente permite ejecutar múltiples tareas al mismo tiempo, aprovechando mejor los recursos del sistema.”_

---

## 🧠 Contenido

| Carpeta | Descripción |
|----------|--------------|
| `01_CreacionBasica/` | Introducción a los hilos con la clase `Thread`. |
| `02_MultiHilos/` | Ejecución de varios hilos al mismo tiempo. |
| `03_SleepYJoin/` | Pausar hilos con `sleep()` y esperar su finalización con `join()`. |
| `04_Sincronizacion/` | Sincronización de recursos compartidos con `synchronized`. |
| `05_WaitNotify/` | Comunicación entre hilos mediante `wait()` y `notify()`. |

---

## 🎯 Objetivos

- Comprender qué son los hilos y cómo crearlos.  
- Aprender a ejecutar múltiples tareas de forma concurrente.  
- Controlar el flujo de ejecución usando `sleep()` y `join()`.  
- Evitar condiciones de carrera usando sincronización.  
- Aplicar comunicación entre hilos con `wait()` y `notify()`.

---

## 💡 Consejo

> Usa los hilos cuando necesites **realizar varias tareas que no dependan unas de otras**, especialmente si involucran esperas (lectura de archivos, red, etc.).  
>  
> Evita usarlos para cálculos intensivos — en esos casos se recomienda usar **`ExecutorService`**, **`ForkJoinPool`** o herramientas de **paralelismo real**.

---

📦 **Ruta sugerida en el repositorio:**  
