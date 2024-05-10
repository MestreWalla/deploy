package br.com.deploy.render.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.deploy.render.model.Livro;

@Repository
public interface LivrosRepository extends CrudRepository<Livro, Integer> {

}
