"""
Crea una lista de los múltiplos de 3 entre 1 y 30 usando list comprehension.
"""

multiplos3 = [x for x in range(1,31) if x % 3 == 0]
print("Múltiplos de 3:", multiplos3)
