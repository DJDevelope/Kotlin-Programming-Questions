fun main() {
    println("Enter numbers followed by space")
    val number = readln().split(" ").map { it.toInt() }.toIntArray()

    var minNumber = 0
    number.forEach {
        minNumber = number[0]
        if (it < minNumber){
            minNumber = it
        }
    }

    println("Minimum number is $minNumber")
}