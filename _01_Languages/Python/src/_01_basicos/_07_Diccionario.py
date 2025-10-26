"""
Crea un diccionario con claves “nombre”, “edad” y “profesión”, e imprime sus valores.
"""

def main():
    persona = {"nombre":"Ana", "edad":25, "profesion":"Ingeniera"}
    for clave, valor in persona.items():
        print(f"{clave}: {valor}")

if __name__ == "__main__":
    main()
