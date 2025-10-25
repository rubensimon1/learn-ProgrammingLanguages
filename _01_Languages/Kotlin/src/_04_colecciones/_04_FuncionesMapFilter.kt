/*
 * 🧩 Enunciado:
 * Crea una lista de números y usa `map` para elevarlos al cuadrado.
 * Luego usa `filter` para quedarte solo con los mayores a 10.
 */

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val cuadrados = numeros.map { it * it }
    val mayores10 = cuadrados.filter { it > 10 }

    println("Lista original: $numeros")
    println("Al cuadrado: $cuadrados")
    println("Mayores a 10: $mayores10")
}
