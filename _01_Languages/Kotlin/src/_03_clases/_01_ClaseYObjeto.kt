/*
 * 🧩 Enunciado:
 * Crea una clase `Persona` con atributos `nombre` y `edad`.
 * Instancia un objeto y muestra sus datos.
 */

class Persona(val nombre: String, val edad: Int) {
    fun mostrarDatos() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

fun main() {
    val persona = Persona("Carlos", 25)
    persona.mostrarDatos()
}
