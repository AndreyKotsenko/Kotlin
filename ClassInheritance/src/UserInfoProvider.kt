interface UserInfoProvider {
    val info: String

    fun printInfo(user: User) {
        println(info)
        user.printUser()
    }
}

interface DbConnection {
    fun getConnection(): String
}

open class MainProvider: UserInfoProvider, DbConnection {
    protected open val db: String = "DB Conected"

    override val info: String
        get() = "Method"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Code")
    }

    override fun getConnection(): String {
        return db
    }

    final fun printName(name: String) {
        println(name)
    }
}