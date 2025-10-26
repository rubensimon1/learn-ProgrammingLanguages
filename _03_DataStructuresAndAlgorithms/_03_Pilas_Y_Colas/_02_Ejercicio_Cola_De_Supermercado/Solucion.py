# NOTA: Para hacer una Cola O(1) en Python, se recomienda usar 'from collections import deque'
# Pero usaremos la lista simple para mantener la coherencia con el nivel introductorio.

class CajeroSupermercado:
    """Simula una cola de clientes (FIFO)."""

    def __init__(self):
        # Usaremos una lista de Python como nuestra Cola
        self.cola_clientes = []

    def llega_cliente(self, nombre):
        """Añade un cliente al final de la Cola (enqueue). O(1)"""
        self.cola_clientes.append(nombre)
        print(f"Llega cliente: {nombre}")

    def atender_cliente(self):
        """Quita y devuelve el cliente del frente (dequeue). O(n) con listas."""
        
        if not self.cola_clientes:
            # Cola vacía
            return "No hay clientes esperando."
        else:
            # Pista: Quitar el primer elemento de la lista (índice 0).
            # Advertencia: ¡Esta operación es O(n) en Python! Solo para fines educativos.
            cliente_atendido = self.cola_clientes.pop(0)
            return f"Atendiendo a: {cliente_atendido}"

# --- Zona de Pruebas ---
caja = CajeroSupermercado()
caja.llega_cliente("Alice")
caja.llega_cliente("Bob")

print("--- Atendiendo ---")
print(caja.atender_cliente())
caja.llega_cliente("Charlie")
print(caja.atender_cliente())
print(caja.atender_cliente())
print(caja.atender_cliente())