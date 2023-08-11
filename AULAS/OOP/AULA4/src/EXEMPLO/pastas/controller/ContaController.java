package OOP.AULA4.src.EXEMPLO.pastas.controller;

import OOP.AULA4.src.EXEMPLO.pastas.domain.Conta;
import OOP.AULA4.src.EXEMPLO.pastas.repository.ContaRepository;
import OOP.AULA4.src.EXEMPLO.pastas.service.ContaService;

import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class ContaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaService contaService = new ContaService(new ContaRepository());

        while(true){
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Criar conta");
            System.out.println("2. Buscar todas as contas");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    String nome = scanner.next();

                    // Efeturar cadastro
                    contaService.criarConta(nome);
                    System.out.println("Conta criada com sucesso");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Imprimindo todas as contas");

                    // Efetuando a busca
                    List<Conta> contas = contaService.buscarTodas();

                    System.out.println("Contas cadastradas ");
                    for(Conta conta: contas){
                        System.out.println(conta);
                    }
                    break;
                case 0:
                    break;
                default:
                System.out.println("Opção inválida!!");
                    System.out.println("");
            }
        scanner.close();
        }
    }
}
