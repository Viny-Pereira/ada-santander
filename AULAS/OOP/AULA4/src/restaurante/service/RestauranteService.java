package OOP.AULA4.src.restaurante.service;

import OOP.AULA4.src.restaurante.entity.Pedido;
import OOP.AULA4.src.restaurante.entity.Pratos;
import OOP.AULA4.src.restaurante.entity.Restaurante;
import OOP.AULA4.src.restaurante.repository.RestauranteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestauranteService {
    private RestauranteRepository restauranteRepository;
    private List<Pedido> pedidoRepository;

    public RestauranteService(RestauranteRepository restauranteRepository){
        this.restauranteRepository = restauranteRepository;
        this.pedidoRepository = new ArrayList<>();
    }

    public void cadastrarRestaurante(Restaurante restaurante){
        restauranteRepository.addRestaurante(restaurante);
    }

    public List<Restaurante> listarRestaurantes(){
        return restauranteRepository.listarRestaurantes();
    }

    public void addPrato(String nomeRestaurante, Pratos prato, Integer identificadorRestaurante){
        Restaurante restaurante = restauranteRepository.buscarRestaurante(nomeRestaurante, identificadorRestaurante);
        if (restaurante!=null){
            restaurante.getPratos().add(prato);
        }
    }

    public List<Pedido> listarPratosRestaurante(String nomeRestaurante, Integer identificadorRestaurante){
        Restaurante restaurante = restauranteRepository.buscarRestaurante(nomeRestaurante, identificadorRestaurante);
        if(restaurante!=null){
            return pedidoRepository.stream()
                    .filter(pedido -> pedido.getRestaurante().equals(restaurante))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public void addPedido(Pedido pedido){
        pedidoRepository.add(pedido);
    }

    public Restaurante buscarRestaurante(String nomeRestaurante, Integer identificadorRestaurante){
        return restauranteRepository.buscarRestaurante(nomeRestaurante, identificadorRestaurante);
    }




}
