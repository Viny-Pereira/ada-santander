package OOP.AULA6.src.EXEMPLO.impl;

import OOP.AULA6.src.EXEMPLO.contrato.Lista;

public class ListaLigada extends Lista {
    private int size;
    private int ultimo;
    private Elemento primeiro;
    private Elemento elemento;

    @Override
    public void add(Object obj) {
        Elemento primeiro = new Elemento(obj);
        if (size == 0) {
            this.primeiro = primeiro;
            size++;
        } else {
            Elemento elemento = this.primeiro;
            while (elemento.getProximo() != null) {

            }
        }
    }

    @Override
    public Object get(int idx) {
        for (int i = 0; i < idx; i++) {
            elemento = elemento.getProximo();
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    class Elemento {
        private Object obj;
        private Elemento proximo;

        public Elemento(Object obj) {
            this.obj = obj;
        }

        public Object getObj() {
            return obj;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }
    }
}
