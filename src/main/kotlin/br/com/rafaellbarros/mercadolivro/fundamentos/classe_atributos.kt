package br.com.rafaellbarros.mercadolivro.fundamentos

/**
 * created by:
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 03/04/2022
 */

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Vermelho", 2022, Dono("Rafael", 33))
    println(carro.cor)

    carro.cor ="Preto"

    println(carro.cor)

    println(carro.dono.nome)

    carro.dono.nome = "Xablau"

    println(carro.dono)

}