fun main(args: Array<String>) {
    sayHello()
    sayNameAge("Andrey", 23)
    println("Res = " + add(5, 10))
    println(saySomething(true))

    //vararg
    printSome()
    printSome("Some")
    printSome("Some", "thing", "else")

    //vararg + 1 required param
    printOneRequired("Hi")
    printOneRequired("Hi", "world", "or", "no")
    // printOneRequired() - don't work

    //vararg with array
    var names = arrayOf("Bob", "John", "Alex")
    printOneRequired("Hi", *names)

    //vararg with array(any types)
    var any = arrayOf("Bob", "John", "Alex", 1, true, 45.32532)
    printAny(*any)

    //explicit parameter passing
    printAnyAgain(word = arrayOf("Hi"), item = "Some")
    printAnyAgain(word = arrayOf("Hi"))

}

fun sayHello() {
    println("Hello world")
}

fun sayNameAge(name:String, age: Int): Unit {
    println("Name: $name, age: $age")
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun saySomething(first: Boolean): String = "Something $first"

fun printSome(vararg word: String){
    word.forEach{ el -> print("$el ") }
    println()
}

fun printOneRequired(item: String, vararg word: String){
    print("$item: ")
    word.forEach{ el -> print("$el ") }
    println()
}

fun printAny(vararg word: Any){
    word.forEach{ el -> print("$el ") }
    println()
}

fun printAnyAgain(item: String = "Hi", vararg word: Any){
    println("$item")
    word.forEach{ el -> print("$el ") }
    println()
}