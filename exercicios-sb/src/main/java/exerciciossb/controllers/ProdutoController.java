package exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping
	public Iterable<Produto> consultarTodosProdutos() {
		return pr.findAll();
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina){
		Pageable page = PageRequest.of(numeroPagina, 3);
		
		return pr.findAll(page);
	}
	
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Produto> obterProdutoPorNome(@PathVariable String nome) {
		
		
		return pr.findByNomeContaining(nome);
	}
	
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoID(@PathVariable int id) {
		return pr.findById(id);
	}
	
	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		pr.save(produto);
		return produto;
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProdutoID(@PathVariable int id) {
		pr.deleteById(id);
	}

}
