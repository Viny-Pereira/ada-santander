package OOP.AULA4.src.restaurante.service;


import OOP.AULA4.src.restaurante.entity.Cliente;
import OOP.AULA4.src.restaurante.entity.Pedido;
import OOP.AULA4.src.restaurante.entity.Restaurante;
import OOP.AULA4.src.restaurante.repository.PedidoRepository;

import java.util.List;

public class PedidoService {
    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void addPedido(Pedido pedido) {
        pedidoRepository.addPedido(pedido);
    }

    public List<Pedido> bucarPedidoRestaurante(Integer identificadorPedido) {
        return pedidoRepository.filtrarRestaurante(identificadorPedido);
    }

    public List<Pedido> buscarPedidosCliente(Integer identificadorPedido) {
        return pedidoRepository.filtrarCliente(identificadorPedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.listarPedidos();
    }


}
