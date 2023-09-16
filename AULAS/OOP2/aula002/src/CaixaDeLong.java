package OOP2.aula002.src;

public class CaixaDeLong {
    private Long longCaixa;

    public CaixaDeLong(Long longCaixa) {
        this.longCaixa = longCaixa;
    }

    public void abrir(){
        System.out.println("O valor dentro da caixa é: " + this.longCaixa);
    }

}
