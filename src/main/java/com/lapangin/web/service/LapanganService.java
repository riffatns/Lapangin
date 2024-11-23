package com.lapangin.web.service;

import com.lapangin.web.model.Lapangan;
import com.lapangin.web.repository.LapanganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LapanganService {

    @Autowired
    private LapanganRepository lapanganRepository;

    public List<Lapangan> searchLapangan(String keyword) {
        return lapanganRepository.findAll().stream()
                .filter(lapangan -> lapangan.getNamaLapangan().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    public Lapangan getLapanganById(int lapanganID) {
        return lapanganRepository.findById(lapanganID).orElse(null);
    }
}
