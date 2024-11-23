package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewID;

    @ManyToOne
    @JoinColumn(name = "lapanganID", nullable = false)
    private Lapangan lapangan;

    @ManyToOne
    @JoinColumn(name = "pesananID", nullable = false)
    private Pesanan pesanan;

    private int rating;
    private String komentar;

    @Temporal(TemporalType.DATE)
    private Date tanggalReview;

    // Getter & Setter
}
