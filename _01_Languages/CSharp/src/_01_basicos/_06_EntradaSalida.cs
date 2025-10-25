/*
 * 🧩 Enunciado:
 * Pide al usuario su nombre y su edad, y muestra un mensaje personalizado.
 */

using System;

class _06_EntradaSalida
{
    static void Main()
    {
        Console.Write("¿Cómo te llamas? ");
        string nombre = Console.ReadLine();

        Console.Write("¿Cuántos años tienes? ");
        int edad = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine($"Hola {nombre}, tienes {edad} años. 👋");
    }
}
