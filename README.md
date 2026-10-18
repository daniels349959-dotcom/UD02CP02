# Unidad 02 - Práctica 02

Cinco ejercicios de Kotlin por consola. Cada archivo tiene su propio `main` y se ejecuta por separado. No necesitan pantallas ni un proyecto Android.

## Archivos

| Archivo | Ejercicio |
| --- | --- |
| Ejercicio01.kt | Procesador del CSV de notas |
| Ejercicio02.kt | Gestor de tareas con menú |
| Ejercicio03.kt | Frecuencia de letras |
| Ejercicio04.kt | Validador de contraseñas |
| Ejercicio05.kt | Reservas de cine |

## Cómo ejecutarlos en IntelliJ IDEA

1. Crea un proyecto de Kotlin para JVM con un JDK configurado.
2. Copia los cinco archivos `.kt` dentro de `src` (o `src/main/kotlin` si esa es la carpeta de fuentes de tu proyecto).
3. Abre el archivo que quieras probar.
4. Pulsa el botón de ejecución junto a `fun main()` y escribe en la consola cuando lo pida.

Los `package ejercicio01`, `package ejercicio02`, etc. separan los programas para evitar conflictos entre sus funciones `main`.

Si ya tienes el compilador de Kotlin instalado, también puedes compilar un ejercicio así:

```bash
kotlinc Ejercicio01.kt -include-runtime -d ejercicio01.jar
java -jar ejercicio01.jar
```

Cambia el número del archivo para ejecutar otro ejercicio.

## Explicación breve

1. `split("\n")` separa las líneas. Se salta la primera porque contiene los nombres de las columnas. Las tres notas se convierten a `Double` para calcular una media con decimales. Se interpreta: menos de 5 suspenso, de 5 a menos de 7 aprobado, de 7 a menos de 9 notable y desde 9 sobresaliente.
2. Una lista mutable guarda las tareas. Al completar se antepone `[X]`. El usuario numera desde 1 y la lista desde 0, por lo que se resta 1. La función de extensión usa `filter` para obtener las pendientes. No se permite añadir tareas vacías ni que empiecen por la marca reservada `[X]`.
3. Un mapa relaciona cada letra con su contador. `lowercase()` unifica mayúsculas y minúsculas. `isLetter()` excluye espacios, cifras y signos. `sortedByDescending` ordena los contadores de mayor a menor.
4. Cada `if` comprueba un requisito y muestra su error. Son comprobaciones independientes para mostrar todos los errores. `any` comprueba si hay algún carácter que cumple una condición. Se aplica literalmente el criterio del enunciado: un espacio también cuenta como carácter especial.
5. Dos bucles crean los 25 asientos. `false` significa disponible y `true`, ocupado. Consultar una clave inexistente devuelve `null`. `as?` intenta una conversión segura y `?:` proporciona un valor alternativo. En este mapa la conversión a `Boolean` es redundante, pero se incluye porque la pide el ejercicio. Se comprueba la existencia del asiento antes de reservar o cancelar. El `try-catch` controla una opción de menú que no sea un entero.

## Comprobaciones para hacer al ejecutar

- Ejercicio 1: Ana tiene media 8.0 (Notable), Luis 5.0 (Aprobado) y Marta 9.0 (Sobresaliente).
- Ejercicio 2: añade dos tareas, completa la primera y consulta las pendientes. Solo debe aparecer la segunda. Prueba también completar la tarea 99 o escribir una letra como número.
- Ejercicio 3: con `Hola HOLA!` deben aparecer h, o, l y a con frecuencia 2 cada una. Los empates pueden conservar el orden de aparición.
- Ejercicio 4: `Abcdef1!` es válida. `abc` debe mostrar errores de longitud, mayúscula, dígito y carácter especial.
- Ejercicio 5: reserva A1, intenta reservarla otra vez, muestra el mapa y cancélala. Prueba Z9 y una letra como opción del menú.

Estado: revisión estática realizada. Estos archivos no se han compilado ni ejecutado en el entorno de preparación porque no hay un compilador de Kotlin disponible. Las comprobaciones anteriores son resultados esperados para verificar en el IDE.

## Cómo subirlo a GitHub y entregar la URL

1. Entra en tu cuenta de GitHub y crea un repositorio llamado `Unidad02-Practica02`, o utiliza el repositorio de clase si el profesor ha indicado uno.
2. Si el profesor no tiene acceso a repositorios privados, el repositorio tendrá que ser público para que pueda verlo. No subas datos personales ni contraseñas.
3. Descomprime el ZIP descargado. Sube los cinco archivos `.kt` y este `README.md` mediante la opción de subir archivos del repositorio. No subas únicamente el ZIP: interesa poder leer cada solución en GitHub.
4. Confirma la subida y comprueba que aparecen los cinco archivos y que puedes abrir su contenido.
5. Copia la URL del repositorio desde la barra del navegador. Esa es la URL que entregas; no es una URL de GitHub Pages.

No se ha creado ni publicado ningún repositorio como parte de esta preparación.
