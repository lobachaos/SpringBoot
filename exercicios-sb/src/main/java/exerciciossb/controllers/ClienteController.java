package exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exerciciossb.model.entities.Cliente;
import exerciciossb.model.repositories.ClienteRepository;


@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository cr;
	
	@PostMapping
	public Cliente cadastrarCliente(Cliente cliente) { // spring reconhece sozinho os atributos necessários
		cr.save(cliente);
		return cliente;
		
	}

}
