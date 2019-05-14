package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
