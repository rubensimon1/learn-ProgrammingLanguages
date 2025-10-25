/*
 * 🧩 Enunciado:
 * Crea una lista de números y usa lambda con `map` para elevarlos al cuadrado.
 */

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    val cuadrados = numeros.map { it * it }

    println("Lista original: $numeros")
    println("Lista al cuadrado: $cuadrados")
}
