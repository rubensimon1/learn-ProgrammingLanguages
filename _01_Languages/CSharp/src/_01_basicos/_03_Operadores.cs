/*
 * 🧩 Enunciado:
 * Declara dos números enteros y muestra:
 * - su suma
 * - su resta
 * - su multiplicación
 * - su división
 * - su módulo
 */

using System;

class _03_Operadores
{
    static void Main()
    {
        int a = 10, b = 3;

        Console.WriteLine($"Suma: {a + b}");
        Console.WriteLine($"Resta: {a - b}");
        Console.WriteLine($"Multiplicación: {a * b}");
        Console.WriteLine($"División: {(double)a / b}");
        Console.WriteLine($"Módulo: {a % b}");
    }
}
