SELECT u.nombre, p.total
FROM usuarios u
JOIN pedidos p ON u.id = p.usuario_id;
