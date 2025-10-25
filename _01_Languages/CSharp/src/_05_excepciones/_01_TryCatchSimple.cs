/*
 * 🧩 Enunciado:
 * Pide al usuario un número y muestra su división entre 10.
 * Maneja la excepción si el usuario introduce un valor no numérico.
 */

using System;

class _01_TryCatchSimple
{
    static void Main()
    {
        try
        {
            Console.Write("Introduce un número: ");
            int numero = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"10 / {numero} = {10.0 / numero}");
        }
        catch (FormatException)
        {
            Console.WriteLine("❌ Error: Debes introducir un número válido.");
        }
    }
}
