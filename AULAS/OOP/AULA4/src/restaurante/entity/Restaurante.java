package OOP.AULA4.src.restaurante.entity;

import java.util.List;

public class Restaurante {
    private static int ultimoRestaurante=0;
    private Integer identificadorRestaurante;
    private String nomeRestaurante;
    private String endereco;
    private List<Pratos> pratos;

    public Restaurante(int identificadorRestaurante, String nomeRestaurante, String endereco, List<Pratos> pratos) {
        this.identificadorRestaurante = identificadorRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.endereco = endereco;
        this.pratos = pratos;
    }

    public Integer getIdentificadorRestaurante() {
        return identificadorRestaurante;
    }

    public void setIdentificadorRestaurante(Integer identificadorRestaurante) {
        this.identificadorRestaurante = identificadorRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pratos> getPratos() {
        return pratos;
    }

    public void setPratos(List<Pratos> pratos) {
        this.pratos = pratos;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nomeRestaurante='" + nomeRestaurante + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pratos=" + pratos +
                '}';
    }
}
