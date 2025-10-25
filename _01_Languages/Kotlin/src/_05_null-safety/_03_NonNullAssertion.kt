/*
 * 🧩 Enunciado:
 * Usa el operador `!!` para forzar que una variable nullable no sea null.
 * Esto lanzará una NullPointerException si lo es.
 */

fun main() {
    val nombre: String? = "Ana"
    println("Longitud: ${nombre!!.length}") // Funciona

    val apellido: String? = null
    // println(apellido!!.length) // ❌ Lanzaría NullPointerException
}
