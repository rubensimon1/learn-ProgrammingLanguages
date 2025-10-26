# --- Parte 1: Superclase (Clase Padre) ---
class Animal:
    """
    Clase base de la que heredarán todas las criaturas.
    Define el comportamiento común (comer).
    """
    def __init__(self, nombre):
        self.nombre = nombre
        print(f"Animal '{self.nombre}' creado.")

    def comer(self):
        """Método que todos los animales heredan."""
        print(f"{self.nombre} está comiendo.")

# --- Parte 2: Subclases (Clases Hija) ---

class Perro(Animal):
    """
    Hereda de Animal.
    """
    def __init__(self, nombre, raza):
        # Llama al constructor de la clase Animal para inicializar 'nombre'
        super().__init__(nombre) 
        self.raza = raza # Nuevo atributo propio de Perro
        
    def ladrar(self):
        """Método propio de Perro."""
        print(f"El perro {self.nombre} ({self.raza}) dice: ¡Guau guau!")

class Gato(Animal):
    """
    Hereda de Animal.
    """
    def __init__(self, nombre):
        # Llama al constructor de la clase Animal para inicializar 'nombre'
        super().__init__(nombre) 

    def maullar(self):
        """Método propio de Gato."""
        print(f"El gato {self.nombre} dice: ¡Miau!")

# --- Zona de Pruebas ---
perro1 = Perro("Fido", "Labrador")
gato1 = Gato("Garfield")

print("\n--- Comportamiento Heredado (Animal) ---")
perro1.comer()
gato1.comer()

print("\n--- Comportamiento Propio ---")
perro1.ladrar()
gato1.maullar()

print("\n--- Comprobación de Tipo ---")
print(f"¿Fido es un Perro? {isinstance(perro1, Perro)}")
print(f"¿Fido es un Animal? {isinstance(perro1, Animal)}") # True!