fun main() {
    var Virgy=classCurrentAccount("12345","Stensil",20000)
    println(Virgy.deposit(5000.0))
    println(Virgy.withdraw(1000.0))
    println(Virgy.details())
    getEven("banana")


}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z
open class classCurrentAccount(var accountNumber:String, var accountName:String,var Balance:Int){
    fun deposit(amount:Double){
        var currentBalance=amount+Balance
    }
     open fun withdraw(amount: Double){
        var decrementBalance=Balance-amount
    }
    fun details(){
        var statement=("Account number$accountNumber with balance with $Balance is operated by $accountName")
    }
}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
open class CurrentAccount(var accountName:String,var accountNumber:String,var balance:Int ){
    fun deposit(amount: Double){
        var newBalance= amount+balance
        println(newBalance)
    }
    fun withdraw(amount: Double){
        var decresedAmount= balance-amount
        println(decresedAmount)

}
}






//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn
fun getEven(chars:String):String{
var y=chars.indices
    chars.forEach { chars->
        if ((chars.indices % 2) == 0)
            println(chars)




}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category




data class product(var name:String,var weight:Int,var price:Int,var category:String)

fun evenIndices(word:String):String{
    var word= "banana"
    word.indices
    return word


}

