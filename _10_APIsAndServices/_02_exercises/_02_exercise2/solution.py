from zeep import Client

wsdl = 'http://www.dneonline.com/calculator.asmx?WSDL'
client = Client(wsdl=wsdl)

# Multiplicar 7 * 6
result = client.service.Multiply(intA=7, intB=6)
print(f'Resultado de la multiplicación: {result}')