package com.lapangin.web.service;

import com.bookinglapangan.model.Admin;
import com.bookinglapangan.model.Lapangan;
import com.bookinglapangan.model.Promo;
import com.bookinglapangan.repository.AdminRepository;
import com.bookinglapangan.repository.LapanganRepository;
import com.bookinglapangan.repository.PromoRepository;
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
