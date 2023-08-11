package OOP.AULA4.src.EXEMPLO.pastas.service;

import OOP.AULA4.src.EXEMPLO.pastas.domain.Conta;
import OOP.AULA4.src.EXEMPLO.pastas.repository.ContaRepository;

import java.util.List;

public class ContaService {
    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void criarConta (String titular){
        var novaConta = new Conta(titular, 5);
        this.contaRepository.add(novaConta);
    }

    public List<Conta> buscarTodas(){
        return this.contaRepository.findAll();
    }
}
