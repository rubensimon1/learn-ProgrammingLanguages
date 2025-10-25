/*
 * 🧩 Enunciado:
 * Crea una clase Persona, guarda varios objetos en un archivo binario
 * y luego recupéralos para mostrarlos por consola.
 */

using System;
using System.Collections.Generic;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

[Serializable]
class Persona
{
    public string Nombre;
    public int Edad;

    public Persona(string nombre, int edad)
    {
        Nombre = nombre;
        Edad = edad;
    }

    public void MostrarDatos()
    {
        Console.WriteLine($"Nombre: {Nombre}, Edad: {Edad}");
    }
}

class _05_SerializacionBinaria
{
    static void Main()
    {
        List<Persona> personas = new List<Persona>
        {
            new Persona("Ana", 25),
            new Persona("Luis", 30),
            new Persona("María", 28)
        };

        // Guardar en archivo binario
        using (FileStream fs = new FileStream("personas.dat", FileMode.Create))
        {
            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(fs, personas);
        }

        Console.WriteLine("Objetos guardados en 'personas.dat'.");

        // Leer del archivo binario
        using (FileStream fs = new FileStream("personas.dat", FileMode.Open))
        {
            BinaryFormatter bf = new BinaryFormatter();
            List<Persona> recuperadas = (List<Persona>)bf.Deserialize(fs);

            Console.WriteLine("Objetos recuperados:");
            foreach (Persona p in recuperadas)
            {
                p.MostrarDatos();
            }
        }
    }
}
