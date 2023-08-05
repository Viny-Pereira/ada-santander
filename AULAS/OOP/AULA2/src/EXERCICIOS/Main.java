package OOP.AULA2.src.EXERCICIOS;

import java.util.Scanner;

/*Exercício: Sistema Bancário Simplificado

        Você deve criar um sistema simplificado para um banco.
        Nesse sistema, será possível gerenciar clientes e suas respectivas contas.

        Parte 1: Classe Cliente

        Crie uma classe Cliente que possua os seguintes atributos: nome, cpf e email.

        Essa classe deve ter um construtor que inicialize todos esses valores, e os métodos equals() e toString().
        O método equals() deve comparar dois clientes com base em seus CPFs (dois clientes são iguais se tiverem o mesmo CPF).
        O método toString() deve retornar uma string contendo todas as informações do cliente.

        Parte 2: Classe Conta

        Em seguida, crie uma classe Conta que possui um Cliente (o dono da conta), um numero (número da conta) e um saldo.

        Essa classe deve ter um construtor para inicializar o cliente e o número da conta
        (o saldo inicial deve ser zero), um método depositar(), que aumenta o saldo em uma certa quantia
        um método sacar(), que diminui o saldo em uma certa quantia (se houver saldo suficiente)
        e os métodos equals() e toString().
        O método equals() deve comparar duas contas com base em seus números (duas contas são iguais se tiverem o mesmo número).
        O método toString() deve retornar uma string contendo todas as informações da conta.

        Parte 3: Classe Banco

        Por fim, crie uma classe Banco que gerencie um conjunto de Conta.
        Ela deve ter um método criarConta() que crie uma nova conta e a adicione ao conjunto
        um método buscarConta() que retorne uma conta dado o seu número
        um método depositar() que receba o número de uma conta e uma quantia, e faça o depósito nessa conta
        e um método sacar() que faça o saque de uma conta.

        Parte 4: Teste

        Crie uma classe TesteBanco com um método main()
        que imprime um menu para que o usuário possa executar operações como criar conta
        depositar, sacar e exibir os dados de uma conta.

        Para isso, você pode usar a classe Scanner para ler as opções do usuário e os dados necessários para cada operação.*/
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        String[] opcoes = new String[]{"Criar conta", "Depositar", "Sacar", "Dados da conta", "Sair"};
        String[] perguntas = new String[]{"Digite o nome do cliente", "Digite o CPF do cliente", "Digite o email do cliente", "Digite o número da conta ", "Digite a quantia a ser depositada", "Digite a quantia a ser sacada"};
        String nomeCliente;
        String CPF;
        String email;
        String numeroConta;
        double deposito;
        double saque;
        Conta conta;
        Cliente cliente;

        int opcao;
        do {
            System.out.println("MENU");
            for (int i = 0; i< opcoes.length;i++){
                System.out.printf("%d - %s%n", i+1, opcoes[i]);
            }
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println(opcoes[1]);
                    System.out.println(perguntas[0]);
                    nomeCliente = scanner.next();
                    System.out.println(perguntas[1]);
                    CPF = scanner.next();
                    System.out.println(perguntas[2]);
                    email = scanner.next();
                    System.out.println(perguntas[3]);
                    numeroConta = scanner.next();
                    cliente = new Cliente(nomeCliente, CPF, email);
                    conta = new Conta(cliente, numeroConta);

                    banco.criarConta(conta);
                    System.out.println("Conta Criada com sucesso");
                    break;
                case 2:
                    System.out.println(opcoes[2]);
                    System.out.println(perguntas[3]);
                    numeroConta = scanner.next();
                    System.out.println(perguntas[4]);
                    deposito = scanner.nextDouble();
                    banco.depositar(numeroConta, deposito);
                    System.out.println("Deposito realizado com sucesso");
                    break;
                case 3:
                    System.out.println(opcoes[3]);
                    System.out.println(perguntas[3]);
                    numeroConta = scanner.next();
                    System.out.println(perguntas[5]);
                    saque = scanner.nextDouble();
                    banco.sacar(numeroConta, saque);
                    System.out.println("Saque realizado com sucesso");
                    break;
                case 4:
                    System.out.println(opcoes[4]);
                    System.out.println(perguntas[3]);
                    numeroConta = scanner.next();
                    conta = banco.buscarConta(numeroConta);
                    System.out.println(conta);
                    break;
                default:
                    if (opcao!=5) System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }while (opcao!=opcoes.length);
    }
}
