fun main(args: Array<String>) {

    /*
    ######################
    #    Array section   #
    ######################
     */

    var items_via_method: Array<Int> = arrayOf(5, 7, 12, 4, 0, 1)
    var i = 1
    var items_via_constructor: Array<Int> = Array(10, { i++ * 2})

    println("Print array created via constructor:")
    for(el in items_via_constructor) {
        println(el)
    }

    println("Print array created via constructor and using indices:")
    for(i in items_via_constructor.indices) {
        println(items_via_constructor[i])
    }

    println(items_via_method[0])
    println(items_via_method.get(1))
    println(items_via_method.size)
    println(items_via_method.set(0, 45))

    println("Check element: ")
    println(4 in items_via_constructor)
    println(3 in items_via_constructor)

    println("\nPrint array via loop for:")
    for(el in items_via_method) {
        println(el)
    }

    println("\nPrint array via for-each:")
    items_via_method.forEach { el ->
        println(el)
    }

    println("\nPrint array via loop for-each with index")
    items_via_method.forEachIndexed() { index, el ->
        println("$el with index $index")
    }

    val table: Array<Array<Int>> = Array(3, {Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    println("\nPrint array: ")
    for( row in table) {
        for(cell in row) {
            print("$cell \t")
        }
        println()
    }

    var first = arrayOf(1, 2, 3)
    var second = arrayOf(4, 5, 6)
    var third = first + second
    third += 7

    println("\n Result of sum: ")
    third.forEach { el -> println("$el") }

    /*
    ############################
    #   End of array section.  #
    ############################
     */


    /*
    #########################
    #      List section     #
    #########################
     */

    // work with list
    var list_items: List<Int> = listOf(5, 7, 12, 1, 4, 0, 1)

    println("\nPrint last index of 1: ")
    println(list_items.lastIndexOf(1))

    // work with mutable list
    var mutable_list_items = mutableListOf<Any>(5, 7, 12, 1, 4, 0, 1)

    mutable_list_items.add("Dogs")
    mutable_list_items.addAll(4, list_items)

    println("\nPrint mutable list via loop for-each with index:")
    mutable_list_items.forEachIndexed() { key, value ->
        println("$key - $value")
    }

    /*
    ############################
    #    End of list section.  #
    ############################
     */


    /*
    #####################
    #    Set section.   #
    #####################
     */

    var numbers = setOf(5, 6, 7, 6, 6, 7, 5)

    println("\nPrint set: ")
    numbers.forEach{ el -> println("$el")}

    val people = setOf("Tom", "Sam", "Bob", "Mike")
    val employees = setOf("Tom", "Sam", "Kate", "Alice")

    val all = people.union(employees)
    val common = people.intersect(employees)
    val different = people.subtract(employees)

    println(all)        // [Tom, Sam, Bob, Mike, Kate, Alice]
    println(common)     // [Tom, Sam]
    println(different)  // [Bob, Mike]

    val all_ex = people union employees
    val common_ex = people intersect employees
    val different_ex = people subtract employees

    println(all_ex)        // [Tom, Sam, Bob, Mike, Kate, Alice]
    println(common_ex)     // [Tom, Sam]
    println(different_ex)  // [Bob, Mike]

    val numbers_mutable: MutableSet<Int> = mutableSetOf(35, 36, 37)

    println(numbers_mutable.add(2))
    println(numbers_mutable.addAll(setOf(4, 5, 6)))
    println(numbers_mutable.remove(36))

    for (n in numbers){ println(n) }    // 35 37 2 4 5 6
    numbers_mutable.clear()

    /*
    ############################
    #    End of set section.   #
    ############################
     */


    /*
    #####################
    #    Map section.   #
    #####################
     */

    // work with map
    val map_of_people = mapOf(1 to "Tom", 5 to "Sam", 8 to "Bob")
    for(person in map_of_people){
        println("${person.key} - ${person.value}")
    }
    println(map_of_people)     // {1=Tom, 5=Sam, 8=Bob}
    println(map_of_people.get(8)) // Bob
    println(map_of_people[5]) // Sam
    println(map_of_people[50]) // null
    println(map_of_people.getOrDefault(70, "default")) // "default"
    println(map_of_people.getOrElse(70){"Not Found"}) // "Not Found"

    println(map_of_people.values)
    println(map_of_people.keys)

    // work with mutable map
    var mutable_map_items = mutableMapOf<String, Any>("name" to "Bob", "age" to 1, "isHasCar" to true)

    // add data
    mutable_map_items.put("city", true)

    // change data
    mutable_map_items.set("city", 10)
    mutable_map_items["city"] = 15

    // remove data
    mutable_map_items.remove("isHasCar")

    // for-each for map
    println("\nPrint map via loop for-each")
    mutable_map_items.forEach {key, value -> println ("$key - $value")}


    /*
    ###########################
    #    End of map section.  #
    ###########################
     */


    /*
    ##########################
    #    Sequence section.   #
    ##########################
     */

    val sequence_people = sequenceOf("Tom", "Sam", "Bob")
    println(sequence_people.joinToString())  // Tom, Sam, Bob

    val sequence_employees = listOf("Tom", "Sam", "Bob") // объект List<String>
    val sequence_emplo = sequence_employees.asSequence()         //тип Sequence<String>
    println(sequence_emplo.joinToString())    // Tom, Sam, Bob

    var number = 0
    val suquece_numbers = generateSequence{ number += 2; number}
    println(suquece_numbers.take(5).joinToString())    //  2, 4, 6, 8, 10

    val yield_numbers = sequence {
        yield(1)
        yield(4)
        yield(7)
    }
    println(yield_numbers.joinToString())    // 1, 4, 7

    val infinity = sequence {
        var start = 0
        while(true) yield(start++)
    }
    println(infinity.take(5).joinToString())    // 0, 1, 2, 3, 4

    val personal = sequence {
        val data = listOf("Alice", "Kate", "Ann")
        yieldAll(data)
    }
    println(personal.joinToString())    // Alice, Kate, Ann

    /*
    ################################
    #    End of sequence section.  #
    ################################
     */

}

