import csv
import os

archivo = "reservas.csv"
if not os.path.exists(archivo):
    with open(archivo, "w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["Nombre", "Hora"])

def mostrar_reservas():
    with open(archivo, "r", newline="") as f:
        reader = csv.reader(f)
        next(reader)
        print("Reservas actuales:")
        for row in reader:
            print(f"{row[0]} - {row[1]}")

while True:
    accion = input("Acción (reservar/listar/salir): ").lower()
    if accion == "reservar":
        nombre = input("Nombre: ")
        hora = input("Hora (HH:MM): ")
        with open(archivo, "r", newline="") as f:
            reader = csv.reader(f)
            next(reader)
            if any(row[1] == hora for row in reader):
                print("Hora ocupada, elige otra")
                continue
        with open(archivo, "a", newline="") as f:
            writer = csv.writer(f)
            writer.writerow([nombre, hora])
            print("Reserva realizada")
    elif accion == "listar":
        mostrar_reservas()
    elif accion == "salir":
        break
    else:
        print("Acción no válida")
