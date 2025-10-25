package _01_Languages.Java.src._03_poo;

/*
 * 🧩 Enunciado:
 * Crea una clase CuentaBancaria con atributo privado saldo.
 * Usa getters y setters para acceder a él.
 */

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("❌ Saldo insuficiente.");
        }
    }
}

public class _04_Encapsulacion {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(500);
        cuenta.depositar(200);
        cuenta.retirar(100);
        System.out.println("💰 Saldo actual: " + cuenta.getSaldo());
    }
}
