"""
Crea un programa que escriba varias líneas en un archivo datos.txt.
"""

lineas = ["Primera línea", "Segunda línea", "Tercera línea"]

with open("datos.txt", "w", encoding="utf-8") as archivo:
    for linea in lineas:
        archivo.write(linea + "\n")

print("Archivo datos.txt creado con éxito.")
