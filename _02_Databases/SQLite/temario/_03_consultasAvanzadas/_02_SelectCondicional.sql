-- Mostrar solo tareas pendientes

SELECT titulo, descripcion
FROM tareas
WHERE completada = 0;
