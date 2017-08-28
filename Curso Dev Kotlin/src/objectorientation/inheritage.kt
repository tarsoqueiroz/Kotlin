package objectorientation

open class Animal(val name: String) {

    fun sayMyName() {
        println("Meu nome é $name")
    }
}

class Mammal(name: String) : Animal(name)

fun main(args: Array<String>) {
    val m1 = Mammal("Manny")
    val m2 = Mammal("Sid")

    m1.sayMyName()
    m1.name


}