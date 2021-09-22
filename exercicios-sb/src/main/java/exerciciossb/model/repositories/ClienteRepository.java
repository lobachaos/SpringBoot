package exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import exerciciossb.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
