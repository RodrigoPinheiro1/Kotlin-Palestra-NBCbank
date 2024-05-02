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
        List<Banco> listBanco = new ArrayList<>();
        List<Banco> listBanco2 = new LinkedList<>(); //varios tipos no java

        listBanco.add(banco);

        financeiro.receberDebito(123.00); //metodo kotlin no java, funcionando

        Usuario usuario = new Usuario(1L, "NOME", "dataNascimento", listBanco);

        listBanco.forEach(banco1 -> {
            banco1.setAgencia("agenciaAtualizada");
            banco1.setConta("ContaAtualizada");
        });

        int soma = usuario.somaUsuario(23, 23);  //usando metodo do java

        System.out.println(soma);

        System.out.println(usuario);
    }
} // Copie esse codigo para outra main que esta em kotlin e vai funcionar
