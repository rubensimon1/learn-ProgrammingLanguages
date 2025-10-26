using System;

class ContadorVocales
{
    static void Main()
    {
        Console.Write("Introduce una frase: ");
        string frase = Console.ReadLine() ?? "";
        int contador = 0;

        foreach (char c in frase)
        {
            if ("aeiouAEIOU".Contains(c)) contador++;
        }

        Console.WriteLine("Número de vocales: " + contador);
    }
}
