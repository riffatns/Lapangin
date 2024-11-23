package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int promoID;

    private String namaPromo;
    private double diskonPersen;

    @Temporal(TemporalType.DATE)
    private Date tanggalMulai;

    @Temporal(TemporalType.DATE)
    private Date tanggalSelesai;

    public int getDiskonPersen() {
        return (int)diskonPersen/100;
    }

    // Getter & Setter
}
