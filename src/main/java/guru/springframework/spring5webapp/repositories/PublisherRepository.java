package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Konstantin Romanov
 * @created 24/03/2020 - 17:47
 * @project spring5webapp
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
