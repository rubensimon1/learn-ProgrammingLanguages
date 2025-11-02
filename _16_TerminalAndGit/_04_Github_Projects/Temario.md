# 🚀 Temario — GitHub Projects & Colaboración Profesional

> _“GitHub no es solo un repositorio de código: es una plataforma completa para trabajar en equipo, gestionar proyectos y construir software de calidad.”_

---

## 🧭 1. Qué es GitHub

**GitHub** es una plataforma basada en la nube que permite **hospedar repositorios Git**, colaborar en proyectos y gestionar versiones de código.

### 🌐 Características principales:
- Control de versiones con **Git**.  
- Colaboración en equipo (Pull Requests, Issues, Reviews).  
- Integración con herramientas CI/CD (GitHub Actions).  
- Gestión de proyectos (GitHub Projects, Boards, Milestones).  
- Documentación con **Markdown**.  

> 🧠 GitHub es el estándar de facto en la industria para alojar proyectos de software profesional.

---

## 🧩 2. Estructura de un repositorio

Un **repositorio (repo)** contiene todo tu proyecto: código, documentación, historial de commits y configuración.

### 📁 Estructura típica:
📦 mi-proyecto/
┣ 📂 src/
┣ 📂 docs/
┣ 📂 tests/
┣ 📄 README.md
┣ 📄 .gitignore
┣ 📄 LICENSE
┗ 📄 package.json (u otros archivos de configuración)

---

## ⚙️ 3. Crear un repositorio en GitHub

### 🔧 Opción 1: Desde la web
1. Inicia sesión en [GitHub.com](https://github.com).  
2. Haz clic en **New Repository**.  
3. Añade nombre, descripción y visibilidad (público o privado).  
4. Marca la opción **“Initialize with a README”** si deseas un README inicial.  
5. Clic en **Create Repository**.

### 🔧 Opción 2: Desde la terminal
```bash
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/usuario/mi-proyecto.git
git push -u origin main
```

## 4. 🤝 4. Colaborar con otros (Forks y Pull Requests)
🍴 Fork
Un fork es una copia de un repositorio que puedes modificar libremente.
    Ideal para contribuir a proyectos open source.
    Permite experimentar sin afectar el proyecto original.

🔄 Pull Request (PR)
Un Pull Request propone cambios desde una rama o fork hacia el repositorio principal.

Flujo típico:
1. Crea una rama (feature/nueva-funcion).
2. Realiza tus cambios y haz commits.
3. Sube la rama:
    git push origin feature/nueva-funcion
4. En GitHub → “Compare & pull request”.
5. Añade título, descripción y solicita revisión.

💬 Los PR permiten revisiones de código, comentarios y aprobación antes de fusionar.

## 📋 5. GitHub Issues (Gestión de tareas y errores)
Issues son tickets o reportes de trabajo.
Se usan para registrar errores, sugerencias o tareas pendientes.

🧱 Ejemplo:
    Título: “Error al iniciar sesión en móvil”
    Descripción: Detalles, pasos para reproducirlo, capturas, etiquetas.
    Etiquetas: bug, frontend, urgent
    Asignado a: @usuario

🧠 Usa templates (.github/ISSUE_TEMPLATE/) para estandarizar la creación de Issues en tu equipo.

## 📊 6. GitHub Projects (Tableros Kanban)
Los GitHub Projects son tableros que permiten planificar, priorizar y hacer seguimiento de las tareas del proyecto.

🧩 Estructura común:
    To Do: tareas pendientes.
    In Progress: tareas en desarrollo.
        Done: tareas completadas.

📘 Crear un Project
1. En tu repositorio → pestaña Projects.
2. Clic en “New Project” → selecciona tipo (Classic o New).
3. Añade columnas (“To Do”, “In Progress”, “Done”).
4. Asocia issues, pull requests o tareas manuales.
5. Automatiza flujos (por ejemplo, mover un issue a “Done” cuando se cierra).

✨ Consejo: Usa Project Views y Fields personalizados (como prioridad, sprint o responsable).

## 🧮 7. Milestones (Hitos del proyecto)
Los Milestones agrupan Issues y PRs bajo un objetivo o versión específica.
Por ejemplo, un milestone llamado “Versión 1.0” puede incluir todas las tareas necesarias para el primer lanzamiento.

Crear un milestone:
1. Ve a la pestaña Issues → Milestones.
2. Clic en New Milestone.
3. Especifica nombre, descripción y fecha límite.
4. Asocia issues o PRs relacionados.

## ⚙️ 8. Automatización con GitHub Actions
GitHub Actions permite ejecutar flujos automáticos (workflows) cuando ocurren eventos (como un push o un PR).

Ejemplo de workflow (.github/workflows/deploy.yml):

name: 🚀 Deploy
on:
  push:
    branches: [ "main" ]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - name: Instalar dependencias
        run: npm install
      - name: Ejecutar tests
        run: npm test
      - name: Desplegar
        run: npm run deploy

🧠 Así puedes automatizar testeo, despliegue o notificaciones en cada commit.

## 🧰 9. GitHub Insights y Seguridad
GitHub incluye herramientas para la gestión y seguridad del código:

| Herramienta         | Función                                              |
| ------------------- | ---------------------------------------------------- |
| **Insights**        | Métricas de actividad, commits, contribuyentes, etc. |
| **Dependabot**      | Detecta vulnerabilidades en dependencias.            |
| **CodeQL**          | Analiza el código en busca de errores o exploits.    |
| **Security Policy** | Define cómo reportar vulnerabilidades.               |

## 🏁 10. Buenas prácticas profesionales

✅ Usa ramas descriptivas (feature/, fix/, docs/).
✅ Crea Pull Requests pequeños y claros.
✅ Revisa el código de tus compañeros (Code Review).
✅ Documenta todo en el README.md del proyecto.
✅ Usa Issues y Projects para planificar el trabajo.
✅ Añade una LICENSE si tu proyecto es público.

## ✨ Conclusión
GitHub es más que subir código:
es un ecosistema completo para colaborar, automatizar y construir software profesional.
Dominarlo te abrirá puertas en cualquier entorno de desarrollo moderno.