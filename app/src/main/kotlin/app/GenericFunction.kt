package app

import data.Function
import kotlin.collections.List

fun main() {
    val function = Function("Dannag")

    function.sayHello("Danang")
    function.sayHello<Int>(10)
    function.sayHello<Boolean>(true)
}

