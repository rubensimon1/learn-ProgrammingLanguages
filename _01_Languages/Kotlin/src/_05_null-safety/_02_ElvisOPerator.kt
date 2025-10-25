/*
 * 🧩 Enunciado:
 * Usa el operador `?:` para proporcionar un valor por defecto si la variable es null.
 */

fun main() {
    val nombre: String? = null
    val longitud = nombre?.length ?: 0

    println("Longitud del nombre: $longitud") // Devuelve 0
}
