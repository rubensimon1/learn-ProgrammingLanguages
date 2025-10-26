import csv
import os

archivo = "usuarios.csv"
if not os.path.exists(archivo):
    with open(archivo, "w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["Nombre", "Email", "Edad"])

while True:
    accion = input("Acción (agregar/listar/buscar/salir): ").lower()
    if accion == "agregar":
        nombre = input("Nombre: ")
        email = input("Email: ")
        edad = input("Edad: ")
        with open(archivo, "a", newline="") as f:
            writer = csv.writer(f)
            writer.writerow([nombre, email, edad])
    elif accion == "listar":
        with open(archivo, "r", newline="") as f:
            reader = csv.reader(f)
            next(reader)  # saltar encabezado
            for row in reader:
                print(", ".join(row))
    elif accion == "buscar":
        nombre_buscar = input("Nombre a buscar: ").lower()
        with open(archivo, "r", newline="") as f:
            reader = csv.reader(f)
            next(reader)
            encontrados = [row for row in reader if nombre_buscar in row[0].lower()]
            if encontrados:
                for e in encontrados:
                    print(", ".join(e))
            else:
                print("No encontrado")
    elif accion == "salir":
        break
    else:
        print("Acción no válida")
