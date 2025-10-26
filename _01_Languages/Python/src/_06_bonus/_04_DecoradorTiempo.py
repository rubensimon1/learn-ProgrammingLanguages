"""
Crea un decorador que mida el tiempo de ejecución de una función.
"""

import time

def medir_tiempo(func):
    def wrapper(*args, **kwargs):
        inicio = time.time()
        resultado = func(*args, **kwargs)
        fin = time.time()
        print(f"Tiempo de ejecución: {fin - inicio:.4f} segundos")
        return resultado
    return wrapper

@medir_tiempo
def suma_grande():
    total = 0
    for i in range(1,1000000):
        total += i
    return total

print("Resultado suma:", suma_grande())
