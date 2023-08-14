package OOP.AULA6.src.EXEMPLO;

import OOP.AULA6.src.EXEMPLO.contrato.Lista;
import OOP.AULA6.src.EXEMPLO.impl.ArrayLista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new ArrayLista();
        lista.add("Primeiro Elemento");
        lista.add("Segundo Elemento");
        lista.add(1);
        lista.add(2);

        imprimirLista(lista);
    }

    public static void imprimirLista(Lista lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
