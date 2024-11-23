package com.lapangin.web.repository;

import com.lapangin.web.model.Pesanan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PesananRepository extends JpaRepository<Pesanan, Integer> {
    // Custom query: Temukan pesanan berdasarkan customer
    List<Pesanan> findByCustomer_UserID(int customerID);

    // Custom query: Temukan pesanan berdasarkan lapangan
    List<Pesanan> findByLapangan_LapanganID(int lapanganID);
}