-- Seleccionar libros publicados después de 1950

SELECT titulo, autor FROM libros
WHERE publicado > '1950-01-01';
