fun main() {
    println("Enter a number")
    // Returns a string
    val input = readln()
    println("Enter another number")
    val input2 = readln()
    val output = input.toInt() + input2.toInt()
    println("Your answer is $output")
}