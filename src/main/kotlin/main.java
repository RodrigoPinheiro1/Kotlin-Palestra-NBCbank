import model.Banco;
import model.Usuario;
import org.ia.model.Financeiro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {


        Financeiro financeiro = new Financeiro(null, 23.0, 23.0, 0.0);

        Banco banco = new Banco(null, "123", "123", financeiro);

        /// tipo de listas
        List<Banco> listBanco = new LinkedList<>();

        listBanco.add(banco);

        financeiro.receberDebito(123.00);

        Usuario usuario = new Usuario(1L, "NOME", "dataNascimento", listBanco);

        listBanco.forEach(banco1 -> {
            banco1.setAgencia("agenciaAtualizada");
            banco1.setConta("ContaAtualizada");
        });

        int soma = usuario.somaUsuario(23, 23);  //usando metodo do java

        System.out.println(soma);

        System.out.println(usuario);
    } // COPIAR CODIGO E PASSAR PARA KOTLIN
}
