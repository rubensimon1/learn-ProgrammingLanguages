/*
 * 🧩 Enunciado:
 * Pide dos números y realiza la división.
 * Maneja excepciones de formato y división por cero por separado.
 */

using System;

class _03_MultiplesCatch
{
    static void Main()
    {
        try
        {
            Console.Write("Número 1: ");
            int num1 = Convert.ToInt32(Console.ReadLine());

            Console.Write("Número 2: ");
            int num2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine($"Resultado: {num1 / num2}");
        }
        catch (FormatException)
        {
            Console.WriteLine("❌ Error: Entrada no válida.");
        }
        catch (DivideByZeroException)
        {
            Console.WriteLine("❌ Error: División entre cero.");
        }
        catch (Exception ex)
        {
            Console.WriteLine("❌ Otro error: " + ex.Message);
        }
    }
}
