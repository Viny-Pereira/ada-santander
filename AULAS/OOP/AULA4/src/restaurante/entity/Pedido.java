package OOP.AULA4.src.restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static int ultimoPedido = 0;
    private Integer identifcadorPedido;
    private Restaurante restaurante;
    private List<Pratos> pratos;
    private String enderecoEntrega;
    private Cliente cliente;

    public Pedido(Restaurante restaurante, Cliente cliente, String enderecoEntrega) {
        this.identifcadorPedido = ++ultimoPedido;
        this.restaurante = restaurante;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.pratos = new ArrayList<>();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return
                "ID: " + identifcadorPedido +
                        "\nRestaurante: " + restaurante +
                        "\nPratos: " + pratos +
                        "\nEndereco de Entrega: " + enderecoEntrega +
                        "\nNome do cliente: " + cliente +
                        '\n';
    }
}
