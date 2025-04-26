//Check if two strings are Anagrams
fun main() {
    println("Enter first string")
    val firstStr = readln().replace(" ","")

    print("Enter second string")
    val secondStr = readln().replace(" ","")

    val firstStrChar = firstStr.toCharArray()
    val secondStrChar = secondStr.toCharArray()

    if(firstStr.length == secondStr.length){

        for (i in 0..<firstStrChar.size){
            firstStr[i]
        }
    }else{
        println("Not an anagrams try others string...")
    }
}