-- Contar tareas por categoría

SELECT c.nombre AS categoria, COUNT(t.id) AS total_tareas
FROM categorias c
LEFT JOIN tareas t ON c.id = t.categoria_id
GROUP BY c.nombre;
