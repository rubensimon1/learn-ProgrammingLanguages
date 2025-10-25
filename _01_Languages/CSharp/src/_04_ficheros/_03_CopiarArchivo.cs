/*
 * 🧩 Enunciado:
 * Copia el contenido de "nombres.txt" en un archivo nuevo llamado "copia.txt".
 */

using System;
using System.IO;

class _03_CopiarArchivo
{
    static void Main()
    {
        if (File.Exists("nombres.txt"))
        {
            File.Copy("nombres.txt", "copia.txt", true);
            Console.WriteLine("Archivo copiado exitosamente como 'copia.txt'.");
        }
        else
        {
            Console.WriteLine("El archivo 'nombres.txt' no existe.");
        }
    }
}
