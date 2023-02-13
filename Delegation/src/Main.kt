fun main(args: Array<String>){

    // delegation
    val telegram = InstantMessenger("Telegram")
    val pixel = SmartPhone("Pixel 5", telegram)
    pixel.sendTextMessage()
    pixel.sendVideoMessage()
    println(pixel.programName)  // Default Messenger

    //multiple delegation
    val telegram_version2 = InstantMessengerVersion2("Telegram")
    val photoCamera = PhotoCamera()
    val pixel_version2 = SmartPhoneVersion2("Pixel 5", telegram_version2, photoCamera)
    pixel_version2.send("Hello Kotlin")
    pixel_version2.takePhoto()
}
