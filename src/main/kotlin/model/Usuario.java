package model;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Usuario { //classe java suja com muita verbosidade

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

    public Integer somaUsuario(int i, int i2) {

        return i + i2;
    }


}
