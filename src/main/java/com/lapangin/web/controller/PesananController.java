package com.lapangin.web.controller;

import com.lapangin.web.model.Pesanan;
import com.lapangin.web.service.PesananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pesanan")
public class PesananController {

    @Autowired
    private PesananService pesananService;

    @PostMapping("/book")
    public Pesanan bookLapangan(@RequestBody Pesanan pesanan) {
        return pesananService.bookLapangan(pesanan);
    }

    @GetMapping("/{pesananID}/totalPrice")
    public double calculateTotalPrice(@PathVariable int pesananID) {
        Pesanan pesanan = pesananService.getPesananById(pesananID);
        return pesananService.calculateTotalPrice(pesanan);
    }
}
