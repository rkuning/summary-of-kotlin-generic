package app


//nilai tipe parameter untuk kontravarian hanya dapat digunakan untuk tipe parameter, tidak boleh dipakai untuk return type
class Contravariant<in T> {

    fun sayHello(param : T) {
        println("HEllo $param")
    }

}

fun main() {
    val data1 = Contravariant<Any>()
    val data2 : Contravariant<String> = data1

    data2.sayHello("Danang")
}