package tech.ada.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(columnDefinition = "TEXT", length = 200, nullable = false)
    private String descricao;
    @Column(unique = true, nullable = false)
    private String SKU;
    @Column(nullable = false)
    private double preco;
    @Column(nullable = false)

    private int quantidadeEstoque;
}
