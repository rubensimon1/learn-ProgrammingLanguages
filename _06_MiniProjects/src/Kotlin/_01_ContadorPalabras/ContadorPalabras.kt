
fun main() {
    print("Introduce una frase: ")
    val frase = readLine() ?: ""
    val palabras = frase.split(" ").filter { it.isNotEmpty() }
    println("Número de palabras: ${palabras.size}")
}
