/*
 * 🧩 Enunciado:
 * Crea una función que reciba un String nullable y devuelva su longitud,
 * usando safe call y valor por defecto.
 */

fun longitudNombre(nombre: String?): Int {
    return nombre?.length ?: 0
}

fun main() {
    println(longitudNombre("Luis")) // 4
    println(longitudNombre(null))   // 0
}
