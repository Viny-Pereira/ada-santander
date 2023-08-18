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
        if (size == this.array.length) {
            resize();
        }
        this.array[size] = obj;
        size++;
    }

    @Override
    public Object get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Posição inexistente");
        }
        return this.array[idx];
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        Object[] novoArray = new Object[this.array.length * 2];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = this.array[i];
        }
        this.array = novoArray;
    }

    public void remove(int index){
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException("Possição inválida");
        }
        for (int i = index; i<size-1;i++){
            array[i] = array[i+1];
        }
        array[size-1]=null;
        size--;
    }

}
