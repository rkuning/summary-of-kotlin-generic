package app

import data.Fruit

fun main() {
    val fruit1 = Fruit("Aple", 10)
    val fruit2 = Fruit("Naga", 4)

    println(fruit1 > fruit2)
    println(fruit1 < fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 <= fruit2)
    println(fruit1 == fruit2)
}