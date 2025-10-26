-- Crear tabla 'proyectos'

CREATE TABLE proyectos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50),
    empleado_id INT REFERENCES empleados(id)
);

-- Mostrar empleados con sus proyectos

SELECT e.nombre, p.nombre AS proyecto
FROM empleados e
JOIN proyectos p ON e.id = p.empleado_id;
