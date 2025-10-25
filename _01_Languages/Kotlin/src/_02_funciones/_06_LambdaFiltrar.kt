/*
 * 🧩 Enunciado:
 * Crea una lista de nombres y usa lambda con `filter` para quedarte solo con los que empiezan con 'A'.
 */

fun main() {
    val nombres = listOf("Ana", "Luis", "Alberto", "María", "Ángel")

    val nombresA = nombres.filter { it.startsWith("A") }

    println("Nombres que empiezan con 'A': $nombresA")
}
