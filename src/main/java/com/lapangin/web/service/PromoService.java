package com.lapangin.web.service;

import com.bookinglapangan.model.Promo;
import com.bookinglapangan.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PromoService {

    @Autowired
    private PromoRepository promoRepository;

    public Promo getActivePromo() {
        Date now = new Date();
        return promoRepository.findByTanggalMulaiBeforeAndTanggalSelesaiAfter(now);
    }
}
