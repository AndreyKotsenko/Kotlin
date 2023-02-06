fun main(args: Array<String>) {

    // > < >= <= == !=
    val a = 11
    val b = 12
    var c : Boolean = a > b
    println(c) // false

    c = 35 > 12
    println(c)// true

    c = a < b
    println(c)// true

    c = a >= b
    println(c)// false

    c = 11 >= a
    println(c)// true

    c = a <= b
    println(c)// false

    c = a == b
    println(c)// false

    c = a == 11
    println(c)// true

    c = a != b
    println(c)// true

    // and or xor ! not() in
    val d = true
    val e = false

    var f = d and e //false

    f = d or e // true

    f = d xor e //true
    f = d xor (90 > 10) //false

    f = !d // false

    f = d.not() // false

    f = a in 10..20 // true

    f = a !in 10..20 // false


    // if-else
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

    //we can compare with several values
    val num = 10
    when(num){
        10,20 -> println("$a")
        else -> println("nothing")
    }

    when(num){
        in 10..20 -> println("in range 10..20")
        in 20..30 -> println("in range 20..30")
        in 40..50 -> println("in range 40..50")
        !in 60..70 -> println("not in range 60..70")
        else -> println("nothing")
    }

    val num_1 = 10
    val num_2 = 5
    val num_3 = 3
    when(num_1){
        num_2 - num_3 -> println("$num_1")
        num_2 + 5 -> println("$num_1")
        else -> println("nothing")
    }

    when(num_1 + num_2){
        10 -> println("10")
        5 -> println("5")
        else -> println("nothing")
    }

    when(val result = num_1 + num_2){
        10 -> println("$result")
        5 -> println("$result")
        else -> println("nothing")
    }

    when{
        (b > 10) -> println("b больше 10")
        (a > 10) -> println("a больше 10")
        else -> println("и a, и b меньше или равны 10")
    }
}