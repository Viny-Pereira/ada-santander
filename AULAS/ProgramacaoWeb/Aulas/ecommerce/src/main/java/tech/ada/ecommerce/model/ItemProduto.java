package tech.ada.ecommerce.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produto produto;

    @ManyToOne
//    @JoinColumn(name = "compra_valor_produtos", referencedColumnName = "valor_produto")
    private Compra compra;

    private long quantidade;
    private double valorTotalProduto;
}
