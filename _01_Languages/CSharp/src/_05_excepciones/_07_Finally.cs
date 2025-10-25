/*
 * 🧩 Enunciado:
 * Pide un número al usuario, realiza una división y utiliza finally
 * para mostrar un mensaje final aunque haya habido excepción.
 */

using System;

class _06_Finally
{
    static void Main()
    {
        try
        {
            Console.Write("Número: ");
            int numero = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine($"10 / {numero} = {10 / numero}");
        }
        catch (FormatException)
        {
            Console.WriteLine("❌ Error: Entrada no válida.");
        }
        catch (DivideByZeroException)
        {
            Console.WriteLine("❌ Error: División entre cero.");
        }
        finally
        {
            Console.WriteLine("✅ Operación finalizada.");
        }
    }
}
