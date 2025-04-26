fun main() {
    println("Enter number followed by space to find missing number")
    val numberStr = readln()
    var numbers = numberStr.split(" ")
        .map { it.toInt() }
        .toIntArray()

    var result = 0
    var tempResult = 0
    var missingValue = 0

    numbers.forEachIndexed { index, value ->

        if (index + 1 < numbers.size) {
            result = numbers[index + 1] - value
        }

        if(tempResult != result && missingValue ==0){
            if(tempResult == 0){
                tempResult = result
            }else {
                if(tempResult < result){
                    missingValue = value + (result - tempResult)
                }else {
                    missingValue = value + (tempResult - result)
                }
            }
        }

    }
    println("Missing value is: ${missingValue}")
}
