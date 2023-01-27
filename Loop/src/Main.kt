fun main(args: Array<String>) {
    var items = 5

    // loop WHILE
    while(items > 0){
        println(items)
        items--
    }

    //loop do-while
    do {
        println("Items: $items")
    } while(items == 5)

    //loop FOR
    for(i in 0..3) {
        println(i)
    }

    //loop for with step
    for(i in 0..10 step 2) {
        println(i)
    }

    //reverse loop with step
    for(i in 10 downTo 0 step 2) {
        println(i)
    }

    //loop with alphabet
    for(el in 'a'..'d') {
        println(el)
    }

    //loop with alphabet and step
    for(el in 'a'..'y' step 2) {
        println(el)
    }

    //reverse loop with alphabet and step
    println("Down alphabet")
    for(el in 'z' downTo 'a' step 5) {
        println(el)
    }

    val x = 20

    //range in IF
    if(x in 5..30) {
        println("Variable: $x")
    }

    if(x !in 5..30) {
        println("Variable: $x")
    }

}