package OOP.AULA4.src.restaurante.service;

import OOP.AULA4.src.restaurante.entity.Cliente;
import OOP.AULA4.src.restaurante.entity.Pedido;
import OOP.AULA4.src.restaurante.entity.Pratos;
import OOP.AULA4.src.restaurante.entity.Restaurante;
import OOP.AULA4.src.restaurante.repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private ClienteRepository clienteRepository;
    private RestauranteService restauranteService;
    private PedidoService pedidoService;
    private List<Pedido> pedidoBanco;

    public ClienteService() {
    }

    public ClienteService(ClienteRepository clienteRepository, RestauranteService restauranteService, PedidoService pedidoService) {
        this.clienteRepository = clienteRepository;
        this.restauranteService = restauranteService;
        this.pedidoService = pedidoService;
        this.pedidoBanco = pedidoService.listarPedidos();
    }

    public void adicionarCliente(Cliente cliente) {
        clienteRepository.adicionarCliente(cliente);
    }

    public void fazerPedido(String nomeCliente, Integer identificadorCliente, String nomeRestaurante, Integer identificadorRestaurante, List<Pratos> pratos, String endereco) {
        Cliente cliente = clienteRepository.buscarCliente(nomeCliente, identificadorCliente);
        Restaurante restaurante = restauranteService.buscarRestaurante(nomeRestaurante, identificadorRestaurante);
        if (cliente != null && restaurante != null) {
            Pedido pedido = new Pedido(restaurante, cliente, endereco);
            pedido.setPratos(pratos);
            pedidoService.addPedido(pedido);
            restauranteService.addPedido(pedido);
        }
    }

    public Cliente buscarPrato(Integer identificadorPrato, String nomePrato) {
        return clienteRepository.buscarPrato(identificadorPrato, nomePrato);
    }

    public List<Pedido> verPedidosClientes(String nomeCliente, Integer identificadorCliente) {
        Cliente cliente = clienteRepository.buscarCliente(nomeCliente, identificadorCliente);
        if (cliente != null) {
            List<Pedido> pedidoCliente = pedidoService.buscarPedidosCliente(identificadorCliente);
            return pedidoCliente;
        }
        return null;
    }

}
