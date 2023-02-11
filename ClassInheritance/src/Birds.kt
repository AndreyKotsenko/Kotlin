abstract class Birds{
    var isFly = true
    abstract var age: Int

    abstract fun sound()
}

class Sparrow : Birds() {

    override var age: Int = 10
        get() = age
        set(value) {
            field = value
        }

    override fun sound() {
        println("Sparrow: ccc ccc ccc")
    }

}