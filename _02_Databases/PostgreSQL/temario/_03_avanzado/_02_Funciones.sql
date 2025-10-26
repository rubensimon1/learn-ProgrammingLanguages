-- Función para calcular antigüedad en años

CREATE OR REPLACE FUNCTION antiguedad(fecha DATE)
RETURNS INT AS $$
BEGIN
    RETURN DATE_PART('year', CURRENT_DATE) - DATE_PART('year', fecha);
END;
$$ LANGUAGE plpgsql;

-- Ejemplo de uso

SELECT nombre, antiguedad(fecha_ingreso) AS años_trabajando FROM empleados;
