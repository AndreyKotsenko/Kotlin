fun main(args: Array<String>) {

    // generic for variables in class
    val den: Person<Int> = Person(367, "Den")
    val bob: Person<String> = Person("A65", "Bob")

    println("${den.id} - ${den.name}")
    println("${bob.id} - ${bob.name}")

    // generic for functions in class
    val tom = Person("qwert", "Tom")
    tom.checkId("qwert")
    tom.checkId("dfsdf")

    // some generic types
    var word1: Word<String, String> = Word("one", "один")
    var word2: Word<String, Int> = Word("two", 2)

    println("${word1.source} - ${word1.target}")    // one - один
    println("${word2.source} - ${word2.target}")    // two - 2

    // generic for functions
    display("Hello Kotlin")
    display(1234)
    display(true)

    val arr1 = getBiggest(arrayOf(1,2,3,4), arrayOf(3, 4, 5, 6, 7, 7))
    arr1.forEach { item -> print("$item ") }    // 3  4  5  6  7  7

    println()

    val arr2 = getBiggest(arrayOf("Tom", "Sam", "Bob"), arrayOf("Kate", "Alice"))
    arr2.forEach { item -> print("$item ") }    // Tom  Sam  Bob

    ////////////////////////////
    ///Limitations of generic///
    ///////////////////////////

    val result1 = getBiggest2(1, 2)
    println(result1)
    val result2 = getBiggest2("Tom", "Sam")
    println(result2)

    val result3 = getBiggest3(1, 2)
    println(result3)    // 2

    val result4 = getBiggest3(1.6, -2.8)
    println(result4)    // 1.6

    // val result5 = getBiggest3("Tom", "Sam")  // ! Ошибка - String не является производным от класса Number
    // println(result3)

    val email1 = EmailMessage("Hello Kotlin")
    val outlook = Messenger<EmailMessage>()
    outlook.send(email1)

    val skype = Messenger<SmsMessage>()
    val sms1 = SmsMessage("Привет, ты спишь?")
    skype.send(sms1)

}

fun <T> display(obj: T) {
    println(obj)
}

fun <T> getBiggest(args1 : Array<T>, args2: Array<T>): Array<T> {
    if(args1.size > args2.size) return args1
    else return args2
}

////////////////////////////
///Limitations of generic///
///////////////////////////

//fun <T> getBiggest(a: T, b: T): T {
//    if(a > b) return a // error because we can use type(T) that can't be compare
//    else return b
//}

fun <T: Comparable<T>> getBiggest2(a: T, b: T) : T { // we can use it because we inheritance Comparable
    return if(a > b) a else b
}

fun <T> getBiggest3(a: T, b: T) : T where T: Comparable<T>, T: Number {
    return if(a > b) a else b
}

class Messenger<T>() where T: Message, T: Logger{
    fun send(mes: T){
        mes.log()
    }
}
interface Message{ val text: String }
interface Logger{ fun log() }

class EmailMessage(override val text: String): Message, Logger{
    override fun log() = println("Email: $text")
}
class SmsMessage(override val text: String): Message, Logger{
    override fun log() = println("SMS: $text")
}