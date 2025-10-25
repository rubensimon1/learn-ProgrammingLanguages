/*
 * 🧩 Enunciado:
 * Crea una clase `Persona` con los atributos `nombre` y `edad`.
 * Instancia un objeto y muestra sus datos por consola.
 */

using System;

class Persona
{
    public string Nombre;
    public int Edad;

    public void MostrarDatos()
    {
        Console.WriteLine($"Nombre: {Nombre}, Edad: {Edad}");
    }
}

class _01_ClaseYObjeto
{
    static void Main()
    {
        Persona p1 = new Persona();
        p1.Nombre = "Lucía";
        p1.Edad = 22;

        p1.MostrarDatos();
    }
}
