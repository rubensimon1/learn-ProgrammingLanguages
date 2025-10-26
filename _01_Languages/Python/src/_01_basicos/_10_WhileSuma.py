"""
Usa un bucle while para sumar números del 1 al 100.
"""

def main():
    i = 1
    suma = 0
    while i <= 100:
        suma += i
        i += 1
    print("Suma del 1 al 100:", suma)

if __name__ == "__main__":
    main()
