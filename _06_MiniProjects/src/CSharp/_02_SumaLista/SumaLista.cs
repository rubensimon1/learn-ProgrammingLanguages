using System;
using System.Collections.Generic;
using System.Linq;

class SumaLista
{
    static void Main()
    {
        List<int> numeros = new List<int>();
        for (int i = 1; i <= 5; i++)
        {
            Console.Write($"Número {i}: ");
            numeros.Add(int.Parse(Console.ReadLine() ?? "0"));
        }

        Console.WriteLine("Suma: " + numeros.Sum());
        Console.WriteLine("Promedio: " + numeros.Average());
    }
}
