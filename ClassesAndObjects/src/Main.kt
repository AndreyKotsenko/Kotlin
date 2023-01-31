fun main(args: Array<String>) {
    val alex: User = User("Andrey", "Kotsenko")

    alex.firstName = "Alexnder"
    println(alex.firstName)

    alex.login = "Codi"
    alex.login
    println(alex.login)

    alex.printUser()

    println(alex.fullname)

    val peter = User()
}