package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente


fun main() {
    val reinaldo = Gerente("Reinaldo", "1234", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(reinaldo)

    TesteAutenticacao().autentica(reinaldo)
}

