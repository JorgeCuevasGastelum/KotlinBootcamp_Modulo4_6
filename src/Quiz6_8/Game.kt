package Quiz6_8

class Game {
    var path = mutableListOf(Directions.START)

    private val location = Location()

    val north = { location.updateLocation(Directions.NORTH); path.add(Directions.NORTH); true }
    val south = { location.updateLocation(Directions.SOUTH); path.add(Directions.SOUTH); true }
    val east  = { location.updateLocation(Directions.EAST);  path.add(Directions.EAST);  true }
    val west  = { location.updateLocation(Directions.WEST);  path.add(Directions.WEST);  true }



    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean): Boolean {
        return where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}





