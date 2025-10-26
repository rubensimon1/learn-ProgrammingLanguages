using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Estudiante
{
    public string Nombre { get; set; }
    public double Nota { get; set; }
}

class RegistroNotasArchivo
{
    static void Main()
    {
        string archivo = "notas.txt";
        if (!File.Exists(archivo)) File.Create(archivo).Close();

        string accion;
        do
        {
            Console.Write("Acción (agregar/listar/promedio/salir): ");
            accion = Console.ReadLine()?.ToLower() ?? "";

            switch (accion)
            {
                case "agregar":
                    Console.Write("Nombre: ");
                    string nombre = Console.ReadLine() ?? "";
                    Console.Write("Nota: ");
                    double nota = double.Parse(Console.ReadLine() ?? "0");
                    File.AppendAllText(archivo, nombre + "," + nota + Environment.NewLine);
                    break;
                case "listar":
                    var estudiantes = File.ReadAllLines(archivo)
                        .Select(line => line.Split(','))
                        .Select(parts => new Estudiante { Nombre = parts[0], Nota = double.Parse(parts[1]) })
                        .ToList();
                    estudiantes.ForEach(e => Console.WriteLine(e.Nombre + " - " + e.Nota));
                    break;
                case "promedio":
                    var notas = File.ReadAllLines(archivo).Select(line => double.Parse(line.Split(',')[1]));
                    double promedio = notas.Any() ? notas.Average() : 0;
                    Console.WriteLine("Promedio: " + promedio);
                    break;
                case "salir": break;
                default: Console.WriteLine("Acción no válida"); break;
            }
        } while (accion != "salir");
    }
}
