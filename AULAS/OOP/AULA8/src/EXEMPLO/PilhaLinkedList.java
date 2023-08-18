package OOP.AULA8.src.EXEMPLO;

import java.util.LinkedList;

public class PilhaLinkedList extends Pilha {
    private final LinkedList<Object> lista = new LinkedList<>();

    @Override
    public void push(Object obj) {
        lista.addLast(obj);

    }

    @Override
    public Object pop() {
        var temp = peek();
        lista.removeLast();
        return temp;
    }

    @Override
    public Object peek() {
        return lista.getLast();
    }
}
