"""
Añade una línea al final de un archivo datos.txt existente.
"""

nueva_linea = input("Escribe la línea que quieres añadir: ")

try:
    with open("datos.txt", "a", encoding="utf-8") as archivo:
        archivo.write(nueva_linea + "\n")
    print("Línea añadida correctamente.")
except FileNotFoundError:
    print("El archivo datos.txt no existe. Crea uno primero.")
