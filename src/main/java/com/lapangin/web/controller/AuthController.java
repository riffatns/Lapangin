package com.lapangin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    // Halaman login
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Proses login
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Proses autentikasi
        return "redirect:/home";  // Redirect ke halaman utama setelah login sukses
    }

    // Halaman logout
    @GetMapping("/logout")
    public String logout() {
        // Logout logic
        return "redirect:/login"; // Redirect ke halaman login
    }
}
