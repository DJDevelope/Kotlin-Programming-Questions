//Check if two strings are Anagrams using for loop

fun main() {

    println("Enter first string")
    val firstStr = readLine().toString().replace(" ", "")
    println("Enter second string")
    val secondStr = readLine().toString().replace(" ", "")

    val firstStrToChar = firstStr.toCharArray()
    val secondStrToChar = secondStr.toCharArray()

    var count = 0

    if(firstStrToChar.size == secondStrToChar.size){
        for(i in 0..<firstStrToChar.size){
            if(secondStrToChar.contains(firstStrToChar[i])){
                count++
            }
        }

        if(count == firstStrToChar.size){
            println("String is anagram string")
        }else{
            println("String is not anagram string")
        }
    }else{
        println("String is not anagram string")
    }


}