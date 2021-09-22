package exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import exerciciossb.model.entities.Cliente;


@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"João");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClienteId1(@PathVariable int id) {
		return new Cliente(id, "Maria");
	}
	
	@GetMapping 
	public Cliente obterClienteId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Zé");
	}

}
