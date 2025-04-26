import androidx.compose.ui.text.toLowerCase

fun main() {

    println("Enter string to check palindrome")
    val newStr = readln().toString().replace(" ","")
    val newStrToChar = newStr.toCharArray()
    var reverseStr = ""
    for (i in newStrToChar.size-1 downTo 0){
        reverseStr += newStr[i]
    }

    if (newStr.lowercase() == reverseStr.lowercase()){
        println("String is palindrome")
    }else{
        println("String is not palindrome")
    }
}