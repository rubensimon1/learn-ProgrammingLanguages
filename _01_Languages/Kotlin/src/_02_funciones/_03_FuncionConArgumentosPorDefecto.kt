/*
 * 🧩 Enunciado:
 * Crea una función `presentarse` con argumentos por defecto:
 * nombre = "Invitado", edad = 0
 */

fun presentarse(nombre: String = "Invitado", edad: Int = 0) {
    println("Hola, soy $nombre y tengo $edad años.")
}

fun main() {
    presentarse()
    presentarse("Ana", 25)
}
