package app

class TypeErasure<T>(param : T) {
    private val data : T = param
    fun getData() : T = data
}

fun main() {
    val data = TypeErasure<String>("Danang")
    val dataString : String = data.getData()
    println(dataString)

    val data2 : TypeErasure<Int> = data as TypeErasure<Int>
    val dataInt = data2.getData()
    println(dataInt)

}