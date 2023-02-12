class BankAccount(private var sum: Int) {

    fun display(){
        println("sum = $sum")
    }

    inner class Transaction(private var sum: Int){
        fun pay(){
            this@BankAccount.sum -= this@Transaction.sum
            display()
        }
    }
}