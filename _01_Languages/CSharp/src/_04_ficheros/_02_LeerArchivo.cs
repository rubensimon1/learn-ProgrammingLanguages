/*
 * 🧩 Enunciado:
 * Lee un archivo "nombres.txt" y muestra cada línea por consola.
 */

using System;
using System.IO;

class _02_LeerArchivo
{
    static void Main()
    {
        if (File.Exists("nombres.txt"))
        {
            string[] lineas = File.ReadAllLines("nombres.txt");
            foreach (string linea in lineas)
            {
                Console.WriteLine(linea);
            }
        }
        else
        {
            Console.WriteLine("El archivo no existe.");
        }
    }
}
