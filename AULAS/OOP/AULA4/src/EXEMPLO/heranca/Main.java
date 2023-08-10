package OOP.AULA4.src.EXEMPLO.heranca;

public class Main {
    public static void main(String[] args) {
        Carro gol = new Carro("123","azul", "gol", 2019, 4, "gasolina");

        Moto cb = new Moto("123", "azul", "gol", 2019, 450);

        cb.exibirDados();

    }

    public static void aplicarMulta(Veiculo veiculo){
        System.out.println("Aplicando multa: ");
        veiculo.exibirDados();
    }


}
