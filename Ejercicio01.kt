package ejercicio01

fun main() {
    val csv = "nombre,nota1,nota2,nota3\nAna,7,8,9\nLuis,5,6,4\nMarta,9,10,8"
    val lineas = csv.split("\n")

    for (i in 1 until lineas.size) {
        val datos = lineas[i].split(",")
        val nombre = datos[0]
        val nota1 = datos[1].toDouble()
        val nota2 = datos[2].toDouble()
        val nota3 = datos[3].toDouble()
        val media = (nota1 + nota2 + nota3) / 3
        val calificacion: String

        if (media < 5) {
            calificacion = "Suspenso"
        } else if (media < 7) {
            calificacion = "Aprobado"
        } else if (media < 9) {
            calificacion = "Notable"
        } else {
            calificacion = "Sobresaliente"
        }

        println("$nombre - Notas: $nota1, $nota2, $nota3 - Media: $media - $calificacion")
    }
}
