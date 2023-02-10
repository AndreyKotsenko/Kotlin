//import email.* // if we want import all from this package

import email.Message as sendEmail
import email.send as sendMessage

fun main(args: Array<String>){
    val myMessage = sendEmail("Hello Kotlin")
    sendMessage(myMessage, "example@gmail.com")
}