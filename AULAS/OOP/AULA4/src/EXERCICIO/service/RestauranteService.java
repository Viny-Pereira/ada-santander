package OOP.AULA4.src.EXERCICIO.service;

import OOP.AULA4.src.EXERCICIO.entity.Pedido;
import OOP.AULA4.src.EXERCICIO.entity.Restaurante;
import OOP.AULA4.src.EXERCICIO.repository.PedidoRepository;
import OOP.AULA4.src.EXERCICIO.repository.RestauranteRepository;

import java.util.ArrayList;
import java.util.List;

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


}
