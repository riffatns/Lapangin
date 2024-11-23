package com.lapangin.web.service;

import com.lapangin.web.model.Promo;
import com.lapangin.web.repository.PromoRepository;
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
