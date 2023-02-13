fun main(args: Array<String>){
    // anonymous class
    val tom = object{
        val name = "Tom"
        val age = 37
        fun sayHello(){
            println("Hi, my names is $name")
        }
    }

    println("Name: ${tom.name} Age: ${tom.age}")
    tom.sayHello()

    // inheritance
    val nick = object : Person("Nick") {
        val company = "JetBrains"
        override fun sayHello() {
            println("Hi, my name is $name. I am work in $company")
        }
    }

    nick.sayHello()

    // anonymous object as function parameter
    hello(
        object : Person("Sam"){
            val company = "JetBrains"
            override fun sayHello(){
                println("Hi, my name is $name. I work in $company")
            }
        })

    // return anonymous object
    val sam = createPerson("Sam", "JetBrains")
    sam.sayHello()

    // how it works with private inline
    val kein = createPerson("Kein", "JetBrains")
    println(kein.name)   // норм - свойство name унаследовано от Person
    println(kein.company)    // ! Ошибка - свойство недоступно
}

fun hello(person: Person){
    person.sayHello()
}

private fun createPerson(_name: String, _company: String) = object{
    val name = _name
    val company = _company
    fun sayHello() = println("Hi, my name is $name. I work in $company")
}

open class Person(val name: String){
    open fun sayHello(){
        println("Hi, my name is $name")
    }
}

private inline fun createPerson2(_name: String, _comp: String) = object: Person(_name){
    val company = _comp
}