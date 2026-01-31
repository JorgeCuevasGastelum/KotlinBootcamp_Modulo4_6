package Quiz4_14

sealed class Spice(
    val name: String,
    val spiciness: String,
    color: SpiceColor
) : SpiceColor by color {

    abstract fun prepareSpice()
}
