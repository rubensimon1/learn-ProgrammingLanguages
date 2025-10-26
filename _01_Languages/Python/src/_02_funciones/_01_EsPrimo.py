"""
Define un programa que reciba un número y diga si es primo o no.
"""

numero = int(input("Introduce un número: "))
if numero < 2:
    print(f"{numero} no es primo.")
else:
    es_primo = True
    for i in range(2, numero):
        if numero % i == 0:
            es_primo = False
            break
    if es_primo:
        print(f"{numero} es primo.")
    else:
        print(f"{numero} no es primo.")
