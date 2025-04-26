//Print unique character
fun main() {
    println("Enter any sentence") // Print message to ask for user input.
    val sentStr = readLine() ?: "" // Read line from console or set empty string if null
    val sentTOChar = sentStr.toCharArray() // Convert the input string to an array of characters.

    var tempChar : Char // Variable to hold the current character being checked.
    var count = 0 // Variable to count the occurrences of the current character.
    var checkedString = "" // String to keep track of the characters that have already been checked.

    // Loop through sentTOChar array
    for(i in 0..<sentTOChar.size){
       count = 0 // Initialize count to 0 for each new character.
       tempChar = sentTOChar[i] // Get the current character from the array.

        // Check if current character is already present in checkedString
        if(!checkedString.contains(tempChar)){
            // If character is not present in checkedString, then we check the whole sentTOChar array
            // to see how many time it occurs
            // Inner loop to iterate through the array again to count occurrences.
            // For each charater it loops again whole sentTOChar array to check how many time that letter comes
            // like if i = a, then loop again on whole char array to count how many 'a' comes.
            // If a comes only one time means unique character.
            for (j in 0..<sentTOChar.size){
                if(tempChar == sentTOChar[j]){
                    count++
                }
            // if count == 1 means unique, so print that letter
            if(count > 1)
                break
            }


            checkedString += tempChar
            println("$tempChar is unique charecter.")

        }

    }
}