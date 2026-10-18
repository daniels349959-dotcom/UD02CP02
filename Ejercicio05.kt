package ejercicio05

fun main() {
    val asientos = mutableMapOf<String, Boolean?>()
    for (fila in 'A'..'E') {
        for (numero in 1..5) {
            asientos["$fila$numero"] = false
        }
    }

    var opcion = 0
    while (opcion != 4) {
        println("\n1. Mostrar mapa\n2. Reservar\n3. Cancelar\n4. Salir")
        try {
            opcion = readln().toInt()
            when (opcion) {
                1 -> {
                    println("[ ] disponible, [X] ocupado")
                    for (fila in 'A'..'E') {
                        for (numero in 1..5) {
                            val clave = "$fila$numero"
                            if (asientos[clave] == true) {
                                print("$clave[X] ")
                            } else {
                                print("$clave[ ] ")
                            }
                        }
                        println()
                    }
                }
                2, 3 -> {
                    println("Escribe el asiento (por ejemplo, A1):")
                    val asiento = readln().trim().uppercase()
                    // as? convierte de forma segura; ?: usa false si no hay un Boolean.
                    val ocupado = (asientos[asiento] as? Boolean) ?: false
                    // Una clave inexistente devuelve null: se comprueba antes de modificar.
                    if (asientos[asiento] == null) {
                        println("El asiento no existe.")
                    } else if (opcion == 2) {
                        if (ocupado) {
                            println("El asiento ya está ocupado.")
                        } else {
                            asientos[asiento] = true
                            println("Reserva realizada.")
                        }
                    } else {
                        if (ocupado) {
                            asientos[asiento] = false
                            println("Reserva cancelada.")
                        } else {
                            println("El asiento ya está disponible.")
                        }
                    }
                }
                4 -> println("Fin del programa.")
                else -> println("Opción incorrecta.")
            }
        } catch (error: NumberFormatException) {
            println("Debes escribir un número entero para el menú.")
        }
    }
}
