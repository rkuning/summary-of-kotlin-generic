package app

interface CanSayHello {

    fun sayHello (name : String)

}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, im Vice President")
    }
}

//kode dibawah adalah menggenerate data parameter Company hanya child dari class Employee yaitu Manager, VicePresident dan Employee itu sendiri

// fungsi where adalah jika parameter itu harus berasal lebih dari 1 class atau interface
//kode dibawha artinya, parameter yang bisa diinput oleh user adalah parameeter yang merupakan turunan dari Class Employee
//dan juga interface CanSayHello
class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
    val data2 = Company(VicePresident())
//    val data1 = Company(Manager()) // error, karena Manager() bukan merupakan turunan dari CanSayHello. dia hanya turunan dari employee
//    val data3 = Company(Employee()) // error, karena bukan merupakan turunan dari CanSayHello. dia hanya turunan dari employee

    val number = ListNumber<Int>()
//    val number2 = ListNumber<String>() // error

}


//fungsi dibawah ini adalah generic type hanya untuk inputan number, selain number bakal error
class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}