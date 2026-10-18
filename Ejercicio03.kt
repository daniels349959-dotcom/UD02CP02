package ejercicio03

fun main() {
    println("Escribe un texto:")
    val texto = readln().lowercase()
    val frecuencias = mutableMapOf<Char, Int>()

    for (letra in texto) {
        // Solo contamos letras: no contamos espacios, números ni signos.
        if (letra.isLetter()) {
            val cantidad = frecuencias[letra] ?: 0
            frecuencias[letra] = cantidad + 1
        }
    }

    val ordenadas = frecuencias.entries.sortedByDescending { it.value }
    if (ordenadas.isEmpty()) {
        println("No hay letras en el texto.")
    }
    for (entrada in ordenadas) {
        println("${entrada.key}: ${entrada.value}")
    }
}
