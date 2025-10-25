/*
 * 🧩 Enunciado:
 * Añade nuevas líneas a "nombres.txt" sin borrar el contenido anterior.
 */

using System;
using System.IO;

class _04_AppendArchivo
{
    static void Main()
    {
        string[] nuevosNombres = { "Jorge", "Lucía" };

        File.AppendAllLines("nombres.txt", nuevosNombres);

        Console.WriteLine("Nuevos nombres añadidos a 'nombres.txt'.");
    }
}
