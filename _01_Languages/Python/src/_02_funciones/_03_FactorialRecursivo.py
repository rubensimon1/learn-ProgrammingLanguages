"""
Crea un programa que calcule el factorial de un número usando bucle (antes de recursión).
"""

n = int(input("Introduce un número: "))
factorial = 1
for i in range(1, n+1):
    factorial *= i
print(f"El factorial de {n} es {factorial}")
