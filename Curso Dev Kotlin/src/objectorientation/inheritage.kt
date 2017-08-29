package objectorientation

abstract class Animal(val name: String) {

    open fun sayMyName() {
        println("Meu nome é $name")
    }

    abstract fun talk()
}

open class Mammal(name: String, var age: Int) : Animal(name) {
    override fun talk() {
        println("Oi sou um mamífero")
    }

    override fun sayMyName() {
        super.sayMyName()
        println("Eu tenho $age anos!")
    }

    fun sayMayName(age: Int) {
        println("Eu tenho agora $age anos!!!!!!!!!!")
    }


}

class Dog : Mammal ("Bolt", 3) {

    override fun talk() {
        super.talk()
    }
}

fun main(args: Array<String>) {

    val m1 = Mammal("Manny", 100)
    val m2 = Mammal("Sid",40)

    m1.sayMyName()
    m1.name
    m2.sayMyName()
    m1.sayMayName(1234)


}