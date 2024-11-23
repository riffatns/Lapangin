package com.lapangin.web.controller;

import com.lapangin.web.model.Review;
import com.lapangin.web.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @GetMapping("/{lapanganID}")
    public List<Review> getReviewsByLapangan(@PathVariable int lapanganID) {
        return reviewService.getReviewsByLapangan(lapanganID);
    }
}
