package br.com.rafaellbarros.mercadolivro.fundamentos

/**
 * created by:
 * @author rafael barros for DevDusCorre <rafaelbarros.softwareengineer@gmail.com> on 03/04/2022
 */

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}

fun main() {

    var rafael = Pessoa("Rafael", 33)
    println(rafael)

}