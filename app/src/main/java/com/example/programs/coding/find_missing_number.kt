fun main() {
    println("Enter number followed by space to find missing number") // Print message to enter numbers
    val numberStr = readln() // read input numbers from user
    var numbers = numberStr.split(" ") // split the input string with space
        .map { it.toInt() } // convert string to int
        .toIntArray() // convert list to int array

    var result = 0 // initialize result variable
    var tempResult = 0 // initialize temp result
    var missingValue = 0 // variable to store missing value



    numbers.forEachIndexed { index, value -> // iterate through the array with index

        if (index + 1 < numbers.size) { // check if index+1 is in bound
            result = numbers[index + 1] - value // difference between next and current value
        }

        if(tempResult != result && missingValue ==0){ // check if tempresult is not equals result
            if(tempResult == 0 && tempResult != result){ // when temp result is 0 and result is not equal to 0
                tempResult = result // initialize temp result with result
            }else { // if tempresult is not 0
                if(tempResult != 0 && tempResult < result){ // check if tempresult is less than result
                    missingValue = value + (result - tempResult) // calculate the missing number
                }else { // otherwise calculate the missing number
                    missingValue = value + (tempResult - result) // calculate missing number
                }
            }
        }

    }


    println("Missing value is: ${missingValue}") // print the missing value

}
