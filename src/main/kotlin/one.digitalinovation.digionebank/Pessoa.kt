package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Reinaldo"
    var cpf: String = "051.514.993-43"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val reinaldo = Pessoa()

    println(reinaldo.pessoaInfo())
}
