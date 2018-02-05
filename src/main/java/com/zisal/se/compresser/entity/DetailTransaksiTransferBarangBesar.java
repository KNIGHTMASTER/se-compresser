package com.zisal.se.compresser.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "detailtransaksitransferbb")
public class DetailTransaksiTransferBarangBesar {

    private String iddetailtransaksi;
    private String user;
    private Date tanggal;
    private String jam;
    private String kode;
    private String namaBarang;
    private Integer jumlah;

    @Id
    @Column(name = "iddetailtransaksi")
    public String getIddetailtransaksi() {
        return iddetailtransaksi;
    }

    public void setIddetailtransaksi(String iddetailtransaksi) {
        this.iddetailtransaksi = iddetailtransaksi;
    }

    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal")
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Column(name = "jam")
    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Column(name = "kode")
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Column(name = "namaBarang")
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Column(name = "jumlah")
    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
