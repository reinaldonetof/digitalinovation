package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF

    println("${pf.name} - ${pf.descricao}")
}