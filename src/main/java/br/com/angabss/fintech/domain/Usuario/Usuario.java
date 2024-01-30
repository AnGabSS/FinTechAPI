package br.com.angabss.fintech.domain.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "usarios")
@Entity(name = "Usario")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String senha;
    private boolean ativo;

    public Usuario(DadosCadastroUsuario dados){
        this.nome = nome;
        this.senha = senha;
        this.ativo = true;
    }
}
