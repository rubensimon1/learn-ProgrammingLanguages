-- Agregar habilidad a un empleado

UPDATE empleados
SET habilidades = array_append(habilidades, 'Liderazgo')
WHERE nombre = 'Ana Pérez';
