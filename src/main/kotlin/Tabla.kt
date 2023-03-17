import kotlin.random.Random

class Tabla {
var dron_cuadrante




2
}
fun recorrer(){
val tamano = 3
// Crear una tabla cuadrada con ArrayLists
val tabla = ArrayList<ArrayList<Int>>()
for (i in 0 until tamano) {
    val fila = ArrayList<Int>()
    for (j in 0 until tamano) {
        fila.add(0)
    }
    tabla.add(fila)
}

// Dar valores a la tabla (opcional)
for (i in 0 until tamano) {
    for (j in 0 until tamano) {
        tabla[i][j] = i * tamano + j + 1
    }
}

// Recorrer la tabla utilizando un bucle for
for (fila in tabla) {
    for (elemento in fila) {
        println(elemento)
    }
}
}