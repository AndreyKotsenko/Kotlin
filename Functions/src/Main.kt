fun main(args: Array<String>) {

    //////////////////////////////////////////////////////////////////////////////////////
    /// Functions: with parameters, without parameters, with return, array as parameter///
    //////////////////////////////////////////////////////////////////////////////////////

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


    //////////////////////
    /// Local functions///
    //////////////////////
    compareAge(20, 23)
    compareAge(-3, 20)
    compareAge(34, 134)
    compareAge(15, 8)

    /////////////////////////
    ///Function overloading//
    /////////////////////////
    println(sum(10, 15))
    println(sum(10.0, 15.0))
    println(sum(10, 15, 12))
    println(sum(10, 15.5))
    println(sum(10.5, 15))

    /////////////////////////
    ///Function-variable/////
    /////////////////////////
    val message: () -> Unit
    message = ::hello
    message()

    // or we can do like this
    val message_2 = ::hello
    message_2()

    // function with parameters
    val operation: (Int, Int) -> Int = ::sum
    println(operation(3, 5))


    ////////////////////////////
    ///Function high order//////
    ////////////////////////////
    displayMessage(::morning)
    displayMessage(::evening)

    action(5, 3, ::multiply)    // 15
    action(5, 3, ::subtract)    // 2

    //////////////////////////////////////
    ///Return function from function//////
    //////////////////////////////////////
    val action1 = selectAction(1)
    println(action1(8, 5)) //13

    val action2 = selectAction(2)
    println(action2(8, 5)) //3

    ///////////////////////////
    ///Anonymous function//////
    ///////////////////////////
    doOperation(9, 5, fun(x: Int, y: Int): Int = x + y ) //14
    doOperation(9, 5, fun(x: Int, y: Int): Int = x - y) //4

    val op = fun(x: Int, y: Int): Int = x * y
    doOperation(9, 5, op) //45

    ////////////////////////////////////////////////
    ///Return anonymous function from function//////
    ////////////////////////////////////////////////
    val action_1 = selectAction(1)
    val result1 = action_1(4, 5)
    println(result1)        // 9

    val action_2 = selectAction2(3)
    val result2 = action_2(4, 5)
    println(result2)        // 20

    val action_3 = selectAction2(9)
    val result3 = action_3(4, 5)
    println(result3)        // 0

    /////////////////////////
    ///Lambda Expressions////
    /////////////////////////
    val hi = {println("Hello Kotlin")} // val hi: () -> Unit = {println("Hello Kotlin")}
    hi();

    {println("Hello Kotlin")}() // run like simple function, but we need use ; before this line

    // lambda with parameters
    val printer = {message: String -> println(message)}
    printer("Hello");

    {message: String -> println(message)}("Welcome to Kotlin")

    //some parameters
    var sum = {x: Int, y: Int -> println(x + y)}
    sum(2, 3)

    //few actions
    sum = {x: Int, y: Int ->
        val result = x + y
        println("$x + $y = $result")
    }
    sum(2, 3)

    // return
    val t = {x: Int, y: Int -> x + y}

    val h = t(2, 3)

    sum = {x: Int, y: Int ->
        val result = x + y
        println("$x + $y = $result")
        result // it will be return
    }

    val sum2 = {x: Int, y: Int -> x + y}
    doOperation(3, 4, sum2) //7
    doOperation(3, 4, {a: Int, b: Int -> a * b}) //12

    // trailing lambda
    doOperation(3, 4, {a, b -> a * b}) // 12
    doOperation(3, 4) {a, b -> a * b} // 12

    // return lambda from function
    val act1 = selectAction3(1)
    val res1 = act1(4, 5)
    println(res1)        // 9

    val act2 = selectAction3(3)
    val res2 = act2(4, 5)
    println(res2)        // 20

    val act3 = selectAction3(9)
    val res3 = act3(4, 5)
    println(res3)        // 0


}

//////////////////////////////////////////////////////////////////////////////////////
/// Functions: with parameters, without parameters, with return, array as parameter///
//////////////////////////////////////////////////////////////////////////////////////

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


//////////////////////
/// Local functions///
//////////////////////

fun compareAge(age1: Int, age2: Int){

    fun ageIsValid(age: Int) = age > 0 && age < 111 // local function

    if( !ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when{
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

/////////////////////////
///Function overloading//
/////////////////////////

fun sum(a: Int, b: Int) : Int{
    return a + b
}
fun sum(a: Double, b: Double) : Double{
    return a + b
}
fun sum(a: Int, b: Int, c: Int) : Int{
    return a + b + c
}
fun sum(a: Int, b: Double) : Double{
    return a + b
}
fun sum(a: Double, b: Int) : Double{
    return a + b
}

/////////////////////////
///Function-variable/////
/////////////////////////

fun hello(){
    println("Hello")
}

////////////////////////////
///Function high order//////
////////////////////////////
fun displayMessage(mes: () -> Unit){
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}

fun action (n1: Int, n2: Int, op: (Int, Int)-> Int){
    val result = op(n1, n2)
    println(result)
}

fun subtract(a: Int, b: Int): Int{
    return a - b
}
fun multiply(a: Int, b: Int): Int{
    return a * b
}

//////////////////////////////////////
///Return function from function//////
//////////////////////////////////////

fun selectAction(key: Int): (Int, Int) -> Int{
    when(key){
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}

fun empty(a: Int, b: Int): Int{
    return 0
}

///////////////////////////
///Anonymous function//////
///////////////////////////

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int){
    val result = op(x,y)
    println(result)
}

////////////////////////////////////////////////
///Return anonymous function from function//////
////////////////////////////////////////////////
fun selectAction2(key: Int): (Int, Int) -> Int{
    when(key){
        1 -> return fun(x: Int, y: Int): Int = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        3 -> return fun(x: Int, y: Int): Int = x * y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}

/////////////////////////
///Lambda Expressions////
/////////////////////////
fun selectAction3(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return {x, y -> x + y }
        2 -> return {x, y -> x - y }
        3 -> return {x, y -> x * y }
        else -> return {x, y -> 0 }
    }
}