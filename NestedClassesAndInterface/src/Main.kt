fun main(args: Array<String>){
    // nested class
    val userAcc = Person.Account("qwerty", "123456")
    userAcc.showDetails()

    // nested private class
    val tom = Person2("qwerty", "12345")
    tom.showAccountDetails()

    // inner class - need for access to vars and methods in external class
    val acc = BankAccount(3400)
    acc.Transaction(2500).pay()
}