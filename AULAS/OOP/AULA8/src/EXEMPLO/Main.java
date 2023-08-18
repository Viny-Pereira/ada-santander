package OOP.AULA8.src.EXEMPLO;

public class Main {
    public static void main(String[] args) {
        //Pilha pilha = new PilhaArrayList();
        //Pilha pilha = new PilhaArray();
        Pilha pilha = new PilhaLinkedList();

        System.out.println("Imprimindo pilha");
        System.out.println(pilha);

        System.out.println("Adicionando Elemento 1");
        pilha.push(10);

        System.out.println("Adicionando elemento 2");
        pilha.push(20);

        System.out.println("Imprimindo pilha");
        System.out.println(pilha);

        System.out.println("Pegando ultimo elemento da fila");
        pilha.peek();

        System.out.println("Apagando elemento");
        pilha.pop();

        System.out.println("Imprimindo pilha");
        System.out.println(pilha);

        System.out.println("Apagando elemento");
        pilha.pop();
        System.out.println("Apagando elemento");
        pilha.pop();


    }
}
