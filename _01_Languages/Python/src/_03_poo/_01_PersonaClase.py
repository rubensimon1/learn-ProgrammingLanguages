"""
Crea una clase Persona con atributos nombre y edad, y muestra sus datos.
"""

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

persona1 = Persona("Ana", 25)
print("Nombre:", persona1.nombre)
print("Edad:", persona1.edad)
