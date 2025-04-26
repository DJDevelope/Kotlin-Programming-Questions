//Reverse a string
fun main(){
    println("Enter your string here! ")
    var inputFromUser = readlnOrNull().toString()
    println(reverseString(inputFromUser))
}

fun reverseString(inputString:String): String{
    var reverseStr = ""
    for(i in inputString.length-1 downTo 0){
        reverseStr += inputString[i]
    }

    return reverseStr
}