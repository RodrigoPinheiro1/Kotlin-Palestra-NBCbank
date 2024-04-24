package org.ia

import model.Banco
import model.Usuario
import org.ia.model.Financeiro
import java.util.*
import java.util.function.Consumer

fun main() {
    val financeiro = Financeiro(null, 23.0, 23.0, 0.0)

    val banco = Banco(null, "123", "123", financeiro)


    /// tipo de listas
    val listBanco = mutableListOf(banco)
    val listBanco2 = listOf(banco)


    listBanco.add(banco)
    //listBanco2.add(banco)

    financeiro.receberDebito(123.00)

    val usuario = Usuario(1L, "NOME", "dataNascimento", listBanco)

    listBanco.forEach {
        it.agencia = "agenciaAtualizada"
        it.conta = "ContaAtualizada"
    }

    val soma = usuario.somaUsuario(23, 23) //usando metodo do java

    println(soma)

    println(usuario)

} //