package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Funcionario
import one.digitalinovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val reinaldo = Pessoa("Reinaldo", "123456")

    println(reinaldo.cpf + ' ' + reinaldo.nome)

    val joao = Funcionario("Joao", "123", BigDecimal.valueOf(2000.0))

    println("${joao.nome}-${joao.cpf}: ${joao.salario}")
}