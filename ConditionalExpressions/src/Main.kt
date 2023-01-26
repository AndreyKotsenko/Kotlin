fun main(args: Array<String>) {
    var word: String? = null

    // we can use if-else expression like in Java.
    if(word == null) {
        println("Value: NULL")
    } else if(word == "Hello" || word == "Hi"){
        println("Value: $word")
    } else {
        println("Value: not NULL and not HELLO or HI")
    }

    // we have expression WHEN, it's like SWITCH in Java
    val number = 5
    when(number) {
        null -> println("Value: NULL")
        10 -> println("Value: 10")
        5 -> println("Value: 5")
        else -> println("Something else")
    }

    //we can use if-else expression in one line
    var res = if(number > 5) 1 else 0

    //we can assign a value to a variable from the WHEN operator. In this case, the data type may not be known in advance.
    var words = when(number){
        null -> "Nothing"
        else -> number
    }


}