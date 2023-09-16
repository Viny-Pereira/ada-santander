package OOP2.aula002.src;

public class Test {
    public static void main(String[] args) {

        Caixa<String> caixaDeString = new Caixa<>("Teste");
        caixaDeString.abrirCaixa();
        Caixa<Integer> caixaDeInteiro = new Caixa<>(3);
        caixaDeInteiro.abrirCaixa();
        Caixa<Long> caixaDeLong = new Caixa<>(3L);
        caixaDeLong.abrirCaixa();
       /* CaixaDeInteiro caixaDeInteiro = new CaixaDeInteiro(3);
       caixaDeInteiro.abrirCaixa();
        CaixaDeLong caixaDeLong = new CaixaDeLong(3L);
        caixaDeLong.abrirCaixa();
        CaixaDeString caixaDeString = new CaixaDeString("AAA");
        caixaDeString.abrirCaixa();
        */
    }
}
