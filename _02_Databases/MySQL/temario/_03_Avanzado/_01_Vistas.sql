-- Usuarios que no tienen préstamos

SELECT DISTINCT usuario
FROM prestamos
WHERE usuario NOT IN (
    SELECT usuario FROM prestamos
);
