package OOP.AULA4.src.EXERCICIO.repository;

import OOP.AULA4.src.EXERCICIO.entity.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteRepository {

    private List<Restaurante> restauranteRepository;

    public RestauranteRepository() {
        restauranteRepository = new ArrayList<>();
    }

    public void addRestaurante(Restaurante restaurantes) {
        this.restauranteRepository.add(restaurantes);
    }

    public Restaurante buscarRestaurante(String nomeRestaurante, Integer identificadorRestaurante) {
        for (Restaurante restaurante : restauranteRepository) {
            if (restaurante.getNomeRestaurante().equals(nomeRestaurante) && restaurante.getIdentificadorRestaurante().equals(identificadorRestaurante)) {
                return restaurante;
            }
        }
        return null;
    }

    public List<Restaurante> listarRestaurantes() {
        return new ArrayList<>(restauranteRepository);
    }

}
