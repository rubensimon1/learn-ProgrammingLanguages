import requests

# URL de prueba
url = 'https://jsonplaceholder.typicode.com/posts/1'

# Realizar solicitud GET
response = requests.get(url)

if response.status_code == 200:
    print('Solicitud exitosa!')
    print(response.json())
else:
    print('Error en la solicitud:', response.status_code)