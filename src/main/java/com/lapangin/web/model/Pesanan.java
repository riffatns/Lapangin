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

    public Lapangan getLapangan() {
        return lapangan;
    }

    public int getJamSelesai() {
        return jamSelesai;
    }

    public int getJamMulai() {
        return jamMulai;
    }

    public Promo getPromo() {
        return promo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getTanggalPesan() {
        return tanggalPesan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public int getPesananID() {
        return pesananID;
    }

    public void setLapangan(Lapangan lapangan) {
        this.lapangan = lapangan;
    }

    public void setJamSelesai(int jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public void setJamMulai(int jamMulai) {
        this.jamMulai = jamMulai;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void setPesananID(int pesananID) {
        this.pesananID = pesananID;
    }
}
