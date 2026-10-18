package ejercicio04

fun validarContrasena(contrasena: String): Boolean {
    var valida = true

    if (contrasena.length < 8) {
        println("Debe tener al menos 8 caracteres.")
        valida = false
    }
    if (!contrasena.any { it.isUpperCase() }) {
        println("Debe tener al menos una mayúscula.")
        valida = false
    }
    if (!contrasena.any { it.isLowerCase() }) {
        println("Debe tener al menos una minúscula.")
        valida = false
    }
    if (!contrasena.any { it.isDigit() }) {
        println("Debe tener al menos un dígito.")
        valida = false
    }
    if (!contrasena.any { !it.isLetterOrDigit() }) {
        println("Debe tener al menos un carácter especial.")
        valida = false
    }

    return valida
}

fun main() {
    println("Escribe una contraseña de prueba:")
    val contrasena = readln()
    if (validarContrasena(contrasena)) {
        println("Contraseña válida.")
    } else {
        println("Contraseña no válida.")
    }
}
