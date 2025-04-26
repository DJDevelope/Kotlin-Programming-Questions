fun main() {
    println("Enter sentence") // print sentence
    val sentenceStr = readLine() ?: "" // read sentence from console
    val sentenceToChar = sentenceStr.trim().toCharArray() // trim sentence and convert in to char array

    var tempChar :Char // declare temporary char
    var count = 0 // declare counter
    var checkedString = "" // declare variable for checked string

    for(i in 0..<sentenceToChar.size){ // for loop till length of char array
        count = 0 // reset counter to zero
        tempChar = sentenceToChar[i] // store current char to temporary char

        if (!checkedString.contains(sentenceToChar[i])){ // check if char already checked or not
            for (j in 0..<sentenceToChar.size){ // for loop for counting charector
                if(tempChar == sentenceToChar[j]){ // check if tempChar and sentenceToChar[j] are equal or not
                    count++ // increment counter
                }
            }

            checkedString += tempChar // add current charector to checked string
            println("Charectar $tempChar come $count times.") // print result
        }

    }
}
