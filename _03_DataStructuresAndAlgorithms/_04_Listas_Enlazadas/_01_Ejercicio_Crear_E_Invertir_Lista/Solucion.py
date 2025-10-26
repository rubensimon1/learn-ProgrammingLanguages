# --- Parte 1: Estructura de Clases ---

class Nodo:
    """Representa un elemento individual de la Lista Enlazada."""
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None  # Puntero al siguiente nodo

class ListaEnlazada:
    """Maneja la estructura completa."""
    def __init__(self):
        self.cabeza = None  # El punto de inicio de la lista (Head)

    def insertar_al_final(self, valor):
        """Inserta un nuevo nodo al final de la lista."""
        nuevo_nodo = Nodo(valor)
        
        if self.cabeza is None:
            # Si la lista está vacía, el nuevo nodo es la cabeza
            self.cabeza = nuevo_nodo
            return

        # Recorremos la lista hasta el último nodo (el que apunta a None)
        actual = self.cabeza
        while actual.siguiente is not None:
            actual = actual.siguiente
        
        # Enlazamos el último nodo con el nuevo nodo
        actual.siguiente = nuevo_nodo

    def imprimir_lista(self):
        """Función auxiliar para mostrar la lista."""
        actual = self.cabeza
        elementos = []
        while actual:
            elementos.append(str(actual.valor))
            actual = actual.siguiente
        print(" -> ".join(elementos) + " -> None")

# --- Parte 2: Implementación del Algoritmo de Inversión (TU TAREA) ---

def invertir_lista(cabeza_inicial):
    """
    Invierte los punteros de la Lista Enlazada. Complejidad O(n).
    
    Args:
        cabeza_inicial (Nodo): El nodo cabeza de la lista original.
        
    Returns:
        Nodo: La nueva cabeza de la lista invertida.
    """
    
    # Necesitas tres punteros auxiliares:
    # 1. 'anterior' (siempre None al principio)
    # 2. 'actual' (empieza en cabeza_inicial)
    # 3. 'siguiente_temporal' (para no perder la referencia al siguiente nodo)
    
    anterior = None
    actual = cabeza_inicial
    
    while actual is not None:
        # 1. Guarda el siguiente nodo antes de cambiar el puntero
        siguiente_temporal = actual.siguiente
        
        # 2. El nodo actual ahora apunta al nodo anterior (¡la inversión!)
        actual.siguiente = anterior
        
        # 3. Mueve los punteros un paso adelante
        anterior = actual  # 'anterior' se convierte en el nodo que acabamos de procesar
        actual = siguiente_temporal # 'actual' avanza al siguiente nodo que habíamos guardado
        
    # Cuando el bucle termina, 'anterior' es el último nodo de la lista original,
    # que ahora es la NUEVA cabeza.
    return anterior

# --- Zona de Pruebas ---
mi_lista = ListaEnlazada()
mi_lista.insertar_al_final("A")
mi_lista.insertar_al_final("B")
mi_lista.insertar_al_final("C")

print("Lista Original:")
mi_lista.imprimir_lista() # Esperado: A -> B -> C -> None

# Invertimos la lista y actualizamos la cabeza
nueva_cabeza = invertir_lista(mi_lista.cabeza)
mi_lista.cabeza = nueva_cabeza

print("\nLista Invertida:")
mi_lista.imprimir_lista() # Esperado: C -> B -> A -> None