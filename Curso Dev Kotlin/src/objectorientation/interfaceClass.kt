package objectorientation

abstract class abs1 {

    val id: Int = 10

    fun hello() {
        println("Olá")
    }

}

interface interface1 {

    val id: Int
        get() {
            return 10
        }

    fun hello() {
        println("Olá1")
    }

    fun mustOverride()

}

interface interface2 {

    val id: Int
        get() {
            return 10
        }

    fun hello() {
        println("Olá2")
    }

}

class implementsInterfaceA : interface1  {
    override fun mustOverride() {


    }

}

class implementsInterface12 : interface1, interface2 {
    override val id: Int
        get() = 12

    override fun mustOverride() {
        println("mustoverride12")
    }

    override fun hello() {
        super<interface1>.hello()
    }
}


fun main(args: Array<String>) {

    val a1: implementsInterfaceA = implementsInterfaceA()

    println(a1.id)
    a1.hello()

    val a12: implementsInterface12 = implementsInterface12()
    a12.hello()

}