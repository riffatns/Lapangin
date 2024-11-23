package com.lapangin.web.repository;

import com.lapangin.web.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    // Custom query: Temukan review berdasarkan lapangan
    List<Review> findByLapangan_LapanganID(int lapanganID);

    // Custom query: Temukan review berdasarkan pesanan
    List<Review> findByPesanan_PesananID(int pesananID);
}