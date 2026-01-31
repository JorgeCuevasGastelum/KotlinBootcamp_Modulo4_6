package Quiz5_7
const val MAX_BORROWED_BOOKS = 5

class Book(val title: String, val author: String) {

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
