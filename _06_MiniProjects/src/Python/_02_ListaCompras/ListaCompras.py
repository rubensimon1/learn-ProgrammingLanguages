import os

archivo = "lista_compras.txt"
if not os.path.exists(archivo):
    open(archivo, "w").close()

while True:
    accion = input("Acción (agregar/eliminar/listar/salir): ").lower()
    if accion == "agregar":
        item = input("Producto a agregar: ")
        with open(archivo, "a") as f:
            f.write(item + "\n")
    elif accion == "eliminar":
        item = input("Producto a eliminar: ")
        with open(archivo, "r") as f:
            productos = f.read().splitlines()
        if item in productos:
            productos.remove(item)
            with open(archivo, "w") as f:
                f.write("\n".join(productos) + "\n")
            print(f"{item} eliminado.")
        else:
            print("Producto no encontrado.")
    elif accion == "listar":
        with open(archivo, "r") as f:
            productos = f.read().splitlines()
            print("Lista de compras:")
            for p in productos:
                print("-", p)
    elif accion == "salir":
        break
    else:
        print("Acción no válida")
