package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Pesanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pesananID;

    @ManyToOne
    @JoinColumn(name = "lapanganID", nullable = false)
    private Lapangan lapangan;

    @ManyToOne
    @JoinColumn(name = "customerID", nullable = false)
    private Customer customer;

    private Date tanggalPesan;
    private int jamMulai;
    private int jamSelesai;
    private double totalHarga;

    @ManyToOne
    @JoinColumn(name = "promoID")
    private Promo promo;

    // Getter & Setter
}
