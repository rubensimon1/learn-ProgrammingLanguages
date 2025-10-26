class Grafo:
    """Implementación de un Grafo No Dirigido usando Lista de Adyacencia."""

    def __init__(self):
        # La lista de adyacencia se representa con un diccionario:
        # Clave: Vértice | Valor: Lista de vecinos (Aristas)
        self.lista_adyacencia = {}

    def agregar_vertice(self, vertice):
        """Agrega un nuevo vértice al grafo. O(1)."""
        if vertice not in self.lista_adyacencia:
            self.lista_adyacencia[vertice] = []
            print(f"Vértice '{vertice}' agregado.")
        else:
            print(f"Vértice '{vertice}' ya existe.")

    def agregar_arista(self, v1, v2):
        """
        Agrega una arista bidireccional entre v1 y v2 (No Dirigido). O(1).
        """
        # 1. Verificar que ambos vértices existan antes de agregar la arista
        if v1 not in self.lista_adyacencia or v2 not in self.lista_adyacencia:
            print("Error: Uno o ambos vértices no existen.")
            return

        # 2. Conectar v1 a v2 (si v2 no es ya vecino de v1)
        if v2 not in self.lista_adyacencia[v1]:
            self.lista_adyacencia[v1].append(v2)
            
        # 3. Conectar v2 a v1 (para que sea no dirigido)
        if v1 not in self.lista_adyacencia[v2]:
            self.lista_adyacencia[v2].append(v1)
        
        print(f"Arista agregada entre {v1} y {v2}.")

    def imprimir_grafo(self):
        """Función auxiliar para visualizar el grafo."""
        for vertice, vecinos in self.lista_adyacencia.items():
            print(f"Vértice {vertice}: -> {', '.join(vecinos)}")


# --- Zona de Pruebas ---
red_social = Grafo()

# Agregar personas (vértices)
red_social.agregar_vertice("Alice")
red_social.agregar_vertice("Bob")
red_social.agregar_vertice("Charlie")
red_social.agregar_vertice("David")

# Agregar amistades (aristas)
red_social.agregar_arista("Alice", "Bob")
red_social.agregar_arista("Bob", "Charlie")
red_social.agregar_arista("Alice", "David")
red_social.agregar_arista("David", "Bob")

print("\nEstructura del Grafo (Lista de Adyacencia):")
red_social.imprimir_grafo()