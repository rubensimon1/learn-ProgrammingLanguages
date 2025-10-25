/*
 * 🧩 Enunciado:
 * Crea una clase `Empleado` con nombre y salario.
 * Crea una subclase `Gerente` con un bono adicional.
 * Muestra los datos y el salario total.
 */

open class Empleado(val nombre: String, val salario: Double) {
    open fun mostrarDatos() {
        println("Empleado: $nombre, Salario: $salario€")
    }
}

class Gerente(nombre: String, salario: Double, val bono: Double) : Empleado(nombre, salario) {
    override fun mostrarDatos() {
        val total = salario + bono
        println("👔 Gerente: $nombre, Salario total: $total€")
    }
}

fun main() {
    val e1 = Empleado("Carlos", 1200.0)
    val g1 = Gerente("Laura", 1800.0, 500.0)

    e1.mostrarDatos()
    g1.mostrarDatos()
}
