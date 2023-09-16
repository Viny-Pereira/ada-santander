package OOP2.everests.evereste02;

public class EX001 {
    interface OperacoesContaCorrente {
        double realizaDeposito(ContaCorrente contaCorrente, Double deposito);

        boolean realizaSaque(ContaCorrente contaCorrente, Double saque);
    }

    class ContaCorrente {
        private String agencia;
        private String conta;
        private Double saldo;

        public ContaCorrente(String agencia, String conta, Double saldo) {
            this.agencia = agencia;
            this.conta = conta;
            this.saldo = saldo;
        }

        public String getAgencia() {
            return agencia;
        }

        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        public String getConta() {
            return conta;
        }

        public void setConta(String conta) {
            this.conta = conta;
        }

        public Double getSaldo() {
            return saldo;
        }

        public void setSaldo(Double saldo) {
            this.saldo = saldo;
        }

        public boolean realizaDeposito(ContaCorrente contaCorrente, Double deposito) {
            if (deposito < 0) {
                return false;
            }
            contaCorrente.setSaldo(contaCorrente.getSaldo() + deposito);
            return true;
        }

        public boolean realizaSaque(ContaCorrente contaCorrente, Double saque) {
            if (saque < 0) {
                return false;
            }
            if (contaCorrente.getSaldo() < saque) {
                return false;
            }
            contaCorrente.setSaldo(contaCorrente.getSaldo() - saque);
            return true;
        }

        ;

        // Construtores, Getters e Setters
    }
}
