"""
Cuenta cuántas palabras hay en un archivo datos.txt.
"""

try:
    with open("datos.txt", "r", encoding="utf-8") as archivo:
        texto = archivo.read()
        palabras = texto.split()
        print("Número de palabras:", len(palabras))
except FileNotFoundError:
    print("El archivo datos.txt no existe. Crea uno primero.")
