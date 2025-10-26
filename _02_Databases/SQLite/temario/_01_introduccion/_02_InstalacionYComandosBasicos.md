
### 🗂 `_02_InstalacionYComandosBasicos.md`
```md
# ⚙️ Instalación y primeros comandos

### 🔹 Instalar SQLite
- En Linux:
  ```bash
  sudo apt install sqlite3

### 🔹 Comandos útiles
sqlite3 mi_base.db    # Abre o crea una base
.tables               # Muestra las tablas
.schema               # Estructura SQL
.quit                 # Salir

### 🗂 `_03_CrearBaseYTablas.sql`
```sql
CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    email TEXT UNIQUE,
    edad INTEGER
);

CREATE TABLE IF NOT EXISTS pedidos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario_id INTEGER,
    total REAL,
    fecha TEXT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
