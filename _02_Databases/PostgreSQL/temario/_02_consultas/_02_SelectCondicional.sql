-- Seleccionar empleados con habilidad 'SEO'

SELECT nombre, departamento
FROM empleados
WHERE 'SEO' = ANY(habilidades);
