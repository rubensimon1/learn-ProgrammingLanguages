/*
 * 🧩 Enunciado:
 * Crea un map con productos y precios, añade un elemento y muéstralos.
 */

fun main() {
    val productos = mutableMapOf(
        "Manzana" to 0.5,
        "Pan" to 1.2,
        "Leche" to 0.9
    )
    productos["Huevos"] = 2.0

    for ((producto, precio) in productos) {
        println("$producto: $precio€")
    }
}
