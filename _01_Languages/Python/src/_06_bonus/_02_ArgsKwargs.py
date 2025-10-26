"""
Crea una función que use *args y **kwargs para imprimir todos los argumentos recibidos.
"""

def mostrar_argumentos(*args, **kwargs):
    print("Args:", args)
    print("Kwargs:", kwargs)

mostrar_argumentos(1,2,3, nombre="Ana", edad=25)
