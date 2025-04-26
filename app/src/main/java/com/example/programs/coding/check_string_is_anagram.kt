//Check if two strings are Anagrams
fun main() {
    println("Enter first string")
    //Read first string from the user and remove the space from the string
    val firstStr = readln().replace(" ","")

    print("Enter second string")
    //Read second string from the user and remove the space from the string
    val secondStr = readln().replace(" ","")

    //convert string to array of char
    val firstStrChar = firstStr.toCharArray()
    //convert string to array of char
    val secondStrChar = secondStr.toCharArray()

    //check length of string is equal or not
    if(firstStr.length == secondStr.length){

        for (i in 0..<firstStrChar.size){
            firstStr[i]
        }
    }else{
        println("Not an anagrams try others string...")
    }
}