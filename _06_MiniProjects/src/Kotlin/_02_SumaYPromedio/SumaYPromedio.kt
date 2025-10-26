fun main() {
    val numeros = mutableListOf<Int>()
    repeat(5) {
        print("Número ${it+1}: ")
        numeros.add(readLine()?.toIntOrNull() ?: 0)
    }
    println("Suma: ${numeros.sum()}, Promedio: ${numeros.average()}")
}
