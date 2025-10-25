/*
 * 🧩 Enunciado:
 * Crea una interfaz `IVehiculo` con los métodos `Arrancar()` y `Detener()`.
 * Implementa la interfaz en dos clases: `Coche` y `Moto`.
 */

using System;

interface IVehiculo
{
    void Arrancar();
    void Detener();
}

class Coche : IVehiculo
{
    public void Arrancar() => Console.WriteLine("🚗 El coche arranca.");
    public void Detener() => Console.WriteLine("🚗 El coche se detiene.");
}

class Moto : IVehiculo
{
    public void Arrancar() => Console.WriteLine("🏍️ La moto arranca.");
    public void Detener() => Console.WriteLine("🏍️ La moto se detiene.");
}

class _06_Interfaces
{
    static void Main()
    {
        IVehiculo coche = new Coche();
        IVehiculo moto = new Moto();

        coche.Arrancar();
        moto.Arrancar();
        coche.Detener();
        moto.Detener();
    }
}
