"""
Usa try...except para manejar un posible error de división por cero.
"""

a = int(input("Introduce el numerador: "))
b = int(input("Introduce el denominador: "))

try:
    resultado = a / b
    print("Resultado:", resultado)
except ZeroDivisionError:
    print("Error: no se puede dividir entre cero.")
