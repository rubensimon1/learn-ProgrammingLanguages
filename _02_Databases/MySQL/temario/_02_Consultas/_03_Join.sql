-- Crear tabla 'prestamos'

CREATE TABLE prestamos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    libro_id INT,
    usuario VARCHAR(50),
    fecha DATE,
    FOREIGN KEY (libro_id) REFERENCES libros(id)
);

-- Mostrar préstamos con títulos de libros

SELECT p.usuario, l.titulo, p.fecha
FROM prestamos p
JOIN libros l ON p.libro_id = l.id;
