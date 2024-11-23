package com.lapangin.web.service;

import com.lapangin.web.model.Admin;
import com.lapangin.web.model.Lapangan;
import com.lapangin.web.model.Promo;
import com.lapangin.web.repository.AdminRepository;
import com.lapangin.web.repository.LapanganRepository;
import com.lapangin.web.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private LapanganRepository lapanganRepository;

    @Autowired
    private PromoRepository promoRepository;

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Lapangan createLapangan(Lapangan lapangan) {
        return lapanganRepository.save(lapangan);
    }

    public Promo createPromo(Promo promo) {
        return promoRepository.save(promo);
    }
}
