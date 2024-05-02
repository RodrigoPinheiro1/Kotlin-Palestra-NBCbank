package org.ia

import model.Banco
import model.Usuario
import org.ia.model.Financeiro
import java.util.function.Consumer

fun main() {

    val financeiro = Financeiro(null, 23.0, 23.0, 0.0)

    val banco = Banco(null, "123", "123", financeiro)


    /// tipo de listas
    val listBanco: MutableList<Banco> = ArrayList()

    val listOf = listOf(banco)   //apenas dois tipos

    listBanco.add(banco)

    financeiro.receberDebito(123.00)

    val usuario = Usuario(1L, "NOME", "dataNascimento", listBanco)

    listBanco.forEach(Consumer { banco1: Banco ->
        banco1.agencia = "agenciaAtualizada"
        banco1.conta = "ContaAtualizada"
    })

    val soma = usuario.somaUsuario(23, 23) //usando metodo do java no kotlin, ambos funcionam

    println(soma)

    println(usuario)

}