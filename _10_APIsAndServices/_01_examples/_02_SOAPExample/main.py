from zeep import Client

# URL del WSDL (archivo de definición del servicio)
wsdl = 'http://www.dneonline.com/calculator.asmx?WSDL'

# Crear cliente SOAP
client = Client(wsdl=wsdl)

# Llamada al método Add del servicio
result = client.service.Add(intA=5, intB=3)

print(f'Resultado de la suma: {result}')