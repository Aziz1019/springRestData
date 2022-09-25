package inc.star.springrestdata.repository;

import inc.star.springrestdata.entity.Book;
import inc.star.springrestdata.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
