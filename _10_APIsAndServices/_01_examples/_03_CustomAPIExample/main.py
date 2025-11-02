from flask import Flask, jsonify, request

app = Flask(__name__)

# Datos de ejemplo
books = [
    {'id': 1, 'title': 'El Quijote', 'author': 'Miguel de Cervantes'},
    {'id': 2, 'title': '1984', 'author': 'George Orwell'}
]

# Endpoint para obtener todos los libros
@app.route('/books', methods=['GET'])
def get_books():
    return jsonify(books)

# Endpoint para obtener un libro por id
@app.route('/books/<int:book_id>', methods=['GET'])
def get_book(book_id):
    book = next((b for b in books if b['id'] == book_id), None)
    if book:
        return jsonify(book)
    else:
        return jsonify({'error': 'Libro no encontrado'}), 404

# Endpoint para añadir un nuevo libro
@app.route('/books', methods=['POST'])
def add_book():
    new_book = request.json
    books.append(new_book)
    return jsonify(new_book), 201

if __name__ == '__main__':
    app.run(debug=True)