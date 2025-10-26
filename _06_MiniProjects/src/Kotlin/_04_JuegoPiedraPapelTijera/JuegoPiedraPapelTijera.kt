import kotlin.random.Random

fun main() {
    val opciones = listOf("piedra", "papel", "tijera")
    while (true) {
        print("Tu elección (piedra/papel/tijera, salir para terminar): ")
        val jugador = readLine()?.lowercase() ?: continue
        if (jugador == "salir") break
        if (jugador !in opciones) continue

        val computadora = opciones.random()
        println("Computadora: $computadora")

        when {
            jugador == computadora -> println("Empate")
            jugador == "piedra" && computadora == "tijera" ||
            jugador == "papel" && computadora == "piedra" ||
            jugador == "tijera" && computadora == "papel" -> println("Ganaste")
            else -> println("Perdiste")
        }
    }
}
