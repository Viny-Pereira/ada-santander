package OOP.AULA4.src.restaurante.service;

import OOP.AULA4.src.restaurante.repository.PratosRepository;

public class PratosService {
    private PratosRepository pratosRepository;

    public PratosService() {
    }

    public PratosService(PratosRepository pratosRepository) {
        this.pratosRepository = pratosRepository;
    }
}
