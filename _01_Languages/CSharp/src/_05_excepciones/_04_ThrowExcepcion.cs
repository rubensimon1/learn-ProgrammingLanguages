/*
 * 🧩 Enunciado:
 * Crea un método que lance una excepción si se introduce un número negativo.
 */

using System;

class _04_ThrowExcepcion
{
    static void VerificarPositivo(int numero)
    {
        if (numero < 0)
            throw new ArgumentException("El número no puede ser negativo.");
        Console.WriteLine($"Número válido: {numero}");
    }

    static void Main()
    {
        try
        {
            Console.Write("Introduce un número: ");
            int n = Convert.ToInt32(Console.ReadLine());
            VerificarPositivo(n);
        }
        catch (ArgumentException ex)
        {
            Console.WriteLine("❌ Error: " + ex.Message);
        }
    }
}
