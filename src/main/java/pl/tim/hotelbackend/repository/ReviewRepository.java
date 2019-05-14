package pl.tim.hotelbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.tim.hotelbackend.entity.Review;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Collection<Review> findReviewsByIdUserEquals(Long idUser);
    Collection<Review> findReviewsByIdHotelEquals(Long idHotel);
    Optional<Review> findReviewByIdReviewAndIdUserEquals(Long id, Long idUser);
    Optional<Review> findReviewByIdReviewAndIdHotelEquals(Long id, Long idHotel);
}
