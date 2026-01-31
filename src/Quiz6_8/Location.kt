package Quiz6_8

import kotlin.math.absoluteValue

class Location(val width: Int = 4, val height: Int = 4) {

    private val map = Array(width) { arrayOfNulls<String>(height) }
    private var x = 0
    private var y = 0

    init {
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "You are at location ($i, $j)"
            }
        }
    }

    fun updateLocation(direction: Directions) {
        when (direction) {
            Directions.NORTH -> y = (y - 1).absoluteValue % height
            Directions.SOUTH -> y = (y + 1) % height
            Directions.EAST  -> x = (x + 1) % width
            Directions.WEST  -> x = (x - 1).absoluteValue % width
            else -> {}
        }
        println(map[x][y])
    }
}

