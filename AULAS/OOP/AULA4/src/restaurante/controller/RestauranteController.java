package OOP.AULA4.src.restaurante.controller;

import OOP.AULA4.src.restaurante.entity.Cliente;
import OOP.AULA4.src.restaurante.entity.Pedido;
import OOP.AULA4.src.restaurante.entity.Pratos;
import OOP.AULA4.src.restaurante.entity.Restaurante;
import OOP.AULA4.src.restaurante.service.ClienteService;
import OOP.AULA4.src.restaurante.service.PedidoService;
import OOP.AULA4.src.restaurante.service.RestauranteService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RestauranteController {
    int opcao;
    String nomeRestaurante;
    String enderecoRestaurante;
    String nomePrato;
    String nomeCliente;
    Integer identificadorRestaurante;
    Integer identificadorCliente;
    double precoDoPrato;
    String descricaoPrato;
    private RestauranteService restauranteService;
    private ClienteService clienteService;
    private PedidoService pedidoService;
    private Scanner scanner;

    public RestauranteController(RestauranteService restauranteService, ClienteService clienteService, PedidoService pedidoService) {
        this.restauranteService = restauranteService;
        this.clienteService = clienteService;
        this.pedidoService = pedidoService;
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        do {
            System.out.println("Sistema de Pedidos de Restaurantes");
            System.out.println("1 - Cadastrar restaurante");
            System.out.println("2 - Listar restaurantes");
            System.out.println("3 - Adicionar prato");
            System.out.println("4 - Listar pratos por restaurante");
            System.out.println("5 - Realizar pedido");
            System.out.println("6 - Listar pedidos por restaurante");
            System.out.println("7 - Ver pedidos por cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException) {
                System.out.println("Insira um número válido");
                continue;
            }
            switch (opcao) {
                switch (opcao) {
                    case 1:
                        cadastrarRestaurante();
                        break;
                    case 2:
                        listarRestaurantes();
                        break;
                    case 3:
                        adicionarPrato();
                        break;
                    case 4:
                        listarPratosRestaurante();
                        break;
                    case 5:
                        fazerPedido();
                        break;
                    case 6:
                        listarPedidosRestaurante();
                        break;
                    case 7:
                        verPedidosCliente();
                        break;
                    default:
                        if (opcao != 0) {
                            System.out.println("Opção inválida!");
                            System.out.println();
                        }
                }
            }

        } while (opcao < 0);
    }

    private void cadastrarRestaurante() {
        System.out.println("Insira o nome restaurante");
        nomeRestaurante = scanner.next();
        System.out.println("Insira o endereço do restaurante");
        enderecoRestaurante = scanner.next();
        Restaurante restaurante = new Restaurante(nomeRestaurante, enderecoRestaurante);
        restauranteService.cadastrarRestaurante(restaurante);
        System.out.println("Restaurante cadastrado com sucesso!");
        System.out.println();
    }

    private void listarRestaurantes() {
        List<Restaurante> restaurantes = restauranteService.listarRestaurantes();
        if (restaurantes.isEmpty()) {
            System.out.println("Ainda não existe restarurantes cadastrados!");
            System.out.println();
        } else {
            for (Restaurante restaurante : restaurantes) {
                System.out.println(restaurante);
            }
        }
    }

    private void adicionarPrato() {
        System.out.println("Insira o identificador do restaurante: ");
        identificadorRestaurante = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do Restaurante: ");
        nomeRestaurante = scanner.next();
        System.out.println("Nome do prato");
        nomePrato = scanner.next();
        System.out.println("Preço do prato");
        precoDoPrato = scanner.nextDouble();
        System.out.println("Descrição do prato");
        descricaoPrato = scanner.next();
        Pratos prato = new Pratos(nomePrato, precoDoPrato, descricaoPrato);
        restauranteService.addPrato(nomeRestaurante, prato, identificadorRestaurante);
        System.out.println("Prato adicionado!");
        System.out.println();
    }

    private void listarPratosRestaurante() {
        System.out.println("Identificador do restaurante");
        identificadorRestaurante = scanner.nextInt();
        System.out.print("Nome do restaurante");
        nomeRestaurante = scanner.next();
        List<Pratos> pratos = restauranteService.listarPratosRestaurante(nomeRestaurante, identificadorRestaurante);
        if (pratos == null || pratos.isEmpty()) {
            System.out.println("Nenhum prato encontrado para o restaurante informado!");
            System.out.println();
        } else {
            for (Pratos prato : pratos) {
                System.out.println(prato);
                System.out.println();
            }
        }
    }

    @SuppressWarnings("unused")
    private void fazerPedido() {
        System.out.print("Já existe um cliente para este pedido? (S/N)");
        String opcao = scanner.next();
        Cliente cliente;
        if (opcao.equalsIgnoreCase("S")) {
            System.out.println("Identificador do Cliente");
            identificadorCliente = scanner.nextInt();
            System.out.println("Nome do Cliente");
            nomeCliente = scanner.next();
            cliente = clienteService.buscarPrato(identificadorCliente, nomeCliente);
            if (cliente == null) {
                System.out.println("Cliente não encontrado!");
                return;
            }
        } else {
            System.out.print("Deseja cadastrar um novo cliente com este pedido? (S/N): ");
            opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("S")) {
                System.out.print("Nome do Cliente: ");
                nomeCliente = scanner.nextLine();
                cliente = new Cliente(nomeCliente);
                clienteRepository.adicionarCliente(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
            } else {
                return;
            }
        }
        System.out.print("Identificador do Restaurante: ");
        Integer identificadorRestaurante = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do Restaurante: ");
        String nomeRestaurante = scanner.nextLine();
        List<Pratos> pratos = new ArrayList<>();
        while (true) {
            System.out.println("1. Adicionar Prato ao Pedido");
            System.out.println("0. Finalizar Pedido");
            System.out.print("Escolha uma opção: ");
            int opcaoPrato = scanner.nextInt();
            scanner.nextLine();
            if (opcaoPrato == 1) {
                System.out.print("Identificador do Prato: ");
                Integer identificadorPrato = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do Prato: ");
                String nomePrato = scanner.nextLine();

                List<Pratos> pratosRestaurante = restauranteService.listarPratosRestaurante(nomeRestaurante, identificadorRestaurante);
                for (Pratos prato : pratosRestaurante) {
                    if (prato.getIdentificadorPrato().equals(identificadorPrato)) {
                        pratos.add(prato);
                    }
                }
            } else if (opcaoPrato == 0) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        clienteService.fazerPedido(cliente.getIdentificadorCliente(), cliente.getNomeCliente(), identificadorRestaurante,
                nomeRestaurante, pratos);
        System.out.println("Pedido realizado com sucesso!");
    }


    private void listarPedidosRestaurante() {
        System.out.print("Identificador do Restaurante: ");
        Integer identificador = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do Restaurante: ");
        String nome = scanner.nextLine();
        List<Pedido> pedidos = restauranteService.listarPedidosRestaurante(identificador, nome);
        if (pedidos == null || pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado para o restaurante informado!");
            System.out.println();
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
                System.out.println();
            }
        }
    }

    private void verPedidosCliente() {
        System.out.print("Identificador do cliente");
        identificadorCliente = scanner.nextInt();
        System.out.print("Nome do cliente");
        nomeCliente = scanner.next();
        List<Pedido> pedidos = clienteService.verPedidosCliente(identificador, nome);
        if (pedidos == null || pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado para o cliente informado!");
            System.out.println();
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
                System.out.println();
            }
        }
    }
}
