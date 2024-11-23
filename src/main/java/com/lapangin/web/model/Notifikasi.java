package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Notifikasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notifikasiID;

    @OneToOne
    @JoinColumn(name = "pesananID", nullable = false)
    private Pesanan pesanan;

    private Date waktuNotifikasi;
    private boolean statusTerkirim;

    public void setStatusTerkirim(boolean b) {

    }

    // Getter & Setter
}
