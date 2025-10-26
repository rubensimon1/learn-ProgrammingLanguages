class HistorialWeb:
    """Simula el historial de navegación web usando una Pila (LIFO)."""

    def __init__(self):
        # Usaremos una lista de Python como nuestra Pila
        self.pila_urls = []

    def visitar_pagina(self, url):
        """Añade una URL a la cima de la Pila (push)."""
        # Pista: En Python, usar append() para añadir al final es O(1)
        self.pila_urls.append(url)
        print(f"Visitando: {url}")

    def retroceder(self):
        """Quita y devuelve la última URL visitada (pop)."""
        
        if not self.pila_urls:
            # Pila vacía
            return "No hay más historial."
        else:
            # Pista: En Python, usar pop() sin índice quita el último elemento (O(1))
            ultima_url = self.pila_urls.pop()
            return f"Retrocediendo a: {ultima_url}"

# --- Zona de Pruebas ---
navegador = HistorialWeb()
navegador.visitar_pagina("google.com")
navegador.visitar_pagina("github.com")
navegador.visitar_pagina("mi-blog.com")

print("--- Retrocediendo ---")
print(navegador.retroceder())
print(navegador.retroceder())
print(navegador.retroceder())
print(navegador.retroceder())