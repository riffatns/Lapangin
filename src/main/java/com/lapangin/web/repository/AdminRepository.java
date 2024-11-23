package com.lapangin.web.repository;

import com.lapangin.web.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    // Tambahkan custom query jika diperlukan
}