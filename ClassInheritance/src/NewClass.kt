class NewClass : MainProvider() {

    override val db: String
        get() = "DB not connected"

    override val info: String
        get() = "new method"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Text from class NewClass")
    }

    //override fun printName(){}  // can't override 'cause it final method in MainProvider class
}