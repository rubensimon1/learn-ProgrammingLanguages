-- Empleados que no tienen proyectos 

SELECT nombre
FROM empleados
WHERE id NOT IN (SELECT empleado_id FROM proyectos);
