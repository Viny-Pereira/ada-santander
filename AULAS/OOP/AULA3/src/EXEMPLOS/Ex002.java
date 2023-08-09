package OOP.AULA3.src.EXEMPLOS;

import OOP.AULA2.src.EXERCICIOS.Conta;

import java.util.ArrayList;
import java.util.List;

public class Ex002 {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Joao");
        nomes.add("Joao");
        nomes.add("Joao");

        Contador contador = new Contador();
        var qtdNomes = contador.contarNumero(nomes);

        System.out.println(qtdNomes);
        System.out.println(nomes);
    }

    }
    class Contador {
        public int contarNumero(List<String> nomes){
            return nomes.size();
        }
}
