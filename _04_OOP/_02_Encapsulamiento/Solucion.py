class CuentaBancaria:
    """
    Clase que implementa Encapsulamiento para proteger el saldo.
    """
    
    def __init__(self, titular):
        # Atributos privados (por convención de Python)
        self.__titular = titular
        self.__saldo = 0.0

    # --- MÉTODOS PÚBLICOS (ABSTRACCIÓN Y ACCESO CONTROLADO) ---

    def depositar(self, cantidad):
        """Permite depositar dinero. O(1)."""
        if cantidad > 0:
            self.__saldo += cantidad
            print(f"Depósito de {cantidad:.2f} realizado. Nuevo saldo: {self.__saldo:.2f}")
        else:
            print("Error: La cantidad a depositar debe ser positiva.")

    def retirar(self, cantidad):
        """Permite retirar dinero si hay saldo suficiente. O(1)."""
        if cantidad <= 0:
            print("Error: La cantidad a retirar debe ser positiva.")
            return

        if self.__saldo >= cantidad:
            self.__saldo -= cantidad
            print(f"Retiro de {cantidad:.2f} realizado. Nuevo saldo: {self.__saldo:.2f}")
        else:
            print(f"Error: Saldo insuficiente. Disponible: {self.__saldo:.2f}")

    def obtener_saldo(self):
        """Getter: Método para leer el saldo de forma controlada. O(1)."""
        return self.__saldo
    
    def obtener_titular(self):
        """Getter: Obtiene el nombre del titular."""
        return self.__titular


# --- Zona de Pruebas ---
cuenta_alice = CuentaBancaria("Alice Smith")

print(f"Cuenta de: {cuenta_alice.obtener_titular()}")
print(f"Saldo inicial: {cuenta_alice.obtener_saldo():.2f}")

print("\n--- Operaciones Controladas ---")
cuenta_alice.depositar(500)
cuenta_alice.retirar(150)
cuenta_alice.retirar(400) # Debería fallar

print("\n--- Intentando Romper el Encapsulamiento (mala práctica) ---")
# En Python, el doble guion bajo hace que sea difícil acceder, pero no imposible.
# Sin embargo, a nivel profesional, esto te dice que NO debes tocarlo.
try:
    cuenta_alice.__saldo = 99999.00
    print(f"Salgo después de intento (MALO): {cuenta_alice.__saldo}") # NO es el saldo real!
except AttributeError:
    pass

print(f"Saldo REAL final (obtenido por Getter): {cuenta_alice.obtener_saldo():.2f}")