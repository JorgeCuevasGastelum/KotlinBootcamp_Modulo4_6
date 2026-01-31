package Quiz5_9

import kotlin.random.Random

class Puppy {

    fun playWithBook(book: Book) {
        val torn = Random.nextInt(1, 10)
        println("🐾 Puppy tore $torn pages!")
        book.tornPages(torn)
    }
}
