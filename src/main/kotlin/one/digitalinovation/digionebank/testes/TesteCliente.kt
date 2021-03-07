package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Cliente
import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose",
        cpf = "123.431",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}