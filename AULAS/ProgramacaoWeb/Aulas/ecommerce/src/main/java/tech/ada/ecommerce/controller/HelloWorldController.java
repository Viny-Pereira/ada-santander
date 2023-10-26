package tech.ada.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ada.ecommerce.model.Cliente;
import tech.ada.ecommerce.model.Produto;
import tech.ada.ecommerce.service.ClienteService;
import tech.ada.ecommerce.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @Autowired
    ClienteService clienteService;
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello World");
        return "Ola Mundo";
    }

    @GetMapping("/{nome}")
    public List<Cliente> buscarClientes(@PathVariable("nome") String nome) {
        return clienteService.buscarPorNome(nome);
    }

    @GetMapping("/preco/{preco1}/{preco2}")
    public List<Produto> buscarProdutoPorPreco(@PathVariable("preco1") double preco1,
                                               @PathVariable("preco2") double preco2) {
        return produtoService.buscarProdutosPorPrecos(preco1, preco2);
    }

}
