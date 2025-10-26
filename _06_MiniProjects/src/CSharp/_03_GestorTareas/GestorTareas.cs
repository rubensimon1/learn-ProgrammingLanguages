using System;
using System.Collections.Generic;
using System.Linq;

class Tarea
{
    public string Nombre { get; set; }
    public bool Completada { get; set; } = false;
    public override string ToString() => Nombre + (Completada ? " ✅" : " ❌");
}

class GestorTareas
{
    static void Main()
    {
        List<Tarea> tareas = new List<Tarea>();
        string accion;

        do
        {
            Console.Write("Acción (agregar/listar/completar/salir): ");
            accion = Console.ReadLine()?.ToLower() ?? "";

            switch (accion)
            {
                case "agregar":
                    Console.Write("Nombre de la tarea: ");
                    tareas.Add(new Tarea { Nombre = Console.ReadLine() ?? "" });
                    break;
                case "listar":
                    foreach (var t in tareas) Console.WriteLine(t);
                    break;
                case "completar":
                    Console.Write("Nombre de la tarea a completar: ");
                    string nombre = Console.ReadLine() ?? "";
                    var tarea = tareas.FirstOrDefault(x => x.Nombre.Equals(nombre, StringComparison.OrdinalIgnoreCase));
                    if (tarea != null) tarea.Completada = true;
                    else Console.WriteLine("Tarea no encontrada");
                    break;
                case "salir": break;
                default: Console.WriteLine("Acción no válida"); break;
            }
        } while (accion != "salir");
    }
}
