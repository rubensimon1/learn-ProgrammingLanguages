import requests

# URL de la API de ejemplo
url = 'https://jsonplaceholder.typicode.com/posts'

# Hacer una solicitud GET
response = requests.get(url)

# Verificar que la solicitud fue exitosa
if response.status_code == 200:
    data = response.json()
print('Primeros 5 posts:')
for post in data[:5]:
    print(f"{post['id']}: {post['title']}")
else:
    print('Error en la solicitud:', response.status_code)