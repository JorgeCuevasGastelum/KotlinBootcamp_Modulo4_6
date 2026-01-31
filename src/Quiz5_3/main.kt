package Quiz5_3

fun main() {
    val book = Book(
        title = "Libro1",
        author = "Jorge Cuevas",
        year = 2026
    )

    //pair
    val (title, author) = book.getTitleAuthor()

    //triple
    val (t, a, y) = book.getTitleAuthorYear()

    println("Here is your book $t written by $a in $y.")
}


