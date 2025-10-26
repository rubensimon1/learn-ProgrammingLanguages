-- Crear tabla 'empleados' con tipos avanzados

CREATE TABLE empleados (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    departamento VARCHAR(50),
    habilidades TEXT[],
    datos_adicionales JSON,
    fecha_ingreso DATE
);
