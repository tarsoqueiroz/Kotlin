package exercises

fun countVowels(phrase: String): Int {

    val VOLWES = "aeiou"
    var totalVolwes = 0

    for (letter in phrase) {
        if (letter.toLowerCase() in VOLWES) totalVolwes++
    }

    return totalVolwes
}

fun countConsonants(phrase: String): Int {

    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0

    for (letter in phrase) {
        if (letter.toLowerCase() in CONSONANTS) totalConsonants++
    }

    return totalConsonants
}