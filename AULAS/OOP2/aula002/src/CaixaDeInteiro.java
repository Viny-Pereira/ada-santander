package OOP2.aula002.src;

public class CaixaDeInteiro {
    public Integer integerGuardado;

    public CaixaDeInteiro(Integer integerGuardado) {
        this.integerGuardado = integerGuardado;
    }

    public void abrirCaixa() {
        System.out.println("O valor da caixa é " + this.integerGuardado);
    }
}
