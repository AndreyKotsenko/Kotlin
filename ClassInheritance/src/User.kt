class User constructor(_firstName: String = "Peter", _secondName: String) {

    var firstName: String = _firstName
    var secondName: String = _secondName

    var login: String? = null
        set(value) {
            field = value
            println("$field")
        }
        get(){
            val loginField = field ?: "none"
            println("I take variable: $loginField")
            return field
        }

    val fullname: String
        get() = "$firstName $secondName"

    init {
        firstName = _firstName
        secondName = _secondName
    }

    fun printUser() {
        println("$firstName $secondName")
    }

    constructor(): this("Peter", "Patrik") {
        println("All done!")
    }
}