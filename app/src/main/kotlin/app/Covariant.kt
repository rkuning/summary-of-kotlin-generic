package app

//covarian, nilai dari tipe parameter hanya dapat dipakai untuk return type saja
class Covariant<out T>(val data : T) {

    fun sayHello() : T {
        return data
    }

}

fun main() {
    val covString = Covariant<String>("Danang")
    val covAny : Covariant<Any> = covString

    println(covAny.data)
}