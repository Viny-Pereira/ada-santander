package OOP.AULA4.src.restaurante.repository;

import OOP.AULA4.src.restaurante.entity.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoRepository {

    private List<Pedido> pedidosRepository;

    public PedidoRepository() {
        this.pedidosRepository = new ArrayList<Pedido>();
    }
    public void addPedido(Pedido pedido){
        listarPedidos().add(pedido);
    }

    public Pedido buscarPedido(int identidicadorPedido){
        for (Pedido pedido : pedidosRepository){
            if(pedido.getIdentifcadorPedido().equals(identidicadorPedido)){
                return pedido;
            }
        }
        return null;
    }
    public List<Pedido> listarPedidos(){
        return new ArrayList<Pedido>(pedidosRepository);
    }

    // Me baseei no codigo de  um colega de turma
    public List<Pedido> filtrarRestaurante(int identificador){
        List<Pedido> filteredList = pedidosRepository.stream()
                .filter(item -> item.getRestaurante().getIdentificadorRestaurante() == identificador)
                .collect(Collectors.toList());
        return filteredList;
    }

    public List<Pedido> filtrarCliente(int identificador){
        List<Pedido> filteredList = pedidosRepository.stream()
                .filter(item -> item.getCliente().getIdentificadorCliente() == identificador)
                .collect(Collectors.toList());
        return filteredList;
    }
}
