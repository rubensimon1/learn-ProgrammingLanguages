"""
Crea una clase Empleado que herede de Persona y añada el atributo salario.
"""

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

class Empleado(Persona):
    def __init__(self, nombre, edad, salario):
        super().__init__(nombre, edad)
        self.salario = salario

empleado1 = Empleado("Carlos", 40, 2500)
print("Nombre:", empleado1.nombre)
print("Edad:", empleado1.edad)
print("Salario:", empleado1.salario)
