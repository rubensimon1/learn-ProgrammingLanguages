DELIMITER //
CREATE TRIGGER antes_de_insertar_usuario
BEFORE INSERT ON usuarios
FOR EACH ROW
BEGIN
SET NEW.nombre = UPPER(NEW.nombre);
END //
DELIMITER ;
