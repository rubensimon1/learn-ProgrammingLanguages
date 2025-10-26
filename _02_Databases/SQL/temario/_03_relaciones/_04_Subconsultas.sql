SELECT nombre
FROM usuarios
WHERE id IN (
SELECT usuario_id FROM pedidos WHERE total > 40
);
