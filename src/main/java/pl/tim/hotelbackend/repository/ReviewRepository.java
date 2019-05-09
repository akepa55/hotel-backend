package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tim.hotelbackend.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
