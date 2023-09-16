package OOP2.aula003.src.solid;

import java.math.BigDecimal;
import java.util.Random;

public class Conta {
    private final String numeroConta;
    private String nomeTitular;
    private BigDecimal saldo;
    private String senha;

    public Conta() {
        this.numeroConta = Integer.toString(new Random().nextInt(1000));
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha){
        if(senha==null) {
            System.out.println("Senha vazia");
        }else{
            this.senha=senha;
        }
    }
}
