data class Estudiante(val nombre: String, val nota: Double)

fun main() {
    val estudiantes = mutableListOf<Estudiante>()
    while (true) {
        print("Nombre del estudiante (Enter para salir): ")
        val nombre = readLine() ?: ""
        if (nombre.isEmpty()) break
        print("Nota: ")
        val nota = readLine()?.toDoubleOrNull() ?: 0.0
        estudiantes.add(Estudiante(nombre, nota))
    }
    println("Aprobados:")
    estudiantes.filter { it.nota >= 5 }.forEach { println("${it.nombre} - ${it.nota}") }
}
