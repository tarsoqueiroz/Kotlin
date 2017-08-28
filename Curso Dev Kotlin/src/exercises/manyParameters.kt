package exercises

fun sumAllParameters (vararg values: Int) = values.sum()


fun <T> sumAllGenericParameters (vararg values: T) : Double {

    var soma: Double = 0.0

    for (value in values) {
        if (value is Int) {
            soma += value
        } else if (value is Double) {
            soma += value
        }
    }

    return soma + 0.01
}