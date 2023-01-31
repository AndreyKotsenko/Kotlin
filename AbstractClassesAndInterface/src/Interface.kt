interface Movable{
    var speed: Int  // объявление свойства
    fun move()      // определение функции без реализации
    fun stop(){     // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}

interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}

class Car(override val model: String, override var number: String) : Movable, Info{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}

class Aircraft : Movable{

    override var speed = 600
    override fun move(){
        println("Самолет летит со скоростью $speed км/ч")
    }
    override fun stop(){
        println("Приземление")
    }
}