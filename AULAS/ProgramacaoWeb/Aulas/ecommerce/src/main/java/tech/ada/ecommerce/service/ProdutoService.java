package tech.ada.ecommerce.service;

import org.springframework.stereotype.Service;
import tech.ada.ecommerce.model.Produto;
import tech.ada.ecommerce.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {
    ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> buscarProdutosPorPrecos(double preco1, double preco2) {
        //        List<Produto> produtos = produtoRepository.findByPrecoBetween(preco1, preco2);
        //        int page = 0;
        //        int total = 100;
        //        Pageable pageable = PageRequest.of(page, total, Sort.Direction.DESC, "preco");
        //        Sort sort = Sort.by(Sort.Direction.DESC);
        //        Page<Produto> produtos2 = produtoRepository.findAll(pageable);
        //        List<Produto> produtos3 = produtoRepository.findAll(sort);
        //        return produtos;
        return null;
    }
}
