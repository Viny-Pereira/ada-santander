package OOP.AULA1.src.EXEMPLO;

public class Main {
    int hora = 20;
    public static void main(String[] args) {
    Main a = new Main();
    int novaHora = a.hora++;

    Carro.test();
    Carro carro = new Carro();

    carro.ano = 2023;

    carro.imprimirAno();
    }
}
