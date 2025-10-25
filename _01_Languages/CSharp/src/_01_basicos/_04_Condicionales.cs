/*
 * 🧩 Enunciado:
 * Pide al usuario su edad y muestra:
 * - "Menor de edad" si es < 18
 * - "Adulto" si está entre 18 y 65
 * - "Jubilado" si es >= 65
 */

using System;

class _04_Condicionales
{
    static void Main()
    {
        Console.Write("Introduce tu edad: ");
        int edad = Convert.ToInt32(Console.ReadLine());

        if (edad < 18)
            Console.WriteLine("👶 Eres menor de edad.");
        else if (edad < 65)
            Console.WriteLine("🧑 Eres adulto.");
        else
            Console.WriteLine("👴 Eres jubilado.");
    }
}
