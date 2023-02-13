class LewisCarrollBook {

    var name = ""
        get() {
            println("The name of the book is $field")
            return field
        }
        set(value) {
            field = value
            println("Now, a book called $field")
        }

    val author = "Lewis Carroll"
        get(): String {
            println("The author of the book is $field")
            return field
        }

    var price = 0
        set(value) {
            println("Putting a new price...")
            field = value
            println("The new price is $field")
        }
}
