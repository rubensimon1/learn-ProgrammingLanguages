/*
 * 🧩 Enunciado:
 * Crea una clase `Empleado` con nombre y salario.
 * Crea una subclase `Gerente` que tenga un bono adicional.
 * Muestra los datos heredados y el salario total.
 */

using System;

class Empleado
{
    public string Nombre;
    public double Salario;

    public Empleado(string nombre, double salario)
    {
        Nombre = nombre;
        Salario = salario;
    }

    public virtual void MostrarDatos()
    {
        Console.WriteLine($"Empleado: {Nombre}, Salario: {Salario}€");
    }
}

class Gerente : Empleado
{
    public double Bono;

    public Gerente(string nombre, double salario, double bono)
        : base(nombre, salario)
    {
        Bono = bono;
    }

    public override void MostrarDatos()
    {
        double total = Salario + Bono;
        Console.WriteLine($"👔 Gerente: {Nombre}, Salario total: {total}€");
    }
}

class _04_Herencia
{
    static void Main()
    {
        Empleado e1 = new Empleado("Carlos", 1200);
        Gerente g1 = new Gerente("Laura", 1800, 500);

        e1.MostrarDatos();
        g1.MostrarDatos();
    }
}
