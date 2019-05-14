package pl.tim.hotelbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tim.hotelbackend.entity.Review;
import pl.tim.hotelbackend.service.ReviewService;
import java.util.Optional;

@RestController
public class ReviewController {

    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("reviews")
    public Iterable<Review> getAllReviews() {
        return reviewService.findAll();
    }

    @GetMapping("reviews/{id}")
    public Optional<Review> getReviewById(@PathVariable Long id) {
        return reviewService.findById(id);
    }

    @GetMapping("hotels/{hotelId}/reviews")
    public Iterable<Review> getAllReviewsForHotelId(@PathVariable Long hotelId) {
        return reviewService.findAllByHotelId(hotelId);
    }

    @GetMapping("hotels/{hotelId}/reviews/{reviewId}")
    public Optional<Review> getReviewByIdForHotelId(@PathVariable Long hotelId, @PathVariable Long reviewId) {
        return reviewService.findByIdForHotelId(reviewId, hotelId);
    }

    @GetMapping("users/{userId}/reviews")
    public Iterable<Review> getAllReviewsByUserId (@PathVariable Long userId) {
        return reviewService.findAllByUserId(userId);
    }

    @GetMapping("users/{userId}/reviews/{reviewId}")
    public Optional<Review> getReviewByIdForUserId(@PathVariable Long userId, @PathVariable Long reviewId) {
        return reviewService.findByIdForUserId(reviewId, userId);
    }

}
