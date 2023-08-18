package OOP.AULA7.src.EXEMPLO;


public class Pilha {
    private Elemento elementoEntrante;


    public Pilha(){
        this.elementoEntrante = null;
    }
    public Elemento top(){
        return elementoEntrante;
    }

    public void push(Elemento novoElemento){
        Elemento elementoAuxiliar = elementoEntrante;
        elementoEntrante = novoElemento;
        elementoAuxiliar.setElementoReferencia(elementoAuxiliar);
    }

    public Elemento PEEK(){
        if(!this.isEmpty()){
            Elemento elementoSaindo = elementoEntrante;
            return elementoSaindo;
        }
        return null;
    }

    public void pull(){
        if(!this.isEmpty()){
            Elemento elementoSaindo = elementoEntrante;
            elementoSaindo = elementoEntrante.getElementoReferencia();
        }
        return;
    }


    public boolean isEmpty(){
        if(elementoEntrante==null){
            return true;
        }
        return false;
    }


    static class Elemento {
        private int dado;
        private Elemento elementoReferencia = null;

        public Elemento(int dado) {
            this.dado = dado;
        }

        public Elemento getElementoReferencia() {
            return elementoReferencia;
        }

        public void setElementoReferencia(Elemento elementoReferencia) {
            this.elementoReferencia = elementoReferencia;
        }

    }

}
