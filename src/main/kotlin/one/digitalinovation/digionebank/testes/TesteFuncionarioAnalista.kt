package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Analista


fun main() {
    val joao = Analista("Joao", "123", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}