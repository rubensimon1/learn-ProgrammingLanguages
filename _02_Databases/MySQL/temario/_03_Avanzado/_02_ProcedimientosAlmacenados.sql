-- Procedimiento para agregar préstamo

DELIMITER $$
CREATE PROCEDURE agregarPrestamo(IN nombreUsuario VARCHAR(50), IN idLibro INT, IN fechaPrestamo DATE)
BEGIN
    INSERT INTO prestamos (usuario, libro_id, fecha)
    VALUES (nombreUsuario, idLibro, fechaPrestamo);
END$$
DELIMITER ;
