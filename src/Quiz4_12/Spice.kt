package Quiz4_12
//clase personalizada
class Spice(
    val name: String,
    val spiciness: String = "mild"
) {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }
    //Constructor
    init {
        println("Spice created: $name, spiciness: $spiciness, heat: $heat")
    }

}

//funcion que crea objeto de la clase
fun makeSalt() = Spice("salt", "not spicy")

fun main() {

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "very spicy"),
        Spice("green curry", "medium")
    )
    //filtrar los spices segun su heat
    val mildSpices = spices.filter { it.heat <= 5 }

    //imprimir los resultados de el filtro
    println("\nMild or less spicy spices:")
    mildSpices.forEach { println(it.name) }

    //creacion de objeto
    val salt = makeSalt()
}


