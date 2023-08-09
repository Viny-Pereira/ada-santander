package OOP.AULA4.src.EXEMPLO.heranca;

public class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    private int ano;

    public Veiculo(String placa, String cor, String modelo, int ano) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
