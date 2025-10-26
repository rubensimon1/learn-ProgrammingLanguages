DELIMITER //
CREATE PROCEDURE aumentar_edad()
BEGIN
UPDATE usuarios SET edad = edad + 1;
END //
DELIMITER ;

CALL aumentar_edad();
