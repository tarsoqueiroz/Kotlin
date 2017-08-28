package objectorientation

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {

    val p1 = Person("Tarso Queiroz", 50)
    val p2 = Person("Tarso Queiroz", 50)
    val p3 = p1

    println(p1)
    println(p1.equals(p2))
    println(p3.equals(p1))

}