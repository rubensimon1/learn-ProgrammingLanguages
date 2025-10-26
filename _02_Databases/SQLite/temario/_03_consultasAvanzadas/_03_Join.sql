-- Crear tabla de categorías

CREATE TABLE categorias (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Agregar columna de categoría a tareas

ALTER TABLE tareas ADD COLUMN categoria_id INTEGER REFERENCES categorias(id);

-- Insertar categorías

INSERT INTO categorias (nombre) VALUES ('Personal'), ('Trabajo');

-- Asignar categorías a tareas

UPDATE tareas SET categoria_id = 1 WHERE id = 1;
UPDATE tareas SET categoria_id = 2 WHERE id = 3;

-- Mostrar tareas con su categoría

SELECT t.titulo, c.nombre AS categoria
FROM tareas t
LEFT JOIN categorias c ON t.categoria_id = c.id;
