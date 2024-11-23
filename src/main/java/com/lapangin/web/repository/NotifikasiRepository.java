package com.lapangin.web.repository;

import com.lapangin.web.model.Notifikasi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotifikasiRepository extends JpaRepository<Notifikasi, Integer> {
    // Custom query: Temukan notifikasi berdasarkan status terkirim
    List<Notifikasi> findByStatusTerkirim(boolean status);
}