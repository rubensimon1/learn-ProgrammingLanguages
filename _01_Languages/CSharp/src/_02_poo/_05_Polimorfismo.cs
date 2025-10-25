/*
 * 🧩 Enunciado:
 * Crea una lista de empleados donde algunos sean gerentes y otros empleados.
 * Usa polimorfismo para llamar a `MostrarDatos()` de forma dinámica.
 */

using System;
using System.Collections.Generic;

class _05_Polimorfismo
{
    static void Main()
    {
        List<Empleado> empleados = new List<Empleado>()
        {
            new Empleado("Carlos", 1200),
            new Gerente("Laura", 1800, 500),
            new Empleado("Pablo", 1000),
            new Gerente("Marta", 2000, 700)
        };

        foreach (Empleado emp in empleados)
        {
            emp.MostrarDatos(); // Polimorfismo en acción
        }
    }
}
