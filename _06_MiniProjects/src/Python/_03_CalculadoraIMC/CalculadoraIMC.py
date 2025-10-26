def calcular_imc(peso, altura):
    return peso / (altura ** 2)

usuarios = []

while True:
    nombre = input("Nombre (Enter para salir): ")
    if not nombre:
        break
    peso = float(input("Peso (kg): "))
    altura = float(input("Altura (m): "))
    imc = calcular_imc(peso, altura)
    if imc < 18.5:
        categoria = "Bajo peso"
    elif imc < 25:
        categoria = "Normal"
    elif imc < 30:
        categoria = "Sobrepeso"
    else:
        categoria = "Obesidad"
    usuarios.append({"nombre": nombre, "IMC": imc, "categoria": categoria})

for u in usuarios:
    print(f"{u['nombre']} - IMC: {u['IMC']:.2f} - {u['categoria']}")
