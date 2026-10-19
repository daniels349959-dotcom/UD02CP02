package ejercicio02

val tareas = mutableListOf<String>()

fun añadir(tarea: String) {
    if (tarea.isBlank()) {
        println("La tarea no puede estar vacía.")
    } else if (tarea.startsWith("[X]")) {
        println("No escribas [X]: se añade al completar la tarea.")
    } else {
        tareas.add(tarea)
        println("Tarea añadida.")
    }
}

fun completar(indice: Int) {
    val posicion = indice - 1
    if (posicion < 0 || posicion >= tareas.size) {
        println("Ese número de tarea no existe.")
    } else if (tareas[posicion].startsWith("[X]")) {
        println("La tarea ya está completada.")
    } else {
        tareas[posicion] = "[X] " + tareas[posicion]
        println("Tarea completada.")
    }
}

fun listar() {
    if (tareas.isEmpty()) {
        println("No hay tareas.")
    }
    for (i in tareas.indices) {
        println("${i + 1}. ${tareas[i]}")
    }
}

// Función de extensión: permite usar tareas.filtrarPendientes().
fun List<String>.filtrarPendientes(): List<String> {
    return this.filter { !it.startsWith("[X]") }
}

fun pendientes() {
    val sinCompletar = tareas.filtrarPendientes()
    if (sinCompletar.isEmpty()) {
        println("No hay tareas pendientes.")
    }
    for (tarea in sinCompletar) {
        println(tarea)
    }
}

fun main() {
    var opcion = ""
    while (opcion != "0") {
        println("\n1. Añadir\n2. Completar\n3. Listar\n4. Ver pendientes\n0. Salir")
        opcion = readln()
        when (opcion) {
            "1" -> {
                println("Escribe la tarea:")
                añadir(readln())
            }
            "2" -> {
                println("Número de la tarea:")
                val indice = readln().toIntOrNull()
                if (indice == null) {
                    println("Debes escribir un número entero.")
                } else {
                    completar(indice)
                }
            }
            "3" -> listar()
            "4" -> pendientes()
            "0" -> println("Fin del programa.")
            else -> println("Opción incorrecta.")
        }
    }
}
