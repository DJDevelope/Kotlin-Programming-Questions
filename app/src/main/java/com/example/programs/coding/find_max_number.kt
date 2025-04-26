fun main() {
    println("Enter number followed by comma")
    val number = readln().split(",").map { it.toInt() }.toIntArray()

    var maxNumber = 0
    number.forEach {
        maxNumber = number[0]
        if (it > maxNumber ){
            maxNumber = it
        }
    }
    println("Max number is $maxNumber")

}