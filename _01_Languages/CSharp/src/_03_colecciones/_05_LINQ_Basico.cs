/*
 * 🧩 Enunciado:
 * Crea una lista de números.
 * Usa LINQ para filtrar los números mayores a 25 y mostrarlos.
 */

using System;
using System.Collections.Generic;
using System.Linq;

class _05_LINQ_Basico
{
    static void Main()
    {
        List<int> numeros = new List<int> { 10, 20, 30, 40, 50 };

        var filtrados = numeros.Where(n => n > 25);

        Console.WriteLine("Números mayores a 25:");
        foreach (int n in filtrados)
        {
            Console.WriteLine(n);
        }
    }
}
