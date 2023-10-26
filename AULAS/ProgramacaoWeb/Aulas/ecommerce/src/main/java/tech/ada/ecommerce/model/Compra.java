package tech.ada.ecommerce.model;

import jakarta.persistence.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import tech.ada.ecommerce.model.enums.StatusEnum;

import java.util.Date;
import java.util.List;

@Entity
public class Compra {
    @OneToMany
//    @OneToMany(fetch = FetchType.LAZY)
    List<ItemProduto> itens;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Cliente Client;
    private Date dataCompra;
    private double valorProdutos;
    private double valorFrete;
    private double valorTotal;

    @Enumerated(value = EnumType.STRING)
    private StatusEnum status;

}
