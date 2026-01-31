package Quiz4_3

//clase creada
class SimpleSpice {

    val name: String = "curry"
    val spiciness: String = "mild"

    val heat: Int
        get() = 5
}

//crear instancia de la clase
fun main() {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}")
    println("Spice heat: ${spice.heat}")
}

