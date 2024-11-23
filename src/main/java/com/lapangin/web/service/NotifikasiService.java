package com.lapangin.web.service;

import com.lapangin.web.model.Notifikasi;
import com.lapangin.web.repository.NotifikasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotifikasiService {

    @Autowired
    private NotifikasiRepository notifikasiRepository;

    public Notifikasi sendNotification(Notifikasi notifikasi) {
        notifikasi.setStatusTerkirim(true);
        return notifikasiRepository.save(notifikasi);
    }

    public List<Notifikasi> getPendingNotifications() {
        return notifikasiRepository.findByStatusTerkirim(false);
    }
}
