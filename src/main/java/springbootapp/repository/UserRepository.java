package springbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import springbootapp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
