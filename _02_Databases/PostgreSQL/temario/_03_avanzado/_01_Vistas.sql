-- Crear vista de empleados con proyectos y habilidades

CREATE VIEW vista_empleados_proyectos AS
SELECT e.nombre, e.departamento, e.habilidades, p.nombre AS proyecto
FROM empleados e
LEFT JOIN proyectos p ON e.id = p.empleado_id;
