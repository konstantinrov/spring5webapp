package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 24/03/2020 - 17:27
 * @project spring5webapp
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
