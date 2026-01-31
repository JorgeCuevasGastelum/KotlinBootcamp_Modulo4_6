package Quiz5_9

fun main() {
    val book = Book(
        title = "Hamlet",
        author = "Jorge",
        pages = 100
    )

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("📖 Pages left: ${book.pages}")
        println("⚖️ Weight: ${book.weight()} grams\n")
    }

    println("ya no hay paginas!")
}
