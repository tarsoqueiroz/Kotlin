package nullSafe

fun main(args: Array<String>) {

    val str: String? = null

    println(str?.length)
}