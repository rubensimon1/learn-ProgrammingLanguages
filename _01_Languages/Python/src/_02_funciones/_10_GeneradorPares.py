"""
Muestra todos los números pares hasta un límite dado usando bucle.
"""

limite = int(input("Introduce un límite: "))
pares = []
for i in range(2, limite+1, 2):
    pares.append(i)
print("Números pares hasta", limite, ":", pares)
