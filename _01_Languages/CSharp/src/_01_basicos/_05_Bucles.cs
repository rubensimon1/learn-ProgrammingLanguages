/*
 * 🧩 Enunciado:
 * Muestra los números del 1 al 10 usando:
 * - un bucle for
 * - un bucle while
 * - un bucle do-while
 */

using System;

class _05_Bucles
{
    static void Main()
    {
        Console.WriteLine("🔹 Bucle for:");
        for (int i = 1; i <= 10; i++)
            Console.Write(i + " ");

        Console.WriteLine("\n🔹 Bucle while:");
        int j = 1;
        while (j <= 10)
        {
            Console.Write(j + " ");
            j++;
        }

        Console.WriteLine("\n🔹 Bucle do-while:");
        int k = 1;
        do
        {
            Console.Write(k + " ");
            k++;
        } while (k <= 10);
    }
}
