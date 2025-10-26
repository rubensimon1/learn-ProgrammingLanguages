"""
Eleva al cuadrado todos los números de una lista usando lambda y map.
"""

numeros = [1,2,3,4,5]
cuadrados = list(map(lambda x: x**2, numeros))
print("Números al cuadrado:", cuadrados)
