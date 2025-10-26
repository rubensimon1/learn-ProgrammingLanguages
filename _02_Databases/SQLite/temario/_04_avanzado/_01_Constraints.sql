-- Crear tabla con restricciones

CREATE TABLE usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT UNIQUE NOT NULL,
    email TEXT UNIQUE NOT NULL,
    edad INTEGER CHECK (edad >= 18)
);
