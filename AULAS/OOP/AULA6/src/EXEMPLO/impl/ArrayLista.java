package OOP.AULA6.src.EXEMPLO.impl;

import OOP.AULA6.src.EXEMPLO.contrato.Lista;

public class ArrayLista extends Lista {
    private int size;


    private Object[] array;

    public ArrayLista() {
        this.array = new Object[10];
    }

    @Override
    public void add(Object obj) {
        this.array[size]=obj;
        size++;
    }

    @Override
    public Object get(int idx) {
        if (idx<0 || idx>=size){
            throw new IndexOutOfBoundsException("Posição inexistente");
        }
        return this.array[idx];
    }
    @Override
    public int size() {
        return size;
    }
}
