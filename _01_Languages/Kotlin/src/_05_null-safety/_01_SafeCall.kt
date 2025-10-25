/*
 * 🧩 Enunciado:
 * Crea una variable nullable de tipo String.
 * Usa el operador `?.` para acceder a su longitud sin provocar NullPointerException.
 */

fun main() {
    val nombre: String? = "Carlos"
    println("Longitud del nombre: ${nombre?.length}")

    val apellido: String? = null
    println("Longitud del apellido: ${apellido?.length}") // No lanza excepción
}
