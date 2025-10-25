/*
 * 🧩 Enunciado:
 * Crea un array de enteros con 5 elementos.
 * Asigna valores y muestra cada elemento por consola.
 */

using System;

class _01_Array
{
    static void Main()
    {
        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeros.Length; i++)
        {
            Console.WriteLine($"Elemento {i}: {numeros[i]}");
        }
    }
}
