package Quiz5_7

fun main() {
    val book = Book("Hamlet", "William Shakespeare")

    println(book.canBorrow(3))   // true
    println(book.canBorrow(5))   // false

    book.printUrl()
}
