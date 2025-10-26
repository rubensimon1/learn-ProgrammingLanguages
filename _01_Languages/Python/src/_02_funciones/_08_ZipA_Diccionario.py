"""
Combina dos listas en un diccionario usando zip.
"""

claves = ["nombre","edad","ciudad"]
valores = ["Ana", 25, "Madrid"]
diccionario = dict(zip(claves, valores))
print("Diccionario:", diccionario)
