package org.ia.model


data class Financeiro( //data class traz metodos

    var id: Long? = null,
    var saldoCredito: Double,
    var saldoDebito: Double,
    var valorImprestimo: Double
) {
    //protected
     fun  receberDebito(dinheiro: Double): Double {
        this.saldoDebito += dinheiro
        return this.saldoDebito
    }
}