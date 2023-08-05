package OOP.AULA1.src.EXEMPLO;

public class Carro {
    Pessoa dono;
    String marca;
    String modelo;
    int ano;

    public static void test(){
        System.out.println("TEST");
    }

    public void imprimirAno(){
        System.out.println(ano);
    }

    public String getMarca(){
        return marca;
    }

    public void imprimir(){
        System.out.println("Dono: "+dono.nome);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
