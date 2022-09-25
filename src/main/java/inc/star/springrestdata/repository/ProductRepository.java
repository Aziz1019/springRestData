package inc.star.springrestdata.repository;

import inc.star.springrestdata.entity.Category;
import inc.star.springrestdata.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
