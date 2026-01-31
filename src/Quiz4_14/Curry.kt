package Quiz4_14

class Curry(
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice("Curry", spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding curry into powder")
    }
}
