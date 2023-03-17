// Definir la clase Dron
import kotlin.random.Random

class Dron{
    private var _numero: Int = 0

    val numero: Int
        get() = _numero

    init {
        generarNumero()
    }

    private fun generarNumero() {
        _numero = (_numero % 100) + 1
    }

}