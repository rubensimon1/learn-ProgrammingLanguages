"""
Usa una dict comprehension para crear un diccionario con los cuadrados de los números del 1 al 5.
"""

cuadrados = {x: x**2 for x in range(1,6)}
print("Diccionario de cuadrados:", cuadrados)
