package OOP.AULA4.src.EXERCICIO.entity;

import java.util.List;

public class Pedido {

    private static int ultimoPedido = 0;
    private Integer identifcadorPedido;
    private Restaurante restaurante;
    private List<Pratos> pratos;
    private String enderecoEntrega;

    public Pedido(int identificadorPedido, Restaurante restaurante, List<Pratos> pratos, String enderecoEntrega) {
        this.identifcadorPedido = identificadorPedido;
        this.restaurante = restaurante;
        this.pratos = pratos;
        this.enderecoEntrega = enderecoEntrega;
    }

    public static int getUltimoPedido() {
        return ultimoPedido;
    }

    public static void setUltimoPedido(int ultimoPedido) {
        Pedido.ultimoPedido = ultimoPedido;
    }

    public Integer getIdentifcadorPedido() {
        return identifcadorPedido;
    }

    public void setIdentifcadorPedido(Integer identifcadorPedido) {
        this.identifcadorPedido = identifcadorPedido;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public List<Pratos> getPratos() {
        return pratos;
    }

    public void setPratos(List<Pratos> pratos) {
        this.pratos = pratos;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }


}
