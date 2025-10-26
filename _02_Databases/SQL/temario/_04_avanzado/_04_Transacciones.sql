START TRANSACTION;
UPDATE usuarios SET edad = edad - 1 WHERE nombre = 'Laura';
UPDATE usuarios SET edad = edad + 1 WHERE nombre = 'Ana';
COMMIT;
