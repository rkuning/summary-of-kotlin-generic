package app



fun main() {
    launch {
        delay (1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}