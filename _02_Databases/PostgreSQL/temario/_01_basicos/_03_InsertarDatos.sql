-- Insertar empleados con array y JSON

INSERT INTO empleados (nombre, departamento, habilidades, datos_adicionales, fecha_ingreso) VALUES
('Ana Pérez', 'Ventas', ARRAY['Comercial','Negociación'], '{"email": "ana@empresa.com"}', '2020-03-15'),
('Carlos López', 'Marketing', ARRAY['SEO','Redes Sociales'], '{"email": "carlos@empresa.com"}', '2019-11-01');
