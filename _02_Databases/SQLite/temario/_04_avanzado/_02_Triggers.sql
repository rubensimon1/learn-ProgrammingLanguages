-- Trigger para registrar cambios de tareas

CREATE TABLE log_tareas (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tarea_id INTEGER,
    accion TEXT,
    fecha TEXT DEFAULT (datetime('now'))
);

CREATE TRIGGER log_tarea_update
AFTER UPDATE ON tareas
FOR EACH ROW
BEGIN
    INSERT INTO log_tareas (tarea_id, accion)
    VALUES (NEW.id, 'Actualizada');
END;
