package OOP.AULA4.src.restaurante.entity;

public class Pratos {
    private static int ultimoPrato = 0;
    private Integer identificadorPrato;
    private String nomePrato;
    private double precoPrato;
    private String descricao;

    public Pratos(String nomePrato, double precoPrato, String descricao) {
        this.identificadorPrato = ++ultimoPrato;
        this.nomePrato = nomePrato;
        this.precoPrato = precoPrato;
        this.descricao = descricao;
    }

    public Integer getIdentificadorPrato() {
        return identificadorPrato;
    }

    public void setIdentificadorPrato(Integer identificadorPrato) {
        this.identificadorPrato = identificadorPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPrecoPrato() {
        return precoPrato;
    }

    public void setPrecoPrato(double precoPrato) {
        this.precoPrato = precoPrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return
                "ID: " + identificadorPrato +
                "\nNome do Prato: " + nomePrato +
                "\nPreco do Prato: " + precoPrato +
                "\nDescricao: " + descricao+"\n";
    }
}
