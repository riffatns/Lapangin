package com.lapangin.web.controller;

import com.lapangin.web.model.Promo;
import com.lapangin.web.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat; // Pastikan ini diimpor
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/promos") // Gunakan ini pada level kelas
public class PromoController {

    @Autowired
    private PromoService promoService;

    /**
     * Endpoint untuk mengambil promo yang aktif di antara rentang tanggal tertentu.
     * @param startDate tanggal mulai (opsional, default ke hari ini)
     * @param endDate   tanggal akhir (opsional, default ke hari ini)
     * @return Daftar promo yang aktif
     */
    @GetMapping("/active")
    public List<Promo> getActivePromos(
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        // Default jika tidak ada parameter
        if (startDate == null) {
            startDate = new Date(); // tanggal saat ini
        }
        if (endDate == null) {
            endDate = new Date(); // tanggal saat ini
        }

        return promoService.getActivePromos(startDate, endDate);
    }
}
