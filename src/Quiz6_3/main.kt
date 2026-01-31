package Quiz6_3

fun main() {
    val game = Game()

    println(game.path)

    game.north()
    game.south()
    game.east()
    game.west()
    game.end()

    println(game.path)
}
