/*
 * 🧩 Enunciado:
 * Crea una clase de datos `Producto` con `nombre` y `precio`.
 * Instancia varios productos y muestra su contenido.
 */

data class Producto(val nombre: String, val precio: Double)

fun main() {
    val p1 = Producto("Manzana", 0.5)
    val p2 = Producto("Pan", 1.2)

    println(p1)
    println(p2)
}
