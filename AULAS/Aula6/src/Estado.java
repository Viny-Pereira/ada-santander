package Aula6.src;

public enum Estado {
    MG("MG", 7),
    SP("SP", 12),
    RJ("RJ", 15);

    final String siglaEstado;
    final int impostoSobreProduto;

    Estado(String siglaEstado, int impostoSobreProduto){
        this.siglaEstado = siglaEstado;
        this.impostoSobreProduto = impostoSobreProduto;
    }

    public double getImpostoSobreProduto(){
        return impostoSobreProduto/100d;
    }

}
