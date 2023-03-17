import kotlin.random.Random

class Cuadrante(val drones: List<Dron>, val jack: Jack, val vicka:Vicka) {
    // Implementar cualquier otra funcionalidad que se necesite
    val objects = ArrayList<Dron>()

    // Crear un objeto "Jack"
    val Jack = Jack()

    // Crear una lista vacía de cuadrantes
    var cuadrantes = mutableListOf<Cuadrante>()

    // Crear tres cuadrantes con una cantidad aleatoria de drones y asignar un objeto "Jack" a cada cuadrante
    val random: Int = Random.nextInt(0, 100)
    var cantidadDrones = Random.nextInt(0, 2) + 1 // Generar un número aleatorio entre 1 y 3

    fun addcuadrante(): List<Cuadrante> {
        val objects = ArrayList<Cuadrante>()
        var contador: Int = 0
        val numObjectsToAdd = Random.nextInt(1, 4)
        while (contador < numObjectsToAdd) {
            objects.add(Cuadrante(Dron(3),Jack,Vicka()))
            contador++
        }
        return objects
    }


    fun adddron(): List<Dron> {
        val objects = ArrayList<Dron>()
        var contador: Int = 0
        val numObjectsToAdd = Random.nextInt(1, 4)
        while (contador < numObjectsToAdd) {
            objects.add(Dron(contador))
            contador++
        }
        return objects
    }

}