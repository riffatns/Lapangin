package com.lapangin.web.service;

import com.bookinglapangan.model.Review;
import com.bookinglapangan.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getReviewsByLapangan(int lapanganID) {
        return reviewRepository.findByLapangan_LapanganID(lapanganID);
    }
}

