/*
 * 🧩 Enunciado:
 * Crea una lambda que reciba un número y devuelva su cuadrado.
 */

fun main() {
    val cuadrado: (Int) -> Int = { x -> x * x }

    println("El cuadrado de 5 es ${cuadrado(5)}")
    println("El cuadrado de 10 es ${cuadrado(10)}")
}
