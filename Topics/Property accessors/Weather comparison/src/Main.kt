const val MAX_TEMPERATURE = 57
const val MIN_TEMPERATURE = -92

data class City(val name: String) {

    var degrees: Int = CityAverageTemperature.valueOf(name).averageTemperature
        set(value) {
            field = if (value in MIN_TEMPERATURE..MAX_TEMPERATURE) {
                value
            } else {
                CityAverageTemperature.valueOf(name).averageTemperature
            }

        }
}

fun main() {

    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    val cities = mutableListOf(firstCity, secondCity, thirdCity)
    val min = cities.minOf { a -> a.degrees }
    var name: String = thirdCity.name
    val it = cities.iterator()
    while (it.hasNext()) {
        val city = it.next()
        if (city.degrees == min) {
            name = city.name
            it.remove()
        }
    }

    print(
        if (cities.size < 2) {
            "neither"
        } else {
            name
        }
    )
}

@SuppressWarnings("MagicNumber")
enum class CityAverageTemperature(val averageTemperature: Int) {

    Dubai(30),
    Moscow(5),
    Hanoi(20)

}