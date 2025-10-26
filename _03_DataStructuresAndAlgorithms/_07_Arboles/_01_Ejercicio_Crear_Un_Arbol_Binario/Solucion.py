class Nodo:
    """Representa un nodo en el Árbol Binario de Búsqueda."""
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None

class BST:
    """Clase principal para manejar el Árbol Binario de Búsqueda."""
    def __init__(self):
        self.raiz = None

    def _insertar_recursivo(self, nodo_actual, valor):
        """Función auxiliar recursiva para insertar un valor."""
        if nodo_actual is None:
            return Nodo(valor)

        if valor < nodo_actual.valor:
            nodo_actual.izquierda = self._insertar_recursivo(nodo_actual.izquierda, valor)
        elif valor > nodo_actual.valor:
            nodo_actual.derecha = self._insertar_recursivo(nodo_actual.derecha, valor)
        
        return nodo_actual

    def insertar(self, valor):
        """Método público para insertar un valor en el BST."""
        self.raiz = self._insertar_recursivo(self.raiz, valor)

    def recorrido_inorder(self, nodo):
        """
        Realiza el recorrido In-order (Izquierda -> Raíz -> Derecha). O(n).
        """
        if nodo:
            # 1. Recorrer el sub-árbol izquierdo
            self.recorrido_inorder(nodo.izquierda)
            
            # 2. Procesar la raíz (imprimir el valor)
            print(nodo.valor, end=" ")
            
            # 3. Recorrer el sub-árbol derecho
            self.recorrido_inorder(nodo.derecha)


# --- Zona de Pruebas ---
arbol = BST()
valores = [50, 30, 70, 20, 40, 60, 80]

print("Insertando valores:", valores)
for val in valores:
    arbol.insertar(val)

print("\nRecorrido In-order (¡debe ser ordenado!):")
# Llamamos al método desde la raíz del árbol
arbol.recorrido_inorder(arbol.raiz) 
# Esperado: 20 30 40 50 60 70 80