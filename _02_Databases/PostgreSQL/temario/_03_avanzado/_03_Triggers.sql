-- Trigger que actualiza fecha_modificacion al actualizar empleado

ALTER TABLE empleados ADD COLUMN fecha_modificacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

CREATE OR REPLACE FUNCTION actualizar_fecha_modificacion()
RETURNS TRIGGER AS $$
BEGIN
    NEW.fecha_modificacion = NOW();
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_fecha_mod
BEFORE UPDATE ON empleados
FOR EACH ROW
EXECUTE FUNCTION actualizar_fecha_modificacion();
