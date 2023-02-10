const val BASE_PRICE = 20000
const val DEFAULT_SPEED = 120
const val DECREASE_DUE_TO_AGE = 2000
const val DECREASE_DUE_TO_MILEAGE = 200
const val MIN_MILEAGE_CHANGE = 10000
const val INCREASE_DUE_TO_SPEED = 100
const val AUTOMATIC_GEAR = 1500

fun carPrice(
    old: Int = 5,
    kilometers: Int = 100000,
    maximumSpeed: Int = 120,
    automatic: Boolean = false,
) {
    print(
        BASE_PRICE - old * DECREASE_DUE_TO_AGE +
            (maximumSpeed - DEFAULT_SPEED) * INCREASE_DUE_TO_SPEED -
            kilometers / MIN_MILEAGE_CHANGE * DECREASE_DUE_TO_MILEAGE +
            if (automatic) {
                AUTOMATIC_GEAR
            } else {
                0
            }
    )
}
