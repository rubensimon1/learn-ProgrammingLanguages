# 🖥️ Tema 16.1 — Fundamentos de la Terminal (CLI)

> _“El terminal es la herramienta que te conecta directamente con el sistema operativo.”_

---

## 🧭 1. Qué es la terminal

La **terminal** (o **CLI**, *Command Line Interface*) es un entorno donde puedes interactuar directamente con el sistema operativo escribiendo comandos.

- A diferencia de la interfaz gráfica (GUI), aquí no hay botones ni menús.  
- Permite realizar tareas de forma **más rápida, automatizada y precisa**.  
- Es una herramienta fundamental para **programadores, administradores y DevOps**.

### 📦 Tipos de terminal comunes

| Sistema | Terminal / Shell | Descripción |
|----------|------------------|--------------|
| **Windows** | PowerShell, CMD, Git Bash | PowerShell es la más moderna. Git Bash permite usar comandos tipo Linux. |
| **macOS** | Terminal (Bash / Zsh) | Terminal nativo compatible con comandos UNIX. |
| **Linux** | Bash, Zsh, Fish | Bash es el más común; permite scripting y automatización avanzada. |

---

## 🗂️ 2. Navegación por el sistema de archivos

Para moverte por las carpetas, se usan rutas y comandos simples:

| Comando | Descripción | Ejemplo |
|----------|--------------|----------|
| `pwd` | Muestra la ruta actual | `/home/usuario/Documentos` |
| `ls` | Lista archivos y carpetas | `ls -la` (muestra detalles y ocultos) |
| `cd <ruta>` | Cambia de directorio | `cd /home/usuario/Descargas` |
| `cd ..` | Sube un nivel | (de `/home/usuario/Descargas` → `/home/usuario`) |
| `mkdir <nombre>` | Crea una carpeta | `mkdir proyectos` |
| `rmdir <nombre>` | Elimina una carpeta vacía | `rmdir temp` |
| `clear` | Limpia la pantalla | — |

> 🧠 **Tip profesional:** usa el tabulador para autocompletar rutas y comandos.

---

## 📄 3. Gestión de archivos

En la terminal puedes crear, ver y modificar archivos sin usar un editor gráfico.

| Comando | Descripción | Ejemplo |
|----------|--------------|----------|
| `touch archivo.txt` | Crea un archivo vacío | `touch notas.txt` |
| `cat archivo.txt` | Muestra el contenido | `cat notas.txt` |
| `cp origen destino` | Copia archivos | `cp notas.txt copia.txt` |
| `mv origen destino` | Mueve o renombra | `mv notas.txt ./docs/` |
| `rm archivo.txt` | Borra archivo | `rm temporal.txt` |

⚠️ **Cuidado:** `rm` elimina archivos **sin pasar por la papelera**.

---

## 🔒 4. Permisos y usuarios

Los sistemas tipo UNIX (Linux / macOS) usan **permisos** para controlar el acceso a archivos.

Cada archivo tiene tres tipos de permisos:
- **r** → lectura  
- **w** → escritura  
- **x** → ejecución  

Y se aplican a:
- **u** → usuario  
- **g** → grupo  
- **o** → otros  

| Comando | Descripción | Ejemplo |
|----------|--------------|----------|
| `ls -l` | Muestra permisos | `-rw-r--r--` |
| `chmod` | Cambia permisos | `chmod 755 script.sh` |
| `chown` | Cambia propietario | `chown usuario:grupo archivo.txt` |

> 🧑‍💻 **Ejemplo práctico:**  
> `chmod +x script.sh` → da permiso de ejecución al script.

---

## ⚙️ 5. Procesos y sistema

Todo programa que se ejecuta en tu sistema es un **proceso**.  
Puedes verlos, pausarlos o cerrarlos desde la terminal.

| Comando | Descripción | Ejemplo |
|----------|--------------|----------|
| `ps` | Lista procesos actuales | `ps aux` |
| `top` | Muestra procesos activos en tiempo real | — |
| `kill <PID>` | Cierra un proceso por ID | `kill 2345` |
| `whoami` | Muestra tu usuario actual | — |
| `history` | Muestra el historial de comandos | — |

> 💡 Usa `Ctrl + C` para detener un proceso en ejecución (por ejemplo, un script en bucle).

---

## 📤 6. Redirección y tuberías

Una de las mayores ventajas del terminal es **combinar comandos**.

| Operador | Descripción | Ejemplo |
|-----------|--------------|----------|
| `>` | Redirige la salida a un archivo (sobrescribe) | `ls > lista.txt` |
| `>>` | Añade la salida al final de un archivo | `echo "hola" >> notas.txt` |
| `<` | Usa un archivo como entrada | `sort < datos.txt` |
| `|` | Conecta comandos (pipe) | `ls | grep .txt` |

> 🧠 Esto permite crear **flujos automatizados**, combinando comandos simples.

---

## ⚡ 7. Scripts básicos

Un **script** es un conjunto de comandos guardados en un archivo `.sh` (Bash) o `.ps1` (PowerShell).

Ejemplo básico (`saludo.sh`):

```bash
#!/bin/bash
echo "¡Hola, $USER! Bienvenido a la terminal."

Para ejecutarlo: 

chmod +x saludo.sh
./saludo.sh

