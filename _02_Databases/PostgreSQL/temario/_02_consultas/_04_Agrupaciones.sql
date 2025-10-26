-- Contar empleados por departamento

SELECT departamento, COUNT(*) AS total_empleados
FROM empleados
GROUP BY departamento;
