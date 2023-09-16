package OOP2.aula002.src;

public class Caixa<T> {
    private T objeto;

    public Caixa(T objeto) {
        this.objeto = objeto;
    }

    public void abrirCaixa() {
        System.out.println("O valor dentro da caixa é: " + this.objeto);
    }

    public T getObjeto() {
        return objeto;
    }
}
