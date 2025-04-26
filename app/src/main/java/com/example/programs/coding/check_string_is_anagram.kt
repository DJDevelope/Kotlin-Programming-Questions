/**
 * This function determines if two strings entered by the user are anagrams.
 * Anagrams are words or phrases formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * The function prompts the user to enter two strings, removes any spaces, and then checks if they are anagrams.
 * It does this by first ensuring that the strings are of equal length. If they are, it checks if every character
 * in the first string is present in the second string. If all characters are present, the strings are deemed
 * to be anagrams; otherwise, they are not. If the string lengths are unequal it will print a message.
 *
 * Example:
 *   Input:
 *     First string: listen
 *     Second string: silent
 *   Output:
 *     Given strings are anagram.
 *
 *   Input:
 *     First string: hello
 *     Second string: world
 *   Output:
 *    Given strings are not anagram!
 *
 *  Input:
 *    First string: abc
 *    Second string: abcd
 *  Output:
 *   Not an anagrams try others string...
 *//*
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
    // Print a message to prompt the user to enter the first string
    println("Enter first string")
    // Read the first string from the user, remove spaces, and store it in 'firstStr'
    val firstStr = readln().replace(" ","")

    // Print a message to prompt the user to enter the second string
    println("Enter second string")
    // Read the second string from the user, remove spaces, and store it in 'secondStr'
    val secondStr = readln().replace(" ","")

    // Convert the first string to an array of characters
    val firstStrChar = firstStr.toCharArray()
    // Convert the second string to an array of characters
    val secondStrChar = secondStr.toCharArray()

    // Initialize a counter variable 'count' to 0
    var count = 0

    // Check if the lengths of the two strings are equal (a requirement for anagrams)
    if(firstStr.length == secondStr.length){
        // Iterate through each character in 'firstStrChar'
        firstStrChar.forEach {
            // Check if the current character exists in 'secondStrChar'
            if(secondStrChar.contains(it)){
                count++
            }
        }
        //Check count and first string size, if both are same that means both strings contain same characters
        if(count == firstStrChar.size){
            // Print that strings are anagrams
            println("Given strings are anagram.")
        }else {
            //Print that strings are not anagrams
            println("Given strings are not anagram!")
        }

    }else{
        println("Not an anagrams try others string...")
    }
}