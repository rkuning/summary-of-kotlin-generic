package data

class User<T, U>(val name : T, val address : U) {
    fun printData() {
        return println("Data is $name, address : $address")
    }
    fun getDataName() : T = name
    fun getDataAddress() : U = address
}