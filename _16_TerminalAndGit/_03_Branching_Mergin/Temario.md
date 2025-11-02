# 🌿 Temario — Ramas y Fusiones en Git (Branching & Merging)

> _“Cada rama es una línea temporal de tu proyecto. Fusiónalas con cuidado, y tu historia será limpia y coherente.”_

---

## 🧩 1. ¿Qué es una rama (branch)?

Una **rama** en Git es una versión paralela de tu proyecto donde puedes desarrollar nuevas funcionalidades sin afectar la versión principal (`main` o `master`).

### 🎯 Ventajas:
- Trabajar sin romper el código principal.
- Permitir que varios desarrolladores trabajen en paralelo.
- Facilitar revisiones, pruebas y experimentación.

Por defecto, todo proyecto empieza con una rama principal llamada **`main`**.

---

## 🌱 2. Crear y gestionar ramas

| Acción | Comando | Ejemplo |
|--------|----------|----------|
| Ver todas las ramas | `git branch` | — |
| Crear una nueva rama | `git branch nombre-rama` | `git branch feature/login` |
| Cambiar de rama | `git checkout nombre-rama` | `git checkout feature/login` |
| Crear y cambiar al mismo tiempo | `git checkout -b nombre-rama` | `git checkout -b feature/api` |
| Borrar una rama (local) | `git branch -d nombre-rama` | `git branch -d feature/api` |

> 💡 **Tip:** Usa nombres descriptivos como `feature/`, `fix/`, o `hotfix/` según el tipo de cambio.

---

## 🔄 3. Fusionar ramas (Merging)

Una **fusión** combina el trabajo de una rama con otra.  
Normalmente, se fusiona una rama de desarrollo con `main`.

### 🧱 Ejemplo clásico:

# Cambiar a la rama principal
git checkout main

# Traer cambios recientes
git pull origin main

# Fusionar la rama de trabajo
git merge feature/login

### ⚔️ 4. Resolver conflictos
Los conflictos aparecen cuando dos ramas modifican la misma parte de un archivo.

<<<<<<< HEAD
console.log("Hola desde main");
=======
console.log("Hola desde feature/login");
>>>>>>> feature/login

### 🔧 Pasos para resolver:
1. Edita el archivo y decide qué cambios conservar.
2. Guarda el archivo.
3. Añade los cambios resueltos:

git add archivo_conflictivo.js

4. Completa la fusión:
git commit

🧠 Consejo: usa editores como VS Code, que marcan visualmente los conflictos y permiten resolverlos fácilmente.

## 🧭 5. Rebasing (alternativa avanzada)
git rebase reescribe la historia de una rama, aplicando tus commits “encima” de otra.

git checkout feature/login
git rebase main

Esto hace que tu rama parezca creada desde la última versión de main, lo que mantiene un historial más limpio.

⚠️ Advertencia: No uses rebase en ramas compartidas con otros, puede causar conflictos complejos.

## 🧩 6. Ramas remotas
| Acción                       | Comando                                | Ejemplo                                |
| ---------------------------- | -------------------------------------- | -------------------------------------- |
| Subir una rama al remoto     | `git push -u origin nombre-rama`       | `git push -u origin feature/login`     |
| Cambiar nombre de rama local | `git branch -m nuevo-nombre`           | `git branch -m feature/auth`           |
| Eliminar rama remota         | `git push origin --delete nombre-rama` | `git push origin --delete feature/old` |

## 🧠 7. Flujo de trabajo profesional con ramas (Git Flow)
En entornos reales, se siguen convenciones de ramas como Git Flow o Feature Branch Workflow.

| Rama        | Descripción                                                                        |
| ----------- | ---------------------------------------------------------------------------------- |
| `main`      | Versión estable y lista para producción.                                           |
| `develop`   | Rama de integración donde se unen todas las funcionalidades antes del lanzamiento. |
| `feature/*` | Nuevas funcionalidades (derivan de `develop`).                                     |
| `release/*` | Versiones de preparación previa a producción.                                      |
| `hotfix/*`  | Correcciones urgentes en `main`.                                                   |

## 💼 Ejemplo de flujo

# Crear rama de desarrollo
git checkout -b feature/sistema-login develop

# Trabajar y hacer commits
git add .
git commit -m "Add login functionality"

# Fusionar con develop
git checkout develop
git merge feature/sistema-login

🧩 Este flujo evita errores y mantiene un historial limpio en equipos grandes.

## 🧹 8. Eliminar ramas obsoletas
Después de fusionar una rama, puedes eliminarla para mantener tu repositorio ordenado.

# Eliminar rama local
git branch -d feature/login

# Eliminar rama remota
git push origin --delete feature/login

## 🧾 9. Buenas prácticas en el uso de ramas

✅ Crea una rama por cada funcionalidad o corrección.
✅ Nombra las ramas de forma clara (feature/api-books, fix/typo-readme).
✅ Sincroniza tu rama con main antes de fusionar (git pull origin main).
✅ Revisa y prueba el código antes de hacer merge.
✅ Usa pull requests (en GitHub) para revisar los cambios antes de integrarlos.

## ✨ Recuerda: Las ramas son tu laboratorio.
Experimenta, fusiona, y mantén tu historia limpia.
Así trabaja un desarrollador profesional.