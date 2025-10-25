/*
 * 🧩 Enunciado:
 * Crea una lista de números y verifica si todos son positivos (`all`)
 * y si hay algún número par (`any`).
 */

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    val todosPositivos = numeros.all { it > 0 }
    val hayPar = numeros.any { it % 2 == 0 }

    println("Todos positivos: $todosPositivos")
    println("Hay algún par: $hayPar")
}
