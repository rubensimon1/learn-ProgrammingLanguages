"""
Pide al usuario su nombre y edad, y muestra un mensaje formateado usando f-strings.
"""

def main():
    nombre = input("Introduce tu nombre: ")
    edad = input("Introduce tu edad: ")
    print(f"Hola {nombre}, tienes {edad} años.")

if __name__ == "__main__":
    main()
