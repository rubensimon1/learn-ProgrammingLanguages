SELECT COUNT(*) AS total_usuarios FROM usuarios;
SELECT AVG(edad) AS edad_promedio FROM usuarios;
SELECT ciudad, COUNT(*) AS cantidad FROM usuarios GROUP BY ciudad;
