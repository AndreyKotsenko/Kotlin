fun main(args: Array<String>) {
    var byte: Byte = 10
    var short: Short = 15
    var int: Int = 236
    var long: Long = 456344634
    var double:Double = 4.0547945974957945704
    var float: Float = 5.754754f
    var char: Char = 'f'
    var string: String = "Hello"
    var boolean: Boolean = false

    println("Byte:\n" +
            " Max value: " + Byte.MAX_VALUE + "\n" +
            " Min value: " + Byte.MIN_VALUE + "\n" +
            " Size bits: " + Byte.SIZE_BITS + "\n")

    println("Short:\n" +
            " Max value: " + Short.MAX_VALUE + "\n" +
            " Min value: " + Short.MIN_VALUE + "\n" +
            " Size bits: " + Short.SIZE_BITS + "\n")

    println("Int:\n" +
            " Max value: " + Int.MAX_VALUE + "\n" +
            " Min value: " + Int.MIN_VALUE + "\n" +
            " Size bits: " + Int.SIZE_BITS + "\n")

    println("Long:\n" +
            " Max value: " + Long.MAX_VALUE + "\n" +
            " Min value: " + Long.MIN_VALUE + "\n" +
            " Size bits: " + Long.SIZE_BITS + "\n")

    println("Double:\n" +
            " Max value: " + Double.MAX_VALUE + "\n" +
            " Min value: " + Double.MIN_VALUE + "\n" +
            " Size bits: " + Double.SIZE_BITS + "\n")

    println("Float:\n" +
            " Max value: " + Float.MAX_VALUE + "\n" +
            " Min value: " + Float.MIN_VALUE + "\n" +
            " Size bits: " + Float.SIZE_BITS + "\n")

    println("Char:\n" +
            " Max high surrogate: " + Char.MAX_HIGH_SURROGATE + "\n" +
            " Max low surrogate: " + Char.MAX_LOW_SURROGATE + "\n" +
            " Min high surrogate: " + Char.MIN_HIGH_SURROGATE + "\n" +
            " Min low surrogate: " + Char.MIN_LOW_SURROGATE + "\n" +
            " Size bits: " + Char.SIZE_BITS + "\n")

    println("Boolean:\n" +
            " Possible values: TRUE or FALSE ")

    val constant:Int = 10
    // constant = 18 - error, 'cause it constant

    /*
    var - it is variable
    val - it is constant
     */

    //---------------------------------------------

    /*
    if you want to assign NULL value, then you need to use this construction
                                 ||
                                 \/
     */

    var value: Int? = null

    /*
    Also we can use this construction for variables ( without types)
                                 ||
                                 \/
     */

    var variable_1 = "string"
    var variable_2 = 10
    var variable_3 = 45.54f

    /*
    Math operations: + - * / % += -= /= *= %= var++ var-- ++var --var
     */

}