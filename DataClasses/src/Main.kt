class Some {
    companion object { // thi is like static in Java
        var count = 0
    }

    init {
        count++
        println("Maked objects: $count")
    }
}
fun main(args: Array<String>) {
    val test = Some()
    val test_2 = Some()
    val test_3 = Some()
    val test_4 = Some()

    println(Some.count)

    val db = Db.MongoDb(5, "mongo")
    val db_2 = Db.PostgresSQL(5, "postgres", true)

    val db_copy = db.copy(conn = "Done")
    if(db == db_copy)
        println("Equal")
    else
        println("Not equal")

    if(db is Db.MongoDb) {
        db.printInfo()
    }

    val db_room = Room()

    if( db_room is Db){
        println("Room is Db")
    }

    ////////////////////
    ///Data classes////
    ///////////////////

    val alice: Person = Person("Alice", 24)
    println(alice.toString())

    val nik: DataPerson = DataPerson("Nik", 24)
    val kate = nik.copy(name = "Kate")
    println(nik.toString())   // Person(name=Nik, age=24)
    println(kate.toString())    // Person(name=Kate, age=24)

    val (username, usserage) = kate
    println("Name: $username  Age: $usserage") // Name: Nik  Age: 24

}

class Person(val name: String, val age: Int)

// have functions: equals(), hashCode(), toString(), copy() - we can override their
data class DataPerson(val name: String, val age: Int){
    override fun toString(): String {
        return "Name: $name  Age: $age"
    }
}