package tech.ada.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.ada.ecommerce.dto.ClienteDTO;
import tech.ada.ecommerce.model.Cliente;
import tech.ada.ecommerce.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //@GetMapping("")
    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> getCliente() {
        return clienteService.buscarTodosOsClientes();
    }

    @PostMapping("")
    public ResponseEntity<ClienteDTO> saveCliente(@RequestBody ClienteDTO cliente) {
        try {
            ClienteDTO savedCliente = clienteService.salvarCliente(cliente);
            return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> getClienteById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(clienteService.buscarPorId(id), HttpStatus.OK);
    }

    @GetMapping("/nome")
    public ResponseEntity<List<Cliente>> getClienteByNome(@PathVariable("nome") String nome) {
        return new ResponseEntity<>(clienteService.buscarPorNome(nome), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long id) {
        clienteService.deletarCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> ativarDesativarCliente(@PathVariable("id") Long id, @RequestParam("ativo") boolean ativo) {
        clienteService.ativarDesativarCliente(ativo, id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    //    @PutMapping("")
//    public ResponseEntity<ClienteDTO> atualizarCliente(@RequestBody ClienteDTO cliente) {
//        try {
//            ClienteDTO savedCliente = clienteService.salvarCliente(cliente);
//            if (savedCliente != null)
//                return new ResponseEntity<>(savedCliente, HttpStatus.CREATED);
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        } catch (Exception exception) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
