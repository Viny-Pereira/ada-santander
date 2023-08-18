package OOP.AULA8.src.EXEMPLO;

import java.util.ArrayList;
import java.util.List;

public class PilhaArrayList extends Pilha{
    private final List<Object> lista = new ArrayList<>();
    @Override
    public void push(Object obj) {
        lista.add(obj);
    }

    @Override
    public Object pop() {
        if (lista.isEmpty()){
            throw new RuntimeException("A pilha está vazia");
        }
        return lista.remove(lista.size()-1);
    }

    @Override
    public Object peek() {
        if (lista.isEmpty()){
            throw new RuntimeException("A pilha está vazia");
        }
        return lista.get(lista.size()-1);
    }
}
