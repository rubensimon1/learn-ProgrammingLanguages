/*
 * 🧩 Enunciado:
 * Pide dos números y realiza la división.
 * Maneja la excepción si el divisor es cero.
 */

using System;

class _02_DivisionPorCero
{
    static void Main()
    {
        try
        {
            Console.Write("Introduce el dividendo: ");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.Write("Introduce el divisor: ");
            int b = Convert.ToInt32(Console.ReadLine());

            int resultado = a / b;
            Console.WriteLine($"Resultado: {resultado}");
        }
        catch (DivideByZeroException)
        {
            Console.WriteLine("❌ Error: No se puede dividir entre cero.");
        }
        catch (FormatException)
        {
            Console.WriteLine("❌ Error: Debes introducir un número válido.");
        }
    }
}
