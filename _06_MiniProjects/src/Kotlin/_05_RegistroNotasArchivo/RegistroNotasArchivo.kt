import java.io.File

data class Estudiante(val nombre: String, val nota: Double)

fun main() {
    val archivo = File("notas.txt")
    if (!archivo.exists()) archivo.createNewFile()

    while (true) {
        print("Acción (agregar/listar/promedio/salir): ")
        when (readLine()?.lowercase()) {
            "agregar" -> {
                print("Nombre: ")
                val nombre = readLine() ?: ""
                print("Nota: ")
                val nota = readLine()?.toDoubleOrNull() ?: 0.0
                archivo.appendText("$nombre,$nota\n")
            }
            "listar" -> {
                archivo.readLines()
                    .map { it.split(",") }
                    .map { Estudiante(it[0], it[1].toDouble()) }
                    .forEach { println("${it.nombre} - ${it.nota}") }
            }
            "promedio" -> {
                val notas = archivo.readLines().map { it.split(",")[1].toDouble() }
                val promedio = if (notas.isNotEmpty()) notas.average() else 0.0
                println("Promedio: $promedio")
            }
            "salir" -> break
            else -> println("Acción no válida")
        }
    }
}
