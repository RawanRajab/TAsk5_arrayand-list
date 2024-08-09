fun main() {
   // 1: Declare an array of integers with the values [1, 2, 3, 4, 5].
    val arrayNum = arrayOf(1, 2, 3, 4, 5)
   // 2Use a loop to iterate through the array and print each value using withIndex.
    arrayNum.withIndex().forEach { (index, value) ->
        println("Index: $index, Value: $value")
    }
   //3 Reverse the array and print the reversed array.  
    arrayNum.reverse()
    println("Reversed array: ${arrayNum.contentToString()}")

    // 1. Declare an immutable list of strings with the values ["apple", "banana", "cherry"].
    val ListOfFruits= listOf("apple", "banana", "cherry")

    // 2. Use a loop to iterate through the list and print each value using indices.
    for (i in ListOfFruits.indices) {
        println("Index $i: ${ListOfFruits[i]}")
    }

    // 3. Use the contains operator to check if the list contains the element "banana" and print the result.
    println("List contains 'banana'?: ${ListOfFruits.contains("banana")}")

    // 4. Convert the list to uppercase and print the modified list.
    val uppercaseList = ListOfFruits.map { it.uppercase() }
    println("Uppercase list: $uppercaseList")

    // 1. Declare a mutable list of doubles with the values [1.1, 2.2, 3.3].
    val muList = mutableListOf(1.1, 2.2, 3.3)

    // 2. Add the value 4.4 to the mutable list.
    muList.add(4.4)

    // 3. Remove the value 2.2 from the mutable list.
    muList.remove(2.2)

    // 4. Use a loop to iterate through the mutable list and print each value with for each.
    for (value in muList) {
        println(value)
    }

    // 5. Sort the mutable list in ascending order and print the sorted list.
    muList.sort()
    println("Sorted list: $muList")

    // Original array of integers
    val myArray = arrayOf(1, 2, 3, 4, 5)

    // 1. Use the map operator to create a new list from the array where each value is multiplied by 2. Print the new list.
    val doubledList = myArray.map { it * 2 }
    println("Doubled list: $doubledList")

    // Original list of strings
    val ListOfFruits2 = listOf("kiwi", "mango", "papaya", "raspberry", "strawberry")

    // 2. Use the filter operator to create a new list from the original list of strings that only contains strings with more than 5 characters. Print the new list.
    val longStrings = ListOfFruits2.filter { it.length > 5 }
    println("Strings with more than 5 characters: $longStrings")

    // Modified mutable list of doubles
    val myMutableList = mutableListOf(1.1, 2.2, 3.3, 4.4)

    // 3. Use the forEach loop to iterate through the modified mutable list of doubles and print each value squared
    myMutableList.forEach { println("${it * it}") }
}