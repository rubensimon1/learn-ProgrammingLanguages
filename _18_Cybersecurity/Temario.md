# 🧠 Temario — Ciberseguridad para Desarrolladores

> _“No se trata solo de escribir código, sino de protegerlo.”_

---

## 🧩 1. Conceptos fundamentales

La **ciberseguridad** es el conjunto de prácticas y tecnologías destinadas a proteger sistemas, redes y datos de accesos no autorizados.

### 🔑 Principios básicos (CIA Triad)
| Elemento | Significado | Ejemplo |
|-----------|-------------|----------|
| **Confidencialidad** | Solo los usuarios autorizados acceden a la información. | Encriptar contraseñas. |
| **Integridad** | Los datos no deben ser modificados sin permiso. | Control de versiones, validaciones. |
| **Disponibilidad** | El sistema debe estar accesible cuando se necesite. | Backups, servidores redundantes. |

---

## ⚙️ 2. Amenazas comunes

| Tipo | Descripción | Ejemplo |
|------|--------------|----------|
| 🧬 **Malware** | Software malicioso que daña o roba información. | Virus, troyanos, ransomware. |
| 🎭 **Phishing** | Engaño para robar credenciales o datos. | Correos falsos o formularios clonados. |
| 🌐 **SQL Injection** | Inserción de código SQL en formularios no protegidos. | `' OR 1=1 --` |
| 💣 **XSS (Cross Site Scripting)** | Inyección de scripts maliciosos en páginas web. | `<script>alert('hack')</script>` |
| 🔁 **CSRF (Cross-Site Request Forgery)** | Ataque que ejecuta acciones sin consentimiento. | Petición automática a tu cuenta sin saberlo. |

---

## 🔒 3. Seguridad en contraseñas

### Buenas prácticas:
- Nunca almacenar contraseñas en texto plano.
- Usar **hashing con salt**, por ejemplo con `bcrypt` o `argon2`.
- Requerir contraseñas seguras (mayúsculas, números, símbolos).
- Permitir recuperación solo con **tokens temporales**.

### Ejemplo (PHP):
```php
// Hash de contraseña
$hash = password_hash($password, PASSWORD_BCRYPT);

// Verificación
if (password_verify($input, $hash)) {
    echo "Acceso permitido";
}
```

---

### 🧱 4. Seguridad web
```php
🚧 SQL Injection
// Evita concatenar cadenas SQL directamente:

// ❌ Vulnerable
$query = "SELECT * FROM users WHERE email='$email' AND pass='$pass'";

// ✅ Seguro
$stmt = $pdo->prepare("SELECT * FROM users WHERE email=? AND pass=?");
$stmt->execute([$email, $pass]);
```

🔒 XSS
```php
// Escapa todo contenido antes de mostrarlo:
echo htmlspecialchars($userInput, ENT_QUOTES, 'UTF-8');
```

🧩 CSRF
```php
// Usa tokens CSRF en formularios:
<input type="hidden" name="csrf_token" value="<?= $_SESSION['token'] ?>">
```

---

## 🌍 5. HTTPS y certificados SSL

HTTPS garantiza la conexión cifrada entre el usuario y el servidor.
Hoy en día, es obligatorio en cualquier sitio serio.

Cómo obtener un certificado gratuito:
    Usar Let’s Encrypt
    Instalar con Certbot en servidores Linux.

sudo apt install certbot python3-certbot-nginx
sudo certbot --nginx

---

## 🧩 6. Seguridad en servidores
🔐 Buenas prácticas

✅ Deshabilita el acceso SSH por contraseña (usa claves).
✅ Actualiza el sistema regularmente.
✅ Configura un firewall (UFW o iptables).
✅ No ejecutes servicios como root.
✅ Mantén backups automáticos.

## Ejemplo básico de firewall (Ubuntu)
sudo ufw allow ssh
sudo ufw allow 80
sudo ufw allow 443
sudo ufw enable

---

## 🧠 7. Logs y auditorías
Registrar eventos críticos ayuda a detectar ataques o fallos.
    🧾 Logs del sistema: /var/log/syslog, /var/log/auth.log
    📜 Logs de aplicaciones: errores, accesos, peticiones.
    ⚙️ Monitorización: Fail2Ban, Wazuh, Grafana, Prometheus.

---

## 🧩 8. Copias de seguridad
Siempre tener una política de backups regulares y automáticos.

# Copia de seguridad diaria con tar
tar -czf /backups/miapp-$(date +%F).tar.gz /var/www/miapp

# Consejos:
Guardar en servidores externos (S3, Drive, FTP seguro).
Automatizar con cron.
Probar restauraciones periódicamente.

---

## ⚡ 9. Seguridad en entornos Docker
No ejecutar contenedores como root.
Usar imágenes oficiales verificadas.
Escanear vulnerabilidades con docker scan.
Limitar los puertos expuestos.
Definir .env para credenciales.

---

## 🔍 10. Checklist de seguridad básica
✅ Contraseñas cifradas.
✅ HTTPS activo.
✅ Validación de entradas.
✅ Firewall configurado.
✅ Logs activos y revisados.
✅ Backups automáticos.
✅ SSH seguro con claves.

“La seguridad no se añade al final del proyecto. Se construye desde el principio.”

