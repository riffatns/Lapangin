package com.lapangin.web.repository;

import com.lapangin.web.model.Lapangan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LapanganRepository extends JpaRepository<Lapangan, Integer> {
    // Tambahkan custom query jika diperlukan
    Lapangan findByNamaLapangan(String namaLapangan);
}