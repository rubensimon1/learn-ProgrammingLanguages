# ☁️ Temario — Cloud & DevOps Fundamentals

> _“La nube no es solo dónde corre tu aplicación, sino cómo la gestionas.”_

---

## 🌍 1. Qué es Cloud Computing

El **Cloud Computing** permite acceder a recursos informáticos (servidores, bases de datos, almacenamiento) a través de internet.

### 🧩 Tipos de servicios cloud
| Tipo | Descripción | Ejemplo |
|------|--------------|----------|
| **IaaS** | Infraestructura como servicio (servidores, redes). | AWS EC2, Azure VMs |
| **PaaS** | Plataforma como servicio (entorno de ejecución). | Heroku, Google App Engine |
| **SaaS** | Software como servicio (apps listas para usar). | Gmail, Trello, Notion |

### 🌐 Tipos de nube
- ☁️ **Pública:** infraestructura compartida (AWS, Azure, GCP).  
- 🔒 **Privada:** infraestructura propia de la empresa.  
- 🌗 **Híbrida:** mezcla de ambas, para mayor flexibilidad.

---

## 🧠 2. Qué es DevOps

**DevOps** une desarrollo (Dev) y operaciones (Ops) para acelerar la entrega de software, reducir errores y mejorar la colaboración.

### 🚀 Objetivos clave:
- **Automatización** del ciclo de vida del software.  
- **Entrega continua (CD)** y **despliegue continuo (CI/CD)**.  
- **Infraestructura reproducible**.  
- **Monitorización constante**.

> _“Si algo funciona en tu máquina, debería funcionar en producción también.”_

---

## ⚙️ 3. Integración continua (CI)

**CI (Continuous Integration)** significa integrar código frecuentemente para detectar errores temprano.

### 🔧 Ejemplo básico de workflow con GitHub Actions:

```yaml
# .github/workflows/ci.yml
name: Integración Continua
on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - name: Clonar repositorio
        uses: actions/checkout@v4

      - name: Configurar entorno
        run: |
          npm install
          npm run test
```

💡 Cada vez que hagas push, este flujo se ejecutará automáticamente.

---

## 🧰 4. Despliegue continuo (CD)
CD (Continuous Deployment) lleva la automatización un paso más allá: después de pasar los tests, el código se despliega automáticamente.

Ejemplo con GitHub Actions (Node.js)

deploy:
  runs-on: ubuntu-latest
  needs: build
  steps:
    - uses: actions/checkout@v4
    - name: Desplegar en servidor
      run: ssh user@mi-servidor "cd app && git pull && npm restart"

---

## 🧱 5. Infraestructura como código (IaC)
La IaC permite definir servidores, redes o bases de datos con archivos de configuración.
Así, puedes replicar entornos fácilmente.

Ejemplo (Terraform)

resource "aws_instance" "mi_app" {
  ami           = "ami-0c55b159cbfafe1f0"
  instance_type = "t2.micro"
  tags = {
    Name = "ServidorApp"
  }
}

🔁 Esto crea un servidor EC2 con una sola línea de comando.

---

## 🐳 6. Docker + Cloud
Docker es esencial en entornos cloud.
Permite empaquetar tu aplicación con todas sus dependencias para que se ejecute igual en cualquier lugar.

Ejemplo:
docker build -t miapp .
docker run -p 8080:8080 miapp

Subir imágenes a Docker Hub:
docker tag miapp usuario/miapp:v1
docker push usuario/miapp:v1

---

## 🔒 7. Seguridad en la nube
Limitar accesos por IP o rol (IAM).
No exponer credenciales ni .env públicos.
Usar HTTPS y certificados válidos.
Activar autenticación multifactor (MFA) en proveedores cloud.

---

## 📊 8. Monitorización y Logging
Monitorear sistemas en tiempo real permite prevenir fallos.

| Herramienta                               | Uso                          |
| ----------------------------------------- | ---------------------------- |
| **Prometheus + Grafana**                  | Métricas y visualización.    |
| **ELK Stack (Elastic, Logstash, Kibana)** | Análisis de logs.            |
| **AWS CloudWatch / GCP Cloud Logging**    | Monitorización cloud nativa. |

---

## ☁️ 9. Ejemplo de pipeline completo
graph LR
A[Commit en GitHub] --> B[Tests automáticos]
B --> C[Build Docker]
C --> D[Deploy en Cloud (AWS, Render, etc.)]
D --> E[Monitoreo y logs]

Todo automatizado con CI/CD y contenedores.

---

## 🧩 10. Buenas prácticas DevOps
✅ Versionar todo (infraestructura, código, configs).
✅ Automatizar tareas repetitivas.
✅ Usar entornos separados: dev, staging, prod.
✅ Documentar los pipelines.
✅ Revisar la seguridad antes del despliegue.

> _“La automatización no sustituye al desarrollador: lo libera para construir mejor.”_