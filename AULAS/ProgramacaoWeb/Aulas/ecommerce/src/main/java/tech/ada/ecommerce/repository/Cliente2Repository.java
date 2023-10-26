package tech.ada.ecommerce.repository;

import ch.qos.logback.core.net.server.Client;
import tech.ada.ecommerce.model.Cliente;

import java.util.List;

public interface Cliente2Repository {
    List<Cliente> findAll();

    Cliente findById(Long id);

    List<Cliente> findByNome(String nome);
}
