package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Lapangan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lapanganID;

    private String namaLapangan;
    private String lokasi;
    private double hargaPerJam;

    @OneToMany(mappedBy = "lapangan")
    private List<Review> reviews;

    // Getter & Setter
    public int getLapanganID() {
        return lapanganID;
    }

    public void setLapanganID(int lapanganID) {
        this.lapanganID = lapanganID;
    }

    public String getNamaLapangan() {
        return namaLapangan;
    }

    public void setNamaLapangan(String namaLapangan) {
        this.namaLapangan = namaLapangan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public double getHargaPerJam() {
        return hargaPerJam;
    }

    public void setHargaPerJam(double hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }
}
