package pl.tim.hotelbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tim.hotelbackend.entity.Review;
import pl.tim.hotelbackend.repository.ReviewRepository;
import java.util.Optional;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Iterable<Review> findAll() {
        return reviewRepository.findAll();
    }

    public Iterable<Review> findAllByUserId(Long userId) { return reviewRepository.findReviewsByIdUserEquals(userId); }

    public Iterable<Review> findAllByHotelId(Long hotelId) { return reviewRepository.findReviewsByIdHotelEquals(hotelId); }

    public Optional<Review> findById(Long id) {
        return reviewRepository.findById(id);
    }

    public Optional<Review> findByIdForUserId(Long id, Long userId) { return reviewRepository.findReviewByIdReviewAndIdUserEquals(id, userId); }

    public Optional<Review> findByIdForHotelId(Long id, Long hotelId) { return reviewRepository.findReviewByIdReviewAndIdHotelEquals(id, hotelId); }

    public void save(Review review) {
        reviewRepository.save(review);
    }

    public void update(Review review) {
        reviewRepository.save(review);
    }

    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}
