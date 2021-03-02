package one.digitalinovation.digionebank

data class Banco(
    val name: String,
    val number: Int
) {
    fun info() = "$name - $number"
}
