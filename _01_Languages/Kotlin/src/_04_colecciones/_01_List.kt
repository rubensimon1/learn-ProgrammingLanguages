/*
 * 🧩 Enunciado:
 * Crea una lista de nombres, añade elementos y recórrela con un bucle for.
 */

fun main() {
    val nombres = mutableListOf("Ana", "Luis", "María")
    nombres.add("Pedro")

    for (nombre in nombres) {
        println("👤 $nombre")
    }
}
