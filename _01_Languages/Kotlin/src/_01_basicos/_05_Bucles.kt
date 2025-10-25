/*
 * 🧩 Enunciado:
 * Muestra los números del 1 al 10 usando:
 * - for
 * - while
 * - do-while
 */

fun main() {
    println("🔹 Bucle for:")
    for (i in 1..10) {
        print("$i ")
    }

    println("\n🔹 Bucle while:")
    var j = 1
    while (j <= 10) {
        print("$j ")
        j++
    }

    println("\n🔹 Bucle do-while:")
    var k = 1
    do {
        print("$k ")
        k++
    } while (k <= 10)
}
