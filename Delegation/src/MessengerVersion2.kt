interface MessengerVersion2{
    fun send(message: String)
}
class InstantMessengerVersion2(val programName: String) : MessengerVersion2{
    override fun send(message: String) = println("Send message: `$message`")
}
interface PhotoDevice{
    fun takePhoto()
}
class PhotoCamera: PhotoDevice{
    override fun takePhoto() = println("Take a photo")
}
class SmartPhoneVersion2(val name: String, m: MessengerVersion2, p: PhotoDevice)
    : MessengerVersion2 by  m, PhotoDevice by p