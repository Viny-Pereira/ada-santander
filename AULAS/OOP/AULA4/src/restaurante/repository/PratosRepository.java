package OOP.AULA4.src.restaurante.repository;

import OOP.AULA4.src.restaurante.entity.Pratos;

import java.util.ArrayList;
import java.util.List;

public class PratosRepository {

    private List<Pratos> pratosRepository;

    public PratosRepository() {
        this.pratosRepository = new ArrayList<>();
    }

    public void addPratos(Pratos prato) {
        this.pratosRepository.add(prato);
    }

    public Pratos buscarPratos(String nomePrato, Integer identificadorPrato) {
        for (Pratos prato : pratosRepository) {
            if (prato.getNomePrato().equals(nomePrato) && prato.getIdentificadorPrato().equals(identificadorPrato)) {
                return prato;
            }
        }
        return null;
    }

    public List<Pratos> listarPratos(){
        return new ArrayList<>(pratosRepository);
    }

}
