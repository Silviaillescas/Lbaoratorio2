fun main(args: Array<String>) {

    //Ejercicio 1

    println("Ejercicio 1")
    val numeros : List<Int> = listOf(10, 78, 93, 43, 52)
    println("Lista: " + numeros)

    // Utilizando la función reduce para sumar todos los elementos
    val suma = numeros.reduce { acc, num -> acc + num }

    // Calculando el promedio
    val promedio = suma.toDouble() / numeros.size

    // Imprimiendo el resultado
    println("El promedio es: $promedio")


    //Ejercicio 2
    println("Ejercicio 2")

    val enteros: List<Int> = listOf(23, 45, 53, 52, 34, 62, 33)

    val nimpares = enteros.filter { it % 2 != 0 }

    println("Todos los numeros: $enteros")
    println("Numeros impares:  $nimpares")


    //Ejercicio 3
    println("Ejercicio 3")

    fun String.isPalindrome(): Boolean = this == this.reversed()


    val str1 = "radar"
    val str2 = "hola"

    println("$str1")
    println(str1.isPalindrome())
    println("$str2")
    println(str2.isPalindrome())


    //Ejercicio 4
    println("Ejercicio 4")

    val nombres = listOf("Alicia", "Carlos", "María", "Juan")

    // Utilizando la función map para agregar un saludo antes de cada nombre
    val nombressaludo = nombres.map { "¡Hola, $it!" }

    nombressaludo.forEach { println(it) }

    //Ejercicio 5
    println("Ejercicio 5")

    fun Operation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

        val num1 = 10
        val num2 = 5

        // Definiendo una lambda para representar la suma
        val sumaLambda = { a: Int, b: Int -> a + b }

        val resultadoSuma = Operation(num1, num2, sumaLambda)
        println("Resultado de la suma: $resultadoSuma")

    //Ejercicio 6
    println("Ejercicio 6")

    data class Person(val name: String, val age: Int, val gender: String)
    data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

    fun mapToStudent(person: Person): Student {

        val studentId = "${person.name}${person.age}"

        return Student(person.name, person.age, person.gender, studentId)
    }

        val people = listOf(
            Person("Andrea", 19, "Female"),
            Person("Carlos", 15, "Male")
        )

        // Mapear cada objeto Person a un objeto Student
        val students = people.map { mapToStudent(it) }

        students.forEach {
            println("El Estudiante ${it.name} tiene ${it.age} años.")
        }
    }




