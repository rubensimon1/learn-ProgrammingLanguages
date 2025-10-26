class Calculadora:
    """
    Clase Calculadora para operaciones matemáticas.
    
    Ejemplo de uso:
        calc = Calculadora()
        resultado = calc.sumar(2,3)
    """

    def sumar(self, a, b):
        """Suma dos números"""
        return a + b

    def multiplicar(self, a, b):
        """Multiplica dos números"""
        return a * b

    def dividir(self, a, b):
        """
        Divide dos números
        :param a: Dividendo
        :param b: Divisor, no puede ser 0
        :return: Resultado de la división
        :raises ValueError: si b = 0
        """
        if b == 0:
            raise ValueError("Divisor no puede ser 0")
        return a / b
