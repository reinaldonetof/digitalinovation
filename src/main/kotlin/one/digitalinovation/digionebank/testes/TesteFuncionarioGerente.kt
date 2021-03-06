package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente


fun main() {
    val reinaldo = Gerente("Reinaldo", "1234", 5000.0)
    ImprimeRelatorioFuncionario.imprime(reinaldo)
}

