# 🐳 Temario — Docker y Gestión de Servidores

> _“Empaqueta tu aplicación. Envíala. Ejecútala en cualquier lugar.”_

---

## 🧩 1. ¿Qué es Docker?

**Docker** es una plataforma que permite crear y ejecutar aplicaciones dentro de **contenedores**, entornos ligeros y portátiles que incluyen todo lo necesario: sistema, librerías y código.

### 🚀 Beneficios
- Portabilidad total (funciona igual en cualquier entorno).
- Ligero (no requiere máquinas virtuales completas).
- Aislado (cada contenedor tiene su propio entorno).
- Escalable (ideal para microservicios y despliegues modernos).

---

## 🧱 2. Conceptos fundamentales

| Concepto | Descripción |
|-----------|-------------|
| **Imagen (Image)** | Plantilla inmutable para crear contenedores. |
| **Contenedor (Container)** | Instancia ejecutable de una imagen. |
| **Dockerfile** | Archivo que define cómo construir una imagen. |
| **Volumen (Volume)** | Carpeta persistente que guarda datos fuera del contenedor. |
| **Red (Network)** | Permite que contenedores se comuniquen entre sí. |

---

## ⚙️ 3. Comandos esenciales de Docker

| Acción | Comando | Ejemplo |
|--------|----------|----------|
| Ver versión | `docker --version` | — |
| Descargar imagen | `docker pull <imagen>` | `docker pull nginx` |
| Listar imágenes | `docker images` | — |
| Crear contenedor | `docker run <imagen>` | `docker run hello-world` |
| Listar contenedores | `docker ps -a` | — |
| Detener contenedor | `docker stop <id>` | — |
| Eliminar contenedor | `docker rm <id>` | — |
| Eliminar imagen | `docker rmi <imagen>` | — |

---

## 🧩 4. Crear tu propia imagen (Dockerfile)

Ejemplo de `Dockerfile` para una app Node.js:

```dockerfile
# Imagen base
FROM node:18

# Directorio de trabajo
WORKDIR /app

# Copiar archivos
COPY package*.json ./
RUN npm install

COPY . .

# Puerto de exposición
EXPOSE 3000

# Comando por defecto
CMD ["npm", "start"]

## 🧠 Comandos clave
docker build -t miapp:v1 .
docker run -p 3000:3000 miapp:v1
```

📦 Resultado: tu app está corriendo dentro de un contenedor, accesible desde tu máquina.

---

## ⚙️ 5. Docker Compose

Permite definir y ejecutar múltiples contenedores (por ejemplo, backend + base de datos).

Ejemplo docker-compose.yml:

version: '3.8'
services:
  app:
    build: .
    ports:
      - "3000:3000"
    depends_on:
      - db
  db:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: biblioteca

## Comandos básicos:
docker-compose up -d
docker-compose down

---

## 🌐 6. Introducción a servidores
Un servidor es una máquina (física o virtual) que aloja aplicaciones, servicios o bases de datos.

| Tipo                             | Descripción                                         |
| -------------------------------- | --------------------------------------------------- |
| **Local**                        | Tu propio equipo, ideal para pruebas.               |
| **VPS (Virtual Private Server)** | Servidor virtual alquilado (ej. OVH, DigitalOcean). |
| **Cloud**                        | Escalable, en plataformas como AWS, Azure o GCP.    |

---

## 🧠 7. Comandos básicos en servidores Linux

| Acción                 | Comando                   | Ejemplo                 |
| ---------------------- | ------------------------- | ----------------------- |
| Conectarse al servidor | `ssh usuario@ip`          | `ssh root@192.168.1.10` |
| Ver procesos activos   | `top` o `htop`            | —                       |
| Ver espacio en disco   | `df -h`                   | —                       |
| Reiniciar servicios    | `systemctl restart nginx` | —                       |
| Salir del servidor     | `exit`                    | —                       |

💡 Consejo: Automatiza despliegues con scripts .sh o GitHub Actions conectados por SSH.

---

## ⚡ 8. Despliegue de una app con Docker

# Copiar archivos al servidor
scp -r ./miapp root@IP_SERVER:/root/miapp

# Conectarte al servidor
ssh root@IP_SERVER

# Ejecutar contenedor
cd miapp
docker build -t miapp:v1 .
docker run -d -p 80:3000 miapp:v1

La aplicación quedará accesible desde el navegador en http://<IP_SERVER>.

---

## 🔒 9. Seguridad básica en servidores

✅ Usa claves SSH en lugar de contraseñas.
✅ Actualiza tus contenedores e imágenes regularmente.
✅ No ejecutes contenedores como root.
✅ Limita los puertos expuestos.
✅ Usa .env para credenciales.

---

## 🧩 10. Buenas prácticas

Usa Docker Compose para entornos multi-servicio.
Versiona tus archivos Docker (Dockerfile, docker-compose.yml).
Mantén imágenes pequeñas y optimizadas.
Automatiza el despliegue (CI/CD).
Documenta cada paso en tu README.

“Docker y los servidores son la base invisible que mantiene vivo tu software.”

