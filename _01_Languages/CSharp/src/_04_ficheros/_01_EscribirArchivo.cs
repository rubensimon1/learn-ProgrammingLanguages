/*
 * 🧩 Enunciado:
 * Crea un archivo "nombres.txt" y escribe varios nombres en él.
 */

using System;
using System.IO;

class _01_EscribirArchivo
{
    static void Main()
    {
        string[] nombres = { "Ana", "Luis", "María", "Pedro" };

        File.WriteAllLines("nombres.txt", nombres);

        Console.WriteLine("Archivo 'nombres.txt' creado con éxito.");
    }
}
