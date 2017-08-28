package moreFunctions

fun writeAddress(street: String, city: String = "BR", state: String, cep: String = "00000-000", number: Int = 0) {

    println("--------------")
    println("Rua: $street, nº $number")
    println("Cidade: $city, $state - $cep")
}

fun <T> manyParameters(vararg name: T) {

    println("\nExistem ${name.size} parâmetros")

//    for (x in name) {
//        if (x is Int) {
//
//        }
//    }

}

fun main(args: Array<String>) {

    writeAddress("Rua do Kotlin", "São Paulo", "SP", "82200-000", 1234)
    writeAddress(street = "Rua do Kotlin", city = "São Paulo", state = "SP", cep = "82200-000", number = 1234)
    writeAddress(street = "Rua do Kotlin", number = 1234, cep = "82200-000", city = "São Paulo", state = "SP")

    writeAddress("Rua do Kotlin", state = "SP")

    manyParameters ("Parm1", 2, "Parm3", "Parm4", 5)
}