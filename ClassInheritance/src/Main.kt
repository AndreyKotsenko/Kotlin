enum class Animals {
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main(args: Array<String>) {
    val user = NewClass()

    //user.db - haven't access because var is protected

    checkDataTypes(user)

    val user_2 = object : MainProvider() {
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("New class in main fun")
        }
    }

    checkDataTypes(user_2)

    val animal = Animals.BEAR

    when(animal) {
        Animals.CAT -> println("CAT")
        Animals.BEAR -> println(animal.toLowerCase())
        else -> println("Something else")
    }

    var sparrow: Birds = Sparrow()
    sparrow.sound()
    println("Fly: ${sparrow.isFly}")
}

fun checkDataTypes(obj: UserInfoProvider) {
    if(obj is UserInfoProvider) {
        obj.printInfo(User())
    }

    if(obj is DbConnection) {
        println(obj.getConnection())
    }
}