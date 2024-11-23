package com.lapangin.web.service;

import com.bookinglapangan.model.Pesanan;
import com.bookinglapangan.model.Promo;
import com.bookinglapangan.repository.PesananRepository;
import com.bookinglapangan.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesananService {

    @Autowired
    private PesananRepository pesananRepository;

    @Autowired
    private PromoRepository promoRepository;

    public Pesanan bookLapangan(Pesanan pesanan) {
        return pesananRepository.save(pesanan);
    }

    public double calculateTotalPrice(Pesanan pesanan) {
        double basePrice = pesanan.getLapangan().getHargaPerJam() * (pesanan.getJamSelesai() - pesanan.getJamMulai());
        Promo promo = pesanan.getPromo();
        return promo != null ? basePrice * (1 - promo.getDiskonPersen() / 100) : basePrice;
    }
}
