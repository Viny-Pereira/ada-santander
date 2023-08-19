package OOP.AULA4.src.restaurante;

import OOP.AULA4.src.restaurante.controller.RestauranteController;
import OOP.AULA4.src.restaurante.repository.ClienteRepository;
import OOP.AULA4.src.restaurante.repository.PedidoRepository;
import OOP.AULA4.src.restaurante.repository.RestauranteRepository;
import OOP.AULA4.src.restaurante.service.ClienteService;
import OOP.AULA4.src.restaurante.service.PedidoService;
import OOP.AULA4.src.restaurante.service.RestauranteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestauranteRepository restauranteRepository = new RestauranteRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        PedidoRepository pedidoRepository = new PedidoRepository();
        PedidoService pedidoService = new PedidoService(pedidoRepository);
        RestauranteService restauranteService = new RestauranteService(restauranteRepository);
        ClienteService clienteService = new ClienteService(clienteRepository, restauranteService, pedidoService);
        RestauranteController menu = new RestauranteController(restauranteService, clienteService, pedidoService);
        menu.menu();

    }
}
