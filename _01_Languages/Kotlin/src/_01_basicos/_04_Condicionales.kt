/*
 * 🧩 Enunciado:
 * Pide la edad del usuario y muestra:
 * - "Menor de edad" si es <18
 * - "Adulto" si está entre 18 y 65
 * - "Jubilado" si es >=65
 */

fun main() {
    print("Introduce tu edad: ")
    val edad = readLine()!!.toInt()

    when {
        edad < 18 -> println("👶 Eres menor de edad.")
        edad < 65 -> println("🧑 Eres adulto.")
        else -> println("👴 Eres jubilado.")
    }
}
