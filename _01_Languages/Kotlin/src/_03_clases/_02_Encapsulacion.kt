/*
 * 🧩 Enunciado:
 * Crea una clase `CuentaBancaria` con atributos privados `titular` y `saldo`.
 * Añade métodos `depositar`, `retirar` y `mostrarSaldo`.
 */

class CuentaBancaria(private val titular: String, private var saldo: Double) {

    fun depositar(cantidad: Double) {
        saldo += cantidad
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) saldo -= cantidad
        else println("❌ Saldo insuficiente")
    }

    fun mostrarSaldo() {
        println("Titular: $titular, Saldo: $saldo€")
    }
}

fun main() {
    val cuenta = CuentaBancaria("Ana", 1000.0)
    cuenta.mostrarSaldo()
    cuenta.depositar(500.0)
    cuenta.retirar(300.0)
    cuenta.mostrarSaldo()
}
