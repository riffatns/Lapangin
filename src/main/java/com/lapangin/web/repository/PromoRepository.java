package com.lapangin.web.repository;

import com.lapangin.web.model.Promo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PromoRepository extends JpaRepository<Promo, Integer> {

    /**
     * Temukan semua promo yang aktif pada tanggal tertentu.
     */
    List<Promo> findByTanggalMulaiBeforeAndTanggalSelesaiAfter(Date tanggalMulai, Date tanggalSelesai);
}
