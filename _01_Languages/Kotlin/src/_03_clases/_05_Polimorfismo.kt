/*
 * 🧩 Enunciado:
 * Crea una lista de empleados y gerentes.
 * Usa polimorfismo para llamar a mostrarDatos() dinámicamente.
 */

fun main() {
    val empleados: List<Empleado> = listOf(
        Empleado("Carlos", 1200.0),
        Gerente("Laura", 1800.0, 500.0),
        Empleado("Pablo", 1000.0),
        Gerente("Marta", 2000.0, 700.0)
    )

    for (emp in empleados) {
        emp.mostrarDatos() // Polimorfismo
    }
}
