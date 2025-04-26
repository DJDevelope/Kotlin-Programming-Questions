//Reverse a string
fun main(){
    // Takes input string
    println("Enter your string here! ")
    var inputFromUser = readlnOrNull().toString()
    // prints reversed string
    println(reverseString(inputFromUser))
}

fun reverseString(inputString:String): String{
    // declaring an empty string
    var reverseStr = ""
    // loop through each char in inputString in reverse order
    for(i in inputString.length-1 downTo 0){
        reverseStr += inputString[i]
    }

    return reverseStr
}