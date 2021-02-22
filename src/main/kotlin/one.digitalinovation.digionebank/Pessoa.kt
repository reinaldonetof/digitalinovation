package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Reinaldo"

    var cpf: String = "051.514.993-43"
    private set
}

fun main() {
    val reinaldo = Pessoa()

    println(reinaldo.nome)
    println(reinaldo.cpf)
}
