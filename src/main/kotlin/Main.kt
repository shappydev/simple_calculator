fun main() {
    println("Welcome to the Simple Calculator!")
    while(true) {
        println("Choose an operation:")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")

        val choice = readlnOrNull()?.toIntOrNull() ?: continue

        when(choice) {
            1 -> performAddition()
            2 -> performSubtraction()
            3 -> performMultiplication()
            4 -> performDivision()
            5 -> {
                println("Exiting the Simple Calculator. Goodbye!")
                return
            }
            else -> println("Invalid choice. Please select a valid option.")
        }
    }
}

fun performAddition() {
    println("Enter the first number:")
    val number1 = readlnOrNull()?.toDoubleOrNull()
    println("Enter the second number:")
    val number2 = readlnOrNull()?.toDoubleOrNull()

    if(number1 != null && number2 != null) {
        val result = number1 + number2
        println("Result of addition: $result")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}

fun performSubtraction() {
    println("Enter the first number:")
    val number1 = readlnOrNull()?.toDoubleOrNull()
    println("Enter the second number:")
    val number2 = readlnOrNull()?.toDoubleOrNull()

    if(number1 != null && number2 != null) {
        val result = number1 - number2
        println("Result of subtraction: $result")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}

fun performMultiplication() {
    println("Enter the first number:")
    val number1 = readlnOrNull()?.toDoubleOrNull()
    println("Enter the second number:")
    val number2 = readlnOrNull()?.toDoubleOrNull()

    if(number1 != null && number2 != null) {
        val result = number1 * number2
        println("Result of multiplication: $result")
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}

fun performDivision() {
    println("Enter the dividend:")
    val dividend = readlnOrNull()?.toDoubleOrNull()
    println("Enter the divisor:")
    val divisor = readlnOrNull()?.toDoubleOrNull()

    if (dividend != null && divisor != null) {
        if (divisor != 0.0) {
            val result = dividend / divisor
            println("Result of division: $result")
        } else {
            println("Cannot divide by zero. Please enter a non-zero divisor.")
        }
    } else {
            println("Invalid input. Please enter valid numbers.")
        }
    }
