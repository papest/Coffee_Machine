fun main() {
    val (country1, country2) = readln().split(" ")
    println(
        isCountry(country1) && isCountry(country2) &&
            Country.valueOf(country1).currency == Country.valueOf(country2).currency
    )

}

enum class Country(val currency: String) {

    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar")

}

fun isCountry(check: String): Boolean {
    for (country in Country.values()) {
        if (country.name == check) {
            return true
        }
    }
    return false
}