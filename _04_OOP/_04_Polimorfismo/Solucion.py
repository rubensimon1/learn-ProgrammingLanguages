# --- Parte 1: Superclase (Clase Padre) ---
class Instrumento:
    """Clase base con un método genérico 'tocar'."""
    def __init__(self, nombre):
        self.nombre = nombre

    def tocar(self):
        """
        Método genérico que será sobrescrito por las clases hijas.
        """
        print(f"El instrumento {self.nombre} está sonando (sonido genérico).")

# --- Parte 2: Subclases Polimórficas ---

class Guitarra(Instrumento):
    """
    Hereda de Instrumento y sobrescribe el método 'tocar'.
    """
    def tocar(self):
        """Implementación específica de Guitarra."""
        print(f"La {self.nombre} está rasgueando un acorde: ¡Tlin Tlan!")

class Bateria(Instrumento):
    """
    Hereda de Instrumento y sobrescribe el método 'tocar'.
    """
    def tocar(self):
        """Implementación específica de Batería."""
        print(f"La {self.nombre} está golpeando un ritmo: ¡Pum Taka Pum!")

class Piano(Instrumento):
    """
    Otra subclase polimórfica.
    """
    def tocar(self):
        """Implementación específica de Piano."""
        print(f"El {self.nombre} está tocando una melodía: ¡Do Re Mi!")

# --- Parte 3: Función Polimórfica Externa ---

def hacer_musica(instrumento):
    """
    Esta función acepta CUALQUIER objeto que tenga el método 'tocar()'.
    No le importa la clase específica, solo el comportamiento (polimorfismo).
    """
    print(f"\nUsando el método 'tocar' en {instrumento.nombre}...")
    instrumento.tocar()


# --- Zona de Pruebas ---
mi_guitarra = Guitarra("Guitarra Acústica")
mi_bateria = Bateria("Batería Jazz")
mi_piano = Piano("Piano Digital")
instrumento_base = Instrumento("Cajón") # Objeto de la clase base

# Usando la misma función 'hacer_musica' con diferentes objetos.
hacer_musica(mi_guitarra)
hacer_musica(mi_bateria)
hacer_musica(mi_piano)
hacer_musica(instrumento_base)