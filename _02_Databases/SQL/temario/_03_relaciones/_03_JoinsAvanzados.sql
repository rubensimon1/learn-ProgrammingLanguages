-- LEFT JOIN: muestra todos los usuarios aunque no tengan pedidos

SELECT u.nombre, p.total
FROM usuarios u
LEFT JOIN pedidos p ON u.id = p.usuario_id;

-- RIGHT JOIN (depende del motor SQL)

SELECT u.nombre, p.total
FROM usuarios u
RIGHT JOIN pedidos p ON u.id = p.usuario_id;
