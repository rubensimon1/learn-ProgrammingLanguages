-- Trigger para actualizar fecha de modificación en tabla libros

ALTER TABLE libros ADD COLUMN fecha_modificacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;

-- Trigger al actualizar libro

CREATE TRIGGER actualizar_fecha BEFORE UPDATE ON libros
FOR EACH ROW
SET NEW.fecha_modificacion = NOW();
