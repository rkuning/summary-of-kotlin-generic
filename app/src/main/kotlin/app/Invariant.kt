package app

class Invariant<T>(val data: T) {
}

fun main() {
//    invarian artinya, tidak bisa di subtitute ke parent atau child
    val invarString = Invariant("String")
//    val invarAny = Invariant<Any> = invarString //error, tidak bisa seperti polymorphysm
}