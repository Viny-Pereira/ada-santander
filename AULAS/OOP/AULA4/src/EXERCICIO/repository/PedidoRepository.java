package OOP.AULA4.src.EXERCICIO.repository;

import OOP.AULA4.src.EXERCICIO.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<Pedido> pedidosRepository;

    public PedidoRepository() {
        this.pedidosRepository = new ArrayList<Pedido>();
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
}
