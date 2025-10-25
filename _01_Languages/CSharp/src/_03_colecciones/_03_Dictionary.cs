/*
 * 🧩 Enunciado:
 * Crea un diccionario con clave: producto y valor: precio.
 * Muestra todos los pares clave-valor.
 */

using System;
using System.Collections.Generic;

class _03_Dictionary
{
    static void Main()
    {
        Dictionary<string, double> productos = new Dictionary<string, double>()
        {
            { "Manzana", 0.5 },
            { "Pan", 1.2 },
            { "Leche", 0.9 }
        };

        productos["Huevos"] = 2.0;

        foreach (var item in productos)
        {
            Console.WriteLine($"{item.Key}: {item.Value}€");
        }
    }
}
