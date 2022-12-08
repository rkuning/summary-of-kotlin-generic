package data

class Function(val name : String) {

//    scope generic type di function hanya berada pada function tersebut,
//    tidka bisa digunakan di lain function ataupun class di atasnya
//    jika pada class terdapat generic dengan nama yang sama dengan function, maka function akan
//    mengoverride generic type pada class diatasnya
    fun <T> sayHello(param : T) {
        println("Hello $param, my name is $name")
    }

}