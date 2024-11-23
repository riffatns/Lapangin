package com.lapangin.web.repository;

import com.lapangin.web.model.Promo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromoRepository extends JpaRepository<Promo, Integer> {
    // Custom query: Temukan promo aktif berdasarkan tanggal saat ini
    Promo findByTanggalMulaiBeforeAndTanggalSelesaiAfter(java.util.Date now);
}