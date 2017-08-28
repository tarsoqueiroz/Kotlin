package basic

fun main(args: Array<String>) {

    var x = 1

    println("for simples")
    for (x in 1..10) {
        println(x)
    }
    println("for down")
    for (x in 10 downTo 1) {
        println(x)
    }
    println("for step")
    for (x in 10 downTo 1 step 2) {
        println(x)
    }

    println("while simples")
    x = 1
    while (x < 5) {
        println(x)
        x++
    }
}