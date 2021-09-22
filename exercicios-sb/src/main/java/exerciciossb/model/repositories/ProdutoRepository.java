package exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
