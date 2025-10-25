/*
 * 🧩 Enunciado:
 * Lee un archivo "nombres.txt" y maneja posibles errores con try-catch.
 */

using System;
using System.IO;

class _06_LeerArchivoConExcepciones
{
    static void Main()
    {
        try
        {
            string[] lineas = File.ReadAllLines("nombres.txt");
            foreach (string linea in lineas)
            {
                Console.WriteLine(linea);
            }
        }
        catch (FileNotFoundException)
        {
            Console.WriteLine("❌ El archivo 'nombres.txt' no se encontró.");
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error: " + ex.Message);
        }
    }
}
