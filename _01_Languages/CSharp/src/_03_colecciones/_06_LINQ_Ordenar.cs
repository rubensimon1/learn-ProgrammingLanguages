/*
 * 🧩 Enunciado:
 * Crea una lista de strings con nombres.
 * Usa LINQ para ordenarlos alfabéticamente y mostrarlos.
 */

using System;
using System.Collections.Generic;
using System.Linq;

class _06_LINQ_Ordenar
{
    static void Main()
    {
        List<string> nombres = new List<string> { "Pedro", "Ana", "Luis", "María" };

        var ordenados = nombres.OrderBy(n => n);

        Console.WriteLine("Nombres ordenados:");
        foreach (string n in ordenados)
        {
            Console.WriteLine(n);
        }
    }
}
