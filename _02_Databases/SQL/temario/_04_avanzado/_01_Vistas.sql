CREATE VIEW vista_pedidos AS
SELECT u.nombre, p.total
FROM usuarios u
JOIN pedidos p ON u.id = p.usuario_id;

SELECT * FROM vista_pedidos;
