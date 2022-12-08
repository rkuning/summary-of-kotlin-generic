package app

import data.User

fun main() {
//    cara deklarasi 1
    val user : User<String, String> = User<String, String>("Danang","Boyolali")
    println(user.getDataName())
    println(user.getDataAddress())

//    cara deklarasi 2
    val user2 = User("Danang",123)
    println(user2.getDataName())
    println(user2.getDataAddress())


    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

interface List<P>{
    operator fun get(index : Int) : P
}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}