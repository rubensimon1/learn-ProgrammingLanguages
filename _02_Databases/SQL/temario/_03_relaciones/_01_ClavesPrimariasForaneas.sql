ALTER TABLE pedidos
ADD CONSTRAINT fk_usuario
FOREIGN KEY (usuario_id) REFERENCES usuarios(id);
