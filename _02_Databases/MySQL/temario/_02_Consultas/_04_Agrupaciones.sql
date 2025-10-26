-- Contar préstamos por usuario

SELECT usuario, COUNT(*) AS total_prestamos
FROM prestamos
GROUP BY usuario;
