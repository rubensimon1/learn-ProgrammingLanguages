-- Crear una tabla llamada "usuarios"

CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,   -- Identificador único
    nombre TEXT NOT NULL,                   -- Nombre del usuario
    email TEXT UNIQUE NOT NULL,             -- Correo (único)
    edad INTEGER                            -- Edad opcional
);

-- Crear una tabla relacionada llamada "pedidos"

CREATE TABLE IF NOT EXISTS pedidos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario_id INTEGER,
    total REAL,
    fecha TEXT DEFAULT (DATE('now')),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
