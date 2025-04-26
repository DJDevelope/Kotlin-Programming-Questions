//Print unique character
fun main() {
    println("Enter any sentence")
    val sentStr = readLine() ?: ""
    val sentTOChar = sentStr.toCharArray()

    var tempChar : Char
    var count = 0
    var checkedString = ""

    for(i in 0..<sentTOChar.size){
       count = 0
       tempChar = sentTOChar[i]

        if(!checkedString.contains(tempChar)){
            for (j in 0..<sentTOChar.size){
                if(tempChar == sentTOChar[j]){
                    count++
                }
            }


            checkedString += tempChar
            println("$tempChar is unique charecter.")

        }

    }
}