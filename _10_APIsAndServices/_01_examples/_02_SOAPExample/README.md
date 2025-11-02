# Ejemplo de SOAP API

Este ejemplo muestra cómo **consumir un servicio SOAP** usando Python (con `zeep`) o Java. Aprenderás a enviar solicitudes, recibir respuestas XML y procesar los datos.

---

## Objetivo

- Entender cómo funciona un servicio SOAP.
- Aprender a enviar solicitudes y procesar respuestas XML.
- Conocer la diferencia entre SOAP y REST.

---

## Estructura
SOAPExample/
├─ README.md # Explicación del ejemplo
└─ main.py # Código de ejemplo

---

## Código de ejemplo en Python (`main.py`)

```python
from zeep import Client

# URL del WSDL (archivo de definición del servicio)
wsdl = 'http://www.dneonline.com/calculator.asmx?WSDL'

# Crear cliente SOAP
client = Client(wsdl=wsdl)

# Llamada al método Add del servicio
result = client.service.Add(intA=5, intB=3)

print(f'Resultado de la suma: {result}')
```

# Explicación
1. Importamos zeep: Librería para manejar servicios SOAP en Python.
2. URL WSDL: Define la estructura y métodos del servicio.
3. Crear cliente SOAP: Permite conectarse al servicio.
4. Llamar a un método: En este ejemplo, Add suma dos números.
5. Procesar respuesta: La respuesta se imprime en consola.