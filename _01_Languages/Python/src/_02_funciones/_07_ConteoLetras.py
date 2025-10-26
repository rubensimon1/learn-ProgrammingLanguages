"""
Cuenta cuántas veces aparece cada letra en una cadena.
"""

texto = input("Escribe una frase: ")
contador = {}
for letra in texto:
    if letra in contador:
        contador[letra] += 1
    else:
        contador[letra] = 1
print("Conteo de letras:", contador)
