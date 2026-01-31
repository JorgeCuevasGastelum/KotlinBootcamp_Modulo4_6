package Quiz5_9
const val MAX_BORROWED_BOOKS = 5

class Book(
    val title: String,
    val author: String,
    var pages: Int
){

    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        println("${BASE_URL}$title.html")
    }

    companion object {
        const val BASE_URL = "https://library.example.com/books/"
    }
}

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) {
    pages = (pages - torn).coerceAtLeast(0)
}


