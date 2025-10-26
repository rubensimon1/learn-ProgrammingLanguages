"""
Crea un programa que lea un archivo datos.txt e imprima cada línea en mayúsculas.
"""

try:
    with open("datos.txt", "r", encoding="utf-8") as archivo:
        for linea in archivo:
            print(linea.strip().upper())
except FileNotFoundError:
    print("El archivo datos.txt no existe. Crea uno en la misma carpeta.")
