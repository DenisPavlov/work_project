data class Human(val name:String) {
    @Synchronized fun sayHi(to: Human){
        println("$name saying hi to ${to.name}")
        Thread.sleep(500)
        to.sayHiBack(this)

    }
    @Synchronized fun sayHiBack(to: Human){
        println("$name saying hi back to ${to.name}")
    }

}
fun main() {
    val adam = Human("adam")
    val eve = Human("eve")
    val adamThread = Thread {
        adam.sayHi(eve)
    }.apply {
        start()
    }

    val eveThread = Thread {
        eve.sayHi(adam)
    }.apply {
        start()
    }
    adamThread.join()
    eveThread.join()
}