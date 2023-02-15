class Person<T>(val id: T, val name: String) {
    fun checkId(_id: T){
        if(id == _id) {
            println("The same")
        } else {
            println("Different")
        }
    }
}

class Word<K, V>(val source: K, var target: V)