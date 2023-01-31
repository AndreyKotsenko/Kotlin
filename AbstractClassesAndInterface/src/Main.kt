fun main(args: Array<String>) {

    val figure: Figure = Rectangle(10f, 15f)
    println(figure.area())
    println(figure.perimeter())

    val m1: Movable = Car("Tesla", "3252362")
    val m2: Movable = Aircraft()
    // val m3: Movable = Movable() напрямую объект интерфейса создать нельзя

    m1.move()
    m1.stop()
    m2.move()
    m2.stop()

    val tesla: Car = Car("Tesla", "2345SDG")
    println(tesla.model)
    println(tesla.number)

    tesla.move()
    tesla.stop()
}
