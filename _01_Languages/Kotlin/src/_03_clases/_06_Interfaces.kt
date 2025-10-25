/*
 * 🧩 Enunciado:
 * Crea una interfaz `IVehiculo` con métodos `arrancar()` y `detener()`.
 * Implementa la interfaz en `Coche` y `Moto`.
 */

interface IVehiculo {
    fun arrancar()
    fun detener()
}

class Coche : IVehiculo {
    override fun arrancar() = println("🚗 El coche arranca.")
    override fun detener() = println("🚗 El coche se detiene.")
}

class Moto : IVehiculo {
    override fun arrancar() = println("🏍️ La moto arranca.")
    override fun detener() = println("🏍️ La moto se detiene.")
}

fun main() {
    val coche: IVehiculo = Coche()
    val moto: IVehiculo = Moto()

    coche.arrancar()
    moto.arrancar()
    coche.detener()
    moto.detener()
}
