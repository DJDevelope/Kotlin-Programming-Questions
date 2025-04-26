/*
Simple Anagram Pairs:
listen → silent
evil → vile
dusty → study
save → vase
angel → glean
elbow → below
night → thing
inch → chin
earth → heart
brag → grab
*/
//Check if two strings are Anagrams
fun main() {
    println("Enter first string")
    //Read first string from the user and remove the space from the string
    val firstStr = readln().replace(" ","")

    println("Enter second string")
    //Read second string from the user and remove the space from the string
    val secondStr = readln().replace(" ","")

    //convert string to array of char
    val firstStrChar = firstStr.toCharArray()
    //convert string to array of char
    val secondStrChar = secondStr.toCharArray()

    var count = 0

    //check length of string is equal or not (listen, silent)
    if(firstStr.length == secondStr.length){
        firstStrChar.forEach {
            if(secondStrChar.contains(it)){
                count++
            }
        }


        if(count == firstStrChar.size){
            println("Given strings are anagram.")
        }else {
            println("Given strings are not anagram!")
        }

    }else{
        println("Not an anagrams try others string...")
    }
}