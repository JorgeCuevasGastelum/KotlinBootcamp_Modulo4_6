package Quiz4_8

//clase book
open class Book(
    val title: String,
    val author: String
) {

    private var currentPage: Int = 0

    //metodo principal
    open fun readPage() {
        currentPage++
    }
}

//subclase
class eBook(
    title: String,
    author: String,
    val format: String = "text"
) : Book(title, author) {

    private var wordCount: Int = 0

    //metodo sobreescrito
    override fun readPage() {
        wordCount += 250
    }
}

//ejemplo
fun main() {

    val book = Book("Libro 1", "Jorge")
    book.readPage()
    book.readPage()

    val ebook = eBook("Libro 2", "Jorge2")
    ebook.readPage()
    ebook.readPage()

    println("paginas leidas!")
}

