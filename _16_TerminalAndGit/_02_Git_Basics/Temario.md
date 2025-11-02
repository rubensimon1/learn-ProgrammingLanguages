# 🧠 Temario — Fundamentos de Git

> _“El control de versiones no es opcional; es parte del ADN del desarrollo moderno.”_

---

## 📍 1. Introducción a Git

**Git** es un sistema de control de versiones distribuido que permite registrar los cambios en el código fuente de un proyecto, facilitando la colaboración y el trabajo en equipo.

### 🎯 ¿Por qué es importante?

- Guarda **versiones** del código (como puntos de control).
- Permite **colaborar sin conflictos** entre varios desarrolladores.
- Facilita la **recuperación de versiones anteriores**.
- Es un **estándar en la industria**, usado por empresas y proyectos open-source.

---

## 🗂️ 2. Conceptos básicos

| Concepto | Descripción |
|-----------|--------------|
| **Repositorio** | Carpeta donde Git guarda tu proyecto y su historial. |
| **Commit** | Un registro o punto de guardado con los cambios realizados. |
| **Branch (Rama)** | Línea de desarrollo independiente dentro del mismo proyecto. |
| **Merge (Fusión)** | Unión de los cambios entre ramas. |
| **Remote (Remoto)** | Copia del repositorio alojada en un servidor como GitHub o GitLab. |

> 🧠 **Analogía:**  
> Piensa en Git como una máquina del tiempo para tu código.

---

## ⚙️ 3. Instalación y configuración

### 🪟 En Windows
1. Descarga e instala [Git Bash](https://git-scm.com/download/win).
2. Durante la instalación, selecciona:
   - **“Use Git from Git Bash only”**
   - **“Checkout Windows-style, commit Unix-style line endings”**

### 🐧 En Linux / macOS
sudo apt install git -y
# o
brew install git

## 🧩 Configuración inicial
Después de instalar, configura tu identidad:

💡 Usa el mismo correo de tu cuenta de GitHub para vincular tus commits automáticamente.

git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"

## Verifica la configuración:
git config --list

## Creacion de un repositorio
git init

## Añadir archivos y hacer un commit 
git add .                           -> Prepara los cambios
git commit -m "Primer commit"       -> Los guarda en el historial

## Ver estado del repositorio
git status

---

## Conectar con un repositorio remoto (Github)
1. Crear un nuevo repositorio e github

Entra en GitHub
Pulsa New repository → asigna un nombre → Create repository.

2. Vincularlo con tu proyecto local
git remote add origin https://github.com/usuario/nombre-repo.git

3. Subir tu codigo
git push -u origin main          -> Envia los commits al servidor

4. Descargar actualizaciones
git pull origin main             -> Los atrae dese Github

---

## Ignorar archivos innecesarios
# Archivos temporales
*.log
*.tmp

# Configuración local
.env
node_modules/

Crea este archivo en la raíz de tu proyecto.

1. Consultar el historial
git log

Ejemplo de salida:

commit a12b34c (HEAD -> main)
Author: Juan Pérez <juan@example.com>
Date:   Mon Oct 27 2025

    Agregada función de login con validación

2. Ver historial simplificado
git log --oneline --graph --all

## Deshacer cambios
🚨 Cuidado con reset --hard: puede borrar trabajo no guardado.

| Acción                                      | Comando                            | Explicación                         |
| ------------------------------------------- | ---------------------------------- | ----------------------------------- |
| Quitar archivo del área de stage            | `git restore --staged archivo.txt` | Revierte `git add`                  |
| Revertir cambios locales                    | `git checkout -- archivo.txt`      | Recupera la última versión guardada |
| Deshacer commit (creando uno nuevo inverso) | `git revert <hash>`                | Útil en entornos compartidos        |
| Volver a un punto anterior                  | `git reset --hard <hash>`          | ⚠️ Elimina cambios no guardados     |

## Buenas practicas profesionales
✅ Commits pequeños y descriptivos

Usa frases cortas y en presente, por ejemplo:
add login validation o fix bug in user form.

✅ Ignora archivos innecesarios

Usa .gitignore para evitar subir configuraciones locales o dependencias.

✅ Crea ramas para nuevas funcionalidades

git checkout -b feature/login-system


✅ Haz pull antes de trabajar

Evita conflictos trayendo la versión más reciente del repositorio remoto.

✅ Usa README.md

Documenta tu proyecto y explica cómo instalarlo o probarlo.




