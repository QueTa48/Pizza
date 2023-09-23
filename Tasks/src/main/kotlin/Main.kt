import kotlin.math.pow

fun first() {
    println("Введите строку")
    var str = (readln() + ' ').toMutableList()
    var str1 = ""

    for (i in 0 until str.size) {
        str1 += str[i]
        if (i == str.size - 1)
            break
        var count = 1
        while (str[i] == str[i + 1]) {
            str.removeAt(i)
            count++
        }
        if (count != 1)
            str1 += count.toString()
    }
    println(str1)
}

fun second()
{
    print("Введите строку: ")
    val text = readln()

    val charCounts = mutableMapOf<Char, Int>()
    for (key in text) {
        charCounts[key] = charCounts.getOrDefault(key, 0) + 1
    }

    val sortedChars = charCounts.keys.sorted()

    println("Количество различных символов: ${charCounts.size}")

    println("Символы (в алфавитном порядке):")
    for (char in sortedChars) {
        println("$char - ${charCounts[char]}")
    }
}

fun third()
{
    println("enter decimal number:")
    val decimalNumber = readln().toInt()

    var decimal = decimalNumber
    var binaryNumber = ""

    while (decimal > 0) {
        binaryNumber += (decimal % 2).toString()
        decimal /= 2
    }

    println("number $decimalNumber in binary form is $binaryNumber")
}

fun fourth()
{
    println("Enter two numbers and the operation symbol (separated by a space): ")
    val input = readln().split(" ")

    val number1 = input[0].toDouble()
    val operator = input[1].single()
    val number2 = input[2].toDouble()

    var result = 0.0
    when (operator) {
        '+' -> result = number1 + number2
        '-' -> result = number1 - number2
        '*' -> result = number1 * number2
        '/' -> result = number1 / number2
    }
    println("Result: ${result.toString()}")
}

fun fifth()
{
    print("Введите основание степени x: ")
    val x = readln().toDouble()
    print("Введите целое число n: ")
    val n = readln().toDouble()

    var y  = 0
    while (x.pow(y.toDouble()) < n)
        y++

    if (x.pow(y.toDouble()) == n)
        println("Показатель степени: $y")
    else
        println("Целочисленный показатель не существует")
}

fun sixth()
{
    print("Введите целое число a: ")
    val n = readln()

    print("Введите целое число b: ")
    val x = readln()

    val number1 = (n + x).toInt()
    val number2 = (x + n).toInt()

    if (number1 % 2 != 0)
        println("Нечетное число $number1")
    else if (number2 % 2 != 0)
        println("Нечетное число $number2")
    else
        println("Создать нечетное число невозможно")
}

fun main(args: Array<String>) {
    first()
}