import requests

url = 'https://jsonplaceholder.typicode.com/posts'
response = requests.get(url)

if response.status_code == 200:
    data = response.json()
for post in data[:10]:
    print(f"{post['id']}: {post['title']}")
else:
    print('Error:', response.status_code)