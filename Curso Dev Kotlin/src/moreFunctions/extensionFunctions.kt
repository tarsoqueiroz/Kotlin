package moreFunctions

class Person() {

    fun speak() {
        println("Estou falando!!!")
    }
}

fun main(args: Array<String>) {

    val person: Person = Person()

    person.speak()

//    fun Person.walk() {
//        println("Estou andando!!!")
//    }
//    person.walk()

    fun String.firstLetter(): Char {

        return this[0]
    }

    println("A primeira letra é um A".firstLetter())
}