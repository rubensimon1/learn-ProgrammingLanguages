"""
Crea un programa que sume dos números, usando 0 por defecto si no se introduce algún valor.
"""

a = input("Introduce el primer número (Enter = 0): ")
b = input("Introduce el segundo número (Enter = 0): ")

a = int(a) if a else 0
b = int(b) if b else 0

print(f"La suma es: {a + b}")
