package Quiz4_12

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}
