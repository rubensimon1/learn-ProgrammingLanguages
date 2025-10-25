/*
 * 🧩 Enunciado:
 * Crea una excepción personalizada llamada EdadInvalidaException
 * y lánzala si la edad es menor de 0 o mayor de 120.
 */

using System;

class EdadInvalidaException : Exception
{
    public EdadInvalidaException(string mensaje) : base(mensaje) { }
}

class _05_ExcepcionPersonalizada
{
    static void VerificarEdad(int edad)
    {
        if (edad < 0 || edad > 120)
            throw new EdadInvalidaException("La edad introducida no es válida.");
        Console.WriteLine($"Edad válida: {edad}");
    }

    static void Main()
    {
        try
        {
            Console.Write("Introduce tu edad: ");
            int edad = Convert.ToInt32(Console.ReadLine());
            VerificarEdad(edad);
        }
        catch (EdadInvalidaException ex)
        {
            Console.WriteLine("❌ Error personalizado: " + ex.Message);
        }
        catch (FormatException)
        {
            Console.WriteLine("❌ Error: Debes introducir un número válido.");
        }
    }
}
