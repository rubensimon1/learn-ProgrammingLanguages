/*
 * 🧩 Enunciado:
 * Usa un iterador para recorrer una lista de enteros y mostrar su suma.
 */

using System;
using System.Collections.Generic;

class _04_Iteradores
{
    static void Main()
    {
        List<int> numeros = new List<int> { 10, 20, 30, 40, 50 };
        int suma = 0;

        var enumerator = numeros.GetEnumerator();
        while (enumerator.MoveNext())
        {
            suma += enumerator.Current;
            Console.WriteLine("Número: " + enumerator.Current);
        }

        Console.WriteLine("Suma total: " + suma);
    }
}
