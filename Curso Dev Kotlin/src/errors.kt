package basic

fun main(args: Array<String>) {

    try {
        "String".toInt()
    } catch (e: NullPointerException) {
        println("NULL Point Exception!!!")
    } catch (e: NumberFormatException) {
        println("Não é um número!!!")
    } catch (e: Exception) {
        println("Não sei o que houve de errado!!!")
    } finally {
        println("Finalmente")
    }


}