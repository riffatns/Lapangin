package com.lapangin.web.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // Halaman utama setelah login (Dashboard)
    @GetMapping("/home")
    public String showHomePage(Model model) {
        return "home"; // Menampilkan halaman dashboard atau halaman utama
    }

    // Halaman pemesanan lapangan
    @GetMapping("/booking")
    public String showBookingPage(Model model) {
        return "booking";  // Menampilkan halaman booking lapangan
    }

    // Proses pemesanan lapangan
    @PostMapping("/booking")
    public String processBooking(@RequestParam String lapangan, @RequestParam String waktu) {
        // Proses pemesanan lapangan
        return "redirect:/home"; // Redirect ke halaman utama setelah pemesanan
    }

    // Halaman riwayat pemesanan
    @GetMapping("/history")
    public String showHistory(Model model) {
        return "history";  // Menampilkan halaman riwayat pemesanan
    }
}
