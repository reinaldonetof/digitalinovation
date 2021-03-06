package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(name = "DigiOne", number = 12)

    println(digiOneBank.name)
    println(digiOneBank.number)
    println(digiOneBank.info())
}
