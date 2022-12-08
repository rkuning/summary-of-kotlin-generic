package app

abstract class Viechle(wheel : Int)

class Truck(speed : Int) : Viechle(4)

class MotorCycle(speed : Int) : Viechle(2)

fun main() {
    val car = Truck(200)

    val motorcycle = MotorCycle(100)

    var viechle : Viechle = car

    viechle = motorcycle

    val carList = listOf(Truck(100), Truck(300))
    val viechleList = carList
}