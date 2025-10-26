"""
Usa un bucle for para recorrer una lista con enumerate() y mostrar el índice y valor.
"""

def main():
    frutas = ["manzana", "banana", "cereza"]
    for i, fruta in enumerate(frutas):
        print(f"{i}: {fruta}")

if __name__ == "__main__":
    main()
