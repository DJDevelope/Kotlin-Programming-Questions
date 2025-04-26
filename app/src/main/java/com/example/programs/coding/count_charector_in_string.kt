fun main() {
    println("Enter sentence")
    val sentenceStr = readLine() ?: ""
    val sentenceToChar = sentenceStr.trim().toCharArray()

    var tempChar :Char
    var count = 0
    var checkedString = ""

    for(i in 0..<sentenceToChar.size){
        count = 0
        tempChar = sentenceToChar[i]

        if (!checkedString.contains(sentenceToChar[i])){
            for (j in 0..<sentenceToChar.size){
                if(tempChar == sentenceToChar[j]){
                    count++
                }
            }

            checkedString += tempChar
            println("Charectar $tempChar come $count times.")
        }

    }
}
