package Quiz5_5

fun main() {
    val allBooks = setOf(
        "Jorge",
        "Carlos",
        "Martin",
        "Hamlet"
    )

    val library = mapOf(
        "Jorge" to allBooks
    )

    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println("Is Hamlet in the library? $hasHamlet")

    val moreBooks = mutableMapOf(
        "Libro1" to "ejemplo"
    )

    moreBooks.getOrPut("1984") { "Jaime" }
    moreBooks.getOrPut("The Hobbit") { "Unknown Author" }

    println(moreBooks)
}
