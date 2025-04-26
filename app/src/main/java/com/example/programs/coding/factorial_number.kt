fun main() {

    println("Enter any number")
    val number = readln().toInt()
    var factorial = 1
    for (i in number downTo 1){
        factorial *= i
    }

    println("Factorial of $number is $factorial")
}