package com.lapangin.web.controller;

import com.lapangin.web.model.Admin;
import com.lapangin.web.model.Lapangan;
import com.lapangin.web.model.Promo;
import com.lapangin.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public Admin registerAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @PostMapping("/lapangan")
    public Lapangan createLapangan(@RequestBody Lapangan lapangan) {
        return adminService.createLapangan(lapangan);
    }

    @PostMapping("/promo")
    public Promo createPromo(@RequestBody Promo promo) {
        return adminService.createPromo(promo);
    }
}
