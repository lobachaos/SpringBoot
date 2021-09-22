package exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exerciciossb.model.entities.Produto;
import exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository pr;
	
	@PostMapping
	public Produto novoProduto(@Valid Produto produto) {
		pr.save(produto);
		
		return produto;
	}

}
