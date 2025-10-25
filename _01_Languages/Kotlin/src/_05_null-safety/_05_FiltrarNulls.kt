/*
 * 🧩 Enunciado:
 * Crea una lista de Strings nullable y filtra los elementos no nulos usando `filterNotNull`.
 */

fun main() {
    val nombres: List<String?> = listOf("Ana", null, "Luis", null, "María")
    val nombresValidos = nombres.filterNotNull()

    println("Lista sin nulls: $nombresValidos")
}
