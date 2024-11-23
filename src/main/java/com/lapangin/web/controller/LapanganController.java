package com.lapangin.web.controller;

import com.lapangin.web.model.Lapangan;
import com.lapangin.web.service.LapanganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lapangan")
public class LapanganController {

    @Autowired
    private LapanganService lapanganService;

    @GetMapping("/search")
    public List<Lapangan> searchLapangan(@RequestParam String keyword) {
        return lapanganService.searchLapangan(keyword);
    }

    @GetMapping("/{lapanganID}")
    public Lapangan getLapanganById(@PathVariable int lapanganID) {
        return lapanganService.getLapanganById(lapanganID);
    }
}
