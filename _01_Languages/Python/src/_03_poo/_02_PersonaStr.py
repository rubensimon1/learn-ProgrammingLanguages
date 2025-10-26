"""
Agrega un método __str__() a la clase Persona para mostrar su información de forma legible.
"""

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f"{self.nombre}, {self.edad} años"

persona1 = Persona("Luis", 30)
print(persona1)
