package tech.ada.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nomeCompleto;
    @Column(nullable = false)
    private Date dataNascimento;
    @Column(unique = true, nullable = false)
    private String CPF;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private boolean ativo;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Compra> compras;

    public Cliente(Long id, String nomeCompleto, Date dataNascimento, String cpf, String email, String senha, boolean ativo) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.CPF = cpf;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Cliente(String nomeCompleto, Date dataNascimento, String cpf, String email, String senha, boolean ativo) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.CPF = cpf;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }
}
