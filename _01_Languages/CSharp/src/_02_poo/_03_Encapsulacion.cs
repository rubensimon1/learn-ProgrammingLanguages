/*
 * 🧩 Enunciado:
 * Implementa encapsulación en la clase `CuentaBancaria` con propiedades.
 * Atributos privados: `Titular`, `Saldo`.
 * Métodos: `Depositar()`, `Retirar()`, `MostrarSaldo()`.
 */

using System;

class CuentaBancaria
{
    private string Titular;
    private double Saldo;

    public CuentaBancaria(string titular, double saldoInicial)
    {
        Titular = titular;
        Saldo = saldoInicial;
    }

    public void Depositar(double cantidad)
    {
        Saldo += cantidad;
    }

    public void Retirar(double cantidad)
    {
        if (cantidad <= Saldo)
            Saldo -= cantidad;
        else
            Console.WriteLine("❌ Saldo insuficiente");
    }

    public void MostrarSaldo()
    {
        Console.WriteLine($"Titular: {Titular}, Saldo: {Saldo}€");
    }
}

class _03_Encapsulacion
{
    static void Main()
    {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        cuenta.MostrarSaldo();
        cuenta.Depositar(500);
        cuenta.Retirar(300);
        cuenta.MostrarSaldo();
    }
}
