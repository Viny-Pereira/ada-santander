package OOP.AULA4.src.EXEMPLO.pastas.repository;

import OOP.AULA4.src.EXEMPLO.pastas.domain.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaRepository {
    private List<Conta> lista;

    public ContaRepository() {
        lista = new ArrayList<>();
    }
    public void add(Conta banco){
        this.lista.add(banco);
    }

    public Conta get (String titular){
        for(Conta conta:lista){
            if(conta.getTitular().equals(titular)) return conta;
        }
        return null;
    }

    public List<Conta> findAll(){
        return Collections.unmodifiableList(lista);
    }


}
