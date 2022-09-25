package inc.star.springrestdata.repository;

import inc.star.springrestdata.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController
public interface BookRepository extends CrudRepository<Book, Integer> {
}
