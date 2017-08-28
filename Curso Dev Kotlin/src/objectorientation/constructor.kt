package objectorientation

class PrivateClient private constructor() {

    // MÉTODOS ESTÁTICOS
}

class Client(val name: String) {
    constructor(n: String, age: Int) : this(n)

}

fun main(args: Array<String>) {
    val c1 = Client("Gabriel")
    val c2 = Client("Gabriel", 26)
}