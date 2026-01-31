package Quiz5_11.Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T : BaseBuildingMaterial>(
    private val material: T
){
    val baseMaterialsNeeded = 100

    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        val materialName = material::class.simpleName
        println("$actualMaterialsNeeded $materialName required")
    }

}





