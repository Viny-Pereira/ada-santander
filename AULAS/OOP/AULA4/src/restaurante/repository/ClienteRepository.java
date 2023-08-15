package OOP.AULA4.src.restaurante.repository;

import OOP.AULA4.src.restaurante.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> clienteRestaurante;

    public ClienteRepository() {
        this.clienteRestaurante = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clienteRestaurante.add(cliente);
    }


    public Cliente buscarCliente(String nome, Integer IdentificadorCliente) {
        for (Cliente cliente : clienteRestaurante) {
            if (cliente.getNomeCliente().equals(nome) && cliente.getIdentificadorCliente().equals(IdentificadorCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listarPratos() {
        return new ArrayList<>(clienteRestaurante);
    }
}
