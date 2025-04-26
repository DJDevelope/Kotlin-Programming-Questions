import kotlin.text.replace

fun main() {
    println("Enter sentence")
    val sentenceStr = readLine() ?: ""
    val sentenceToChar = sentenceStr.replace(" ", "").toCharArray()

    var tempChar :Char
    var count = 0
    var checkedString = ""

    //loop all array
    for(i in 0..<sentenceToChar.size){
        //reset the count
        count = 0
        //assign the charecter for loop
        tempChar = sentenceToChar[i]

        // check string is not present
        if (!checkedString.contains(sentenceToChar[i])){
            //loop for all array to check the repeating
            for (j in 0..<sentenceToChar.size){
                //check the temp character is present or not
                if(tempChar == sentenceToChar[j]){
                    //increment the count
                    count++
                }
            }
            //add the checked string
            checkedString += tempChar
            //check count is 1 or not
            if (count > 0 && count == 1){
                println("Charectar $tempChar is first non-repeating Charecter  $count times.")
                break
            }
        }

    }
}
