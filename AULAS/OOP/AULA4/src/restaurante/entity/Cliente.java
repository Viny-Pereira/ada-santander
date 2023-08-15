package OOP.AULA4.src.restaurante.entity;

import java.util.Objects;

public class Cliente {
    private static int ultimoIdentificador = 0;
    private String nomeCliente;
    private Integer identificadorCliente;

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.identificadorCliente = ++ultimoIdentificador;
    }

    public static int getUltimoIdentificador() {
        return ultimoIdentificador;
    }

    public static void setUltimoIdentificador(int ultimoIdentificador) {
        Cliente.ultimoIdentificador = ultimoIdentificador;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getIdentificadorCliente() {
        return identificadorCliente;
    }

    public void setIdentificadorCliente(Integer identificadorCliente) {
        this.identificadorCliente = identificadorCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return identificadorCliente == cliente.identificadorCliente && Objects.equals(nomeCliente, cliente.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCliente, identificadorCliente);
    }
}
