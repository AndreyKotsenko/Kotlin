class Person {
    class Account(val username: String, val password: String){

        fun showDetails(){
            println("Username: $username Password: $password")
        }
    }
}

class Person2(username: String, password: String) {

    private class Account(val username: String, val password: String)

    private val account: Account = Account(username, password)

    fun showAccountDetails(){
        println("UserName: ${account.username}  Password: ${account.password}")
    }
}

