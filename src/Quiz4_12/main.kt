package Quiz4_12

fun main() {
    val spices = listOf(
        SpiceContainer(Spice("Curry", "hot")),
        SpiceContainer(Spice("Pepper", "medium")),
        SpiceContainer(Spice("Salt"))
    )

    spices.forEach {
        println(it.label)
    }
}

