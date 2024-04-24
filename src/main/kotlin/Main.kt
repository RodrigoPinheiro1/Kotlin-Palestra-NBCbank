package org.ia

import model.Banco
import model.Usuario
import org.ia.model.Financeiro

fun main() {

    val financeiro = Financeiro(null, 23.0, 23.0, 0.0)

    val banco = Banco(null, "123", "123", financeiro)

    val listBanco = mutableListOf<Banco>()
    val listBanco2 = listOf(banco) //imutavel

    listBanco.add(banco)

    financeiro.receberDebito(123.00)

//    financeiro.hashCode()
//    financeiro.equals(fin)

    val usuario = Usuario(1, "NOME", "dataNascimento", listBanco)


    listBanco.forEach {
        it.id = 1
        it.agencia = "0123"
    }

    println(usuario)














































}