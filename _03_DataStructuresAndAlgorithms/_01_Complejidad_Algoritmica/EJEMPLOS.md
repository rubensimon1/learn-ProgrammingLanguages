# =================================================================
# ⚙️ ESTRUCTURAS DE DATOS Y ALGORITMOS (DSA) - EJEMPLOS COMPLETOS
# =================================================================
# Este archivo contiene las implementaciones didácticas en Python
# de las principales estructuras y algoritmos vistos.
# =================================================================

from collections import deque # Estructura eficiente para Colas

# =================================================================
# 1. ⏱️ COMPLEJIDAD ALGORÍTMICA (BIG O)
# =================================================================

# O(1) - Constante
def acceso_constante(lista):
    """Accede al primer elemento de la lista."""
    return lista[0]

# O(n) - Lineal
def suma_lineal(lista):
    """Suma todos los elementos de la lista."""
    total = 0
    for elemento in lista:
        total += elemento
    return total

# O(n^2) - Cuadrática
def imprimir_pares_cuadraticos(lista):
    """Imprime todos los pares posibles (bucles anidados)."""
    print(f"\n--- O(n^2) - Imprimiendo {len(lista) * len(lista)} pares ---")
    for i in lista:
        for j in lista:
            print(f"({i}, {j})", end=" ")
    print("\n--- Fin O(n^2) ---")

# O(log n) - Logarítmica (se implementa mejor con Búsqueda Binaria)


# =================================================================
# 2. 📚 ARRAYS/LISTAS
# =================================================================

# Ejercicio 1: Acceso Directo (O(1))
def obtener_elemento(lista, posicion):
    """Devuelve el elemento de la lista en la posición dada. O(1)"""
    try:
        return lista[posicion]
    except IndexError:
        return None

# =================================================================
# 3. 🛒 PILAS Y COLAS
# =================================================================

# PILA (Stack - LIFO)
class HistorialWeb:
    """Simula el historial web usando una Pila."""
    def __init__(self):
        self.pila_urls = []

    def visitar_pagina(self, url):
        self.pila_urls.append(url) # push - O(1)

    def retroceder(self):
        if not self.pila_urls:
            return "No hay más historial."
        return self.pila_urls.pop() # pop - O(1)

# COLA (Queue - FIFO)
# Usamos deque de collections para garantizar la eficiencia O(1)
class CajeroSupermercado:
    """Simula una cola de clientes usando collections.deque."""
    def __init__(self):
        self.cola_clientes = deque()

    def llega_cliente(self, nombre):
        self.cola_clientes.append(nombre) # enqueue - O(1)

    def atender_cliente(self):
        if not self.cola_clientes:
            return "No hay clientes esperando."
        return self.cola_clientes.popleft() # dequeue - O(1)

# =================================================================
# 4. 🔗 LISTAS ENLAZADAS
# =================================================================

class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None

class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def insertar_al_final(self, valor):
        nuevo_nodo = Nodo(valor)
        if self.cabeza is None:
            self.cabeza = nuevo_nodo
            return
        actual = self.cabeza
        while actual.siguiente is not None:
            actual = actual.siguiente
        actual.siguiente = nuevo_nodo

    def imprimir_lista(self):
        actual = self.cabeza
        elementos = []
        while actual:
            elementos.append(str(actual.valor))
            actual = actual.siguiente
        return " -> ".join(elementos) + " -> None"

def invertir_lista(cabeza_inicial):
    """Invierte los punteros de la Lista Enlazada. O(n)."""
    anterior = None
    actual = cabeza_inicial
    while actual is not None:
        siguiente_temporal = actual.siguiente
        actual.siguiente = anterior
        anterior = actual
        actual = siguiente_temporal
    return anterior # La nueva cabeza

# =================================================================
# 5. 🔍 ALGORITMOS DE BÚSQUEDA
# =================================================================

# Búsqueda Lineal (O(n))
def busqueda_lineal(lista, valor_buscado):
    """Busca un valor recorriendo la lista elemento por elemento."""
    for indice, elemento in enumerate(lista):
        if elemento == valor_buscado:
            return indice
    return -1

# Búsqueda Binaria (O(log n))
def busqueda_binaria(lista_ordenada, valor_buscado):
    """Busca un valor en una lista ORDENADA dividiendo el espacio a la mitad."""
    inicio = 0
    fin = len(lista_ordenada) - 1
    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista_ordenada[medio] == valor_buscado:
            return medio
        elif lista_ordenada[medio] < valor_buscado:
            inicio = medio + 1
        else:
            fin = medio - 1
    return -1

# =================================================================
# 6. 🛠️ ALGORITMOS DE ORDENAMIENTO
# =================================================================

# Bubble Sort (O(n^2))
def ordenamiento_burbuja(lista_desordenada):
    """Ordena la lista comparando e intercambiando pares adyacentes."""
    n = len(lista_desordenada)
    for i in range(n):
        for j in range(0, n - i - 1):
            if lista_desordenada[j] > lista_desordenada[j + 1]:
                # Intercambio
                lista_desordenada[j], lista_desordenada[j + 1] = lista_desordenada[j + 1], lista_desordenada[j]
    return lista_desordenada

