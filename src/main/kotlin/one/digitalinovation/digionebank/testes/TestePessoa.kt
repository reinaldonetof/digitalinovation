package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Pessoa


fun main() {
    val reinaldo = Pessoa("Reinaldo", "123456")

    println(reinaldo.cpf + ' ' + reinaldo.nome)
}