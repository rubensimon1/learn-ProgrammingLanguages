/*
 * 🧩 Enunciado:
 * Crea dos variables Int? y realiza operaciones sumando solo si no son null.
 */

fun main() {
    val a: Int? = 5
    val b: Int? = null

    val suma = (a ?: 0) + (b ?: 0)
    println("Suma segura: $suma") // 5
}
