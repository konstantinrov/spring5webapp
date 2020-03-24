package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 24/03/2020 - 17:25
 * @project spring5webapp
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
