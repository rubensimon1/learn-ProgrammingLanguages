"""
Lee un archivo datos.txt y muestra el número de líneas que contiene.
"""

try:
    with open("datos.txt", "r", encoding="utf-8") as archivo:
        lineas = archivo.readlines()
        print("Número de líneas:", len(lineas))
except FileNotFoundError:
    print("El archivo datos.txt no existe. Crea uno primero.")
