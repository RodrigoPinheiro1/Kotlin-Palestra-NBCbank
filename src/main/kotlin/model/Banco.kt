package model

import org.ia.model.Financeiro


data class Banco (
    var id:Long? = null, //declara que pode entrar nulo
    var agencia:String,
    var conta:String,
    var financeiro: Financeiro
) {




}