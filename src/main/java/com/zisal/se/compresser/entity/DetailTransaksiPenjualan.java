package com.zisal.se.compresser.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "detailtransaksipenjualan")
public class DetailTransaksiPenjualan {

    private String idDetailTransaksi;
    private String user;
    private Date tanggal;
    private String jam;
    private String kode;
    private String namaBarang;
    private Integer jumlah;
    private BigDecimal harga;
    private BigDecimal modal;
    private BigDecimal potongan;
    private BigDecimal tambahan;
    private BigDecimal total;
    private BigDecimal profit;
    private String penjual;
    private BigDecimal bonusLangsung;
    private BigDecimal bonusKumulatif;

    @Id
    @Column(name = "iddetailtransaksi")
    public String getIdDetailTransaksi() {
        return idDetailTransaksi;
    }

    public void setIdDetailTransaksi(String idDetailTransaksi) {
        this.idDetailTransaksi = idDetailTransaksi;
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

    @Column(name = "harga")
    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    @Column(name = "modal")
    public BigDecimal getModal() {
        return modal;
    }

    public void setModal(BigDecimal modal) {
        this.modal = modal;
    }

    @Column(name = "potongan")
    public BigDecimal getPotongan() {
        return potongan;
    }

    public void setPotongan(BigDecimal potongan) {
        this.potongan = potongan;
    }

    @Column(name = "tambahan")
    public BigDecimal getTambahan() {
        return tambahan;
    }

    public void setTambahan(BigDecimal tambahan) {
        this.tambahan = tambahan;
    }

    @Column(name = "total")
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Column(name = "profit")
    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    @Column(name = "penjual")
    public String getPenjual() {
        return penjual;
    }

    public void setPenjual(String penjual) {
        this.penjual = penjual;
    }

    @Column(name = "bonuslangsung")
    public BigDecimal getBonusLangsung() {
        return bonusLangsung;
    }

    public void setBonusLangsung(BigDecimal bonusLangsung) {
        this.bonusLangsung = bonusLangsung;
    }

    @Column(name = "bonuskumulatif")
    public BigDecimal getBonusKumulatif() {
        return bonusKumulatif;
    }

    public void setBonusKumulatif(BigDecimal bonusKumulatif) {
        this.bonusKumulatif = bonusKumulatif;
    }
}
