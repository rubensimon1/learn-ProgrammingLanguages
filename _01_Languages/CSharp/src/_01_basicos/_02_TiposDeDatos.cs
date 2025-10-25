/*
 * 🧩 Enunciado:
 * Declara variables de diferentes tipos de datos y muéstralas por consola.
 */

using System;

class _02_TiposDeDatos
{
    static void Main()
    {
        int edad = 25;
        double altura = 1.80;
        bool estudiante = true;
        char inicial = 'C';
        string nombre = "Carlos";

        Console.WriteLine($"Nombre: {nombre}");
        Console.WriteLine($"Edad: {edad}");
        Console.WriteLine($"Altura: {altura} m");
        Console.WriteLine($"¿Es estudiante?: {estudiante}");
        Console.WriteLine($"Inicial: {inicial}");
    }
}
