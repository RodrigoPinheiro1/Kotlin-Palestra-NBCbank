package model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.Pattern;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Usuario {

    private Long id;

    private String nome;

    private String dataNascimento;


    private List<Banco> bancoUsuario = new ArrayList<>();


    public Usuario(Long id, String nome, String dataNascimento, List<Banco> bancoUsuario) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bancoUsuario = bancoUsuario;
    }
}
