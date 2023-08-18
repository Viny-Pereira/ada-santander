package OOP.AULA8.src.EXEMPLO;

import java.util.NoSuchElementException;

public class PilhaArray extends Pilha {
    private final Object[] array;
    private int posicao;

    public PilhaArray() {
        this.array = new Object[10];
    }

    @Override
    public void push(Object obj) {
        if (posicao >= this.array.length) {
            throw new RuntimeException("Pilha está cheia");
        }
        this.array[posicao] = obj;
        this.posicao++;
    }

    @Override
    public Object pop() {
        if (posicao <= 0) {
            throw new NoSuchElementException("Pilha vazia");
        }
        var temp = this.array[posicao];
        this.array[posicao] = null;
        this.posicao--;
        return temp;
    }

    @Override
    public Object peek() {
        return this.array[posicao];
    }
}
