package com.lapangin.web.controller;

import com.lapangin.web.model.Promo;
import com.lapangin.web.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/promo")
public class PromoController {

    @Autowired
    private PromoService promoService;

    @GetMapping("/active")
    public Promo getActivePromo() {
        return promoService.getActivePromo();
    }
}
