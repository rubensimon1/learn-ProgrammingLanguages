-- Crear índice GIN en columna habilidades (array)

CREATE INDEX idx_habilidades ON empleados USING GIN(habilidades);

-- Crear índice en JSON para consultar por email

CREATE INDEX idx_email_json ON empleados ((datos_adicionales->>'email'));
