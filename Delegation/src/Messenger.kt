interface Messenger{
    fun sendTextMessage()
    fun sendVideoMessage()

    val programName: String
}

class InstantMessenger(override val programName: String) : Messenger{
    override fun sendTextMessage() = println("Send text message")
    override fun sendVideoMessage() = println("Send video message")
}

class SmartPhone(val name: String, m: Messenger): Messenger by m{
    override fun sendTextMessage() = println("Send sms")
}