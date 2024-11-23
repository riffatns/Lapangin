package com.lapangin.web.repository;

import com.lapangin.web.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Tambahkan custom query jika diperlukan
}