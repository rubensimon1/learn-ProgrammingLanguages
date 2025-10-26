class Coche:
    """
    Clase que representa un Coche.
    Define atributos y métodos (comportamientos).
    """
    
    # El constructor (__init__) se llama al crear un nuevo objeto.
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad_actual = 0 # Atributo inicializado por defecto

    def acelerar(self, cantidad):
        """Aumenta la velocidad del coche."""
        self.velocidad_actual += cantidad
        print(f"El {self.marca} {self.modelo} aceleró. Velocidad: {self.velocidad_actual} km/h")

    def frenar(self, cantidad):
        """Reduce la velocidad del coche, asegurando que no sea negativa."""
        if self.velocidad_actual - cantidad < 0:
            self.velocidad_actual = 0
        else:
            self.velocidad_actual -= cantidad
        print(f"El {self.marca} {self.modelo} frenó. Velocidad: {self.velocidad_actual} km/h")

    def obtener_estado(self):
        """Devuelve el estado actual del coche."""
        return f"{self.marca} {self.modelo} va a {self.velocidad_actual} km/h."


# --- Zona de Pruebas ---
# 1. Crear Objetos (Instancias)
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Fiesta")

print("--- Inicialización ---")
print(coche1.obtener_estado())
print(coche2.obtener_estado())

print("\n--- Acciones ---")
# Coche 1 acelera y frena
coche1.acelerar(60)
coche1.frenar(15)

# Coche 2 acelera más
coche2.acelerar(100)
coche2.frenar(120) # Debe frenar hasta 0, no -20

print("\n--- Estado Final ---")
print(coche1.obtener_estado())
print(coche2.obtener_estado())