# Quick Sort (O(n log n) promedio)
def quick_sort(lista):
    """Ordena la lista usando la estrategia 'Divide y Vencerás' con un pivote."""
    if len(lista) <= 1:
        return lista
    
    pivote = lista[0]
    menores = [x for x in lista[1:] if x < pivote]
    iguales = [x for x in lista if x == pivote]
    mayores = [x for x in lista[1:] if x > pivote]

    return quick_sort(menores) + iguales + quick_sort(mayores)

# =================================================================
# 7. 🌳 ÁRBOLES BINARIOS DE BÚSQUEDA (BST)
# =================================================================

# Clase Nodo (ya definida arriba, pero la redefinimos para claridad)
class NodoArbol:
    def __init__(self, valor):
        self.valor = valor
        self.izquierda = None
        self.derecha = None

class BST:
    def __init__(self):
        self.raiz = None

    def _insertar_recursivo(self, nodo_actual, valor):
        if nodo_actual is None:
            return NodoArbol(valor)
        if valor < nodo_actual.valor:
            nodo_actual.izquierda = self._insertar_recursivo(nodo_actual.izquierda, valor)
        elif valor > nodo_actual.valor:
            nodo_actual.derecha = self._insertar_recursivo(nodo_actual.derecha, valor)
        return nodo_actual

    def insertar(self, valor):
        self.raiz = self._insertar_recursivo(self.raiz, valor)

    def recorrido_inorder(self, nodo):
        """Imprime los valores en orden (Izquierda -> Raíz -> Derecha)."""
        if nodo:
            self.recorrido_inorder(nodo.izquierda)
            print(nodo.valor, end=" ")
            self.recorrido_inorder(nodo.derecha)

# =================================================================
# 8. 🕸️ GRAFOS
# =================================================================

class Grafo:
    """Implementación de un Grafo No Dirigido con Lista de Adyacencia."""

    def __init__(self):
        self.lista_adyacencia = {}

    def agregar_vertice(self, vertice):
        if vertice not in self.lista_adyacencia:
            self.lista_adyacencia[vertice] = []

    def agregar_arista(self, v1, v2):
        self.agregar_vertice(v1) # Asegurar que existe
        self.agregar_vertice(v2) # Asegurar que existe

        # No dirigido: conexión bidireccional
        if v2 not in self.lista_adyacencia[v1]:
            self.lista_adyacencia[v1].append(v2)
        if v1 not in self.lista_adyacencia[v2]:
            self.lista_adyacencia[v2].append(v1)
        
    def imprimir_grafo(self):
        for vertice, vecinos in self.lista_adyacencia.items():
            print(f"Vértice {vertice}: -> {', '.join(vecinos)}")


# =================================================================
# ZONA DE PRUEBAS GENERAL
# =================================================================

print("=========================================")
print("PRUEBA 1: COMPLEJIDAD (O(n^2))")
imprimir_pares_cuadraticos([1, 2, 3])
print("=========================================")


print("\nPRUEBA 2: PILAS (LIFO)")
historial = HistorialWeb()
historial.visitar_pagina("google.com")
historial.visitar_pagina("youtube.com")
print(f"Retroceder: {historial.retroceder()}")
print("=========================================")


print("\nPRUEBA 3: COLAS (FIFO)")
caja = CajeroSupermercado()
caja.llega_cliente("Alice")
caja.llega_cliente("Bob")
print(f"Atender: {caja.atender_cliente()}")
print(f"Atender: {caja.atender_cliente()}")
print("=========================================")


print("\nPRUEBA 4: LISTAS ENLAZADAS (Inversión)")
lista_enl = ListaEnlazada()
lista_enl.insertar_al_final("A")
lista_enl.insertar_al_final("B")
lista_enl.insertar_al_final("C")
print(f"Original: {lista_enl.imprimir_lista()}")
lista_enl.cabeza = invertir_lista(lista_enl.cabeza)
print(f"Invertida: {lista_enl.imprimir_lista()}")
print("=========================================")


print("\nPRUEBA 5: BÚSQUEDA BINARIA (O(log n))")
lista_ord = [2, 5, 8, 12, 16, 23]
print(f"Lista: {lista_ord}")
print(f"Buscando 16: Índice {busqueda_binaria(lista_ord, 16)}")
print(f"Buscando 99: Índice {busqueda_binaria(lista_ord, 99)}")
print("=========================================")


print("\nPRUEBA 6: QUICK SORT (O(n log n))")
lista_des = [5, 1, 4, 2, 8]
print(f"Original: {lista_des}")
print(f"Quick Sort: {quick_sort(lista_des)}")
print("=========================================")


print("\nPRUEBA 7: ÁRBOLES (BST In-order)")
arbol = BST()
valores = [50, 30, 70, 20, 40, 60, 80]
for val in valores: arbol.insertar(val)
print("Recorrido In-order (ordenado):")
arbol.recorrido_inorder(arbol.raiz) 
print("\n=========================================")


print("\nPRUEBA 8: GRAFOS")
red = Grafo()
red.agregar_arista("Alice", "Bob")
red.agregar_arista("Bob", "Charlie")
red.agregar_arista("Alice", "David")
red.imprimir_grafo()
print("=========================================")