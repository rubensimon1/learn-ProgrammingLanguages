# ✨ 05 - Patrones de Diseño (Design Patterns)

Los Patrones de Diseño son soluciones comprobadas y genéricas a problemas recurrentes que surgen durante el desarrollo de software. Son el **vocabulario** que usan los ingenieros senior para discutir la arquitectura de un sistema.

Están clasificados en tres categorías principales:

---

## 🏗️ 1. Patrones Creacionales (Creational)

Estos patrones se ocupan de la **creación de objetos**. Buscan proporcionar una forma controlada de instanciar clases, haciendo que el sistema sea independiente de cómo se crean sus objetos.

| Patrón | Concepto Simple | Propósito |
| :---: | :--- | :--- |
| **Singleton** | Asegura que una clase tenga **una sola instancia** y proporciona un punto global de acceso a ella. | Controlar recursos únicos como gestores de configuración o conexiones a bases de datos. |
| **Factory Method** | Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. | Crear objetos sin exponer la lógica de instanciación al cliente. |

## 🧩 2. Patrones Estructurales (Structural)

Estos patrones tratan de cómo las **clases y objetos se componen para formar estructuras más grandes**. Se centran en simplificar las relaciones.

| Patrón | Concepto Simple | Propósito |
| :---: | :--- | :--- |
| **Adapter** | Permite que dos interfaces incompatibles trabajen juntas. | Conectar un componente nuevo (USB) a una interfaz vieja (Puerto Serial). |
| **Decorator** | Añade nuevas responsabilidades a un objeto dinámicamente, sin modificar su estructura. | Añadir funciones como cifrado o registro de actividad a una clase. |

## 🚀 3. Patrones de Comportamiento (Behavioral)

Estos patrones se ocupan de la **comunicación y la asignación de responsabilidades** entre los objetos.

| Patrón | Concepto Simple | Propósito |
| :---: | :--- | :--- |
| **Observer** | Define una dependencia de uno a muchos entre objetos. | Un objeto (Sujeto) notifica automáticamente a muchos observadores cuando cambia su estado. (Ej: Suscripción a un canal). |
| **Strategy** | Define una familia de algoritmos, encapsula cada uno y los hace intercambiables. | Permitir que el cliente elija el algoritmo (Ej: Pago con Tarjeta, PayPal o Efectivo) en tiempo de ejecución. |

---

## 🎯 Estructura de Ejercicios

Nos enfocaremos en un patrón de cada categoría para comprender los conceptos:

* **01-Singleton:** Patrón Creacional.
* **02-Adapter:** Patrón Estructural.
* **03-Observer:** Patrón de Comportamiento.