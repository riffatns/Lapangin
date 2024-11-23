package com.lapangin.web.controller;

import com.lapangin.web.model.Notifikasi;
import com.lapangin.web.service.NotifikasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifikasi")
public class NotifikasiController {

    @Autowired
    private NotifikasiService notifikasiService;

    @PostMapping("/send")
    public Notifikasi sendNotification(@RequestBody Notifikasi notifikasi) {
        return notifikasiService.sendNotification(notifikasi);
    }

    @GetMapping("/pending")
    public List<Notifikasi> getPendingNotifications() {
        return notifikasiService.getPendingNotifications();
    }
}
