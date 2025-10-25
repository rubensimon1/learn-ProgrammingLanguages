/*
 * 🧩 Enunciado:
 * Crea una lista de strings con nombres.
 * Añade varios nombres y muéstralos con un bucle foreach.
 */

using System;
using System.Collections.Generic;

class _02_List
{
    static void Main()
    {
        List<string> nombres = new List<string>() { "Ana", "Luis", "María" };
        nombres.Add("Pedro");

        foreach (string nombre in nombres)
        {
            Console.WriteLine("👤 " + nombre);
        }
    }
}
