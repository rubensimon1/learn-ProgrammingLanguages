/*
 * 🧩 Enunciado:
 * Pide al usuario su nombre y edad, y muestra un mensaje personalizado.
 */

fun main() {
    print("¿Cómo te llamas? ")
    val nombre = readLine()!!

    print("¿Cuántos años tienes? ")
    val edad = readLine()!!.toInt()

    println("Hola $nombre, tienes $edad años. 👋")
}
