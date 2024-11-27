package com.lapangin.web.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int promoID;

    private String namaPromo;
    private double diskonPersen; // Tetap double jika diskon bisa dalam desimal, misal 12.5%

    @Temporal(TemporalType.DATE)
    private Date tanggalMulai;

    @Temporal(TemporalType.DATE)
    private Date tanggalSelesai;

    // Getter & Setter
    public int getPromoID() {
        return promoID;
    }

    public void setPromoID(int promoID) {
        this.promoID = promoID;
    }

    public String getNamaPromo() {
        return namaPromo;
    }

    public void setNamaPromo(String namaPromo) {
        this.namaPromo = namaPromo;
    }

    public double getDiskonPersen() {
        return diskonPersen;
    }

    public void setDiskonPersen(double diskonPersen) {
        this.diskonPersen = diskonPersen;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
}
