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
@Table(name = "transaksipenjualanbarangbesar")
public class TransaksiPenjualanBarangBesar {

    private Integer idTransaksi;
    private String user;
    private Date tanggal;
    private Date jam;
    private BigDecimal total;
    private BigDecimal pembayaran;
    private BigDecimal sisa;
    private BigDecimal profit;
    private String penjual;
    private BigDecimal bonusLangsung;
    private BigDecimal bonusKumulatif;

    @Id
    @Column(name = "idtransaksi")
    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "Tanggal")
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Temporal(TemporalType.TIME)
    @Column(name = "jam")
    public Date getJam() {
        return jam;
    }

    public void setJam(Date jam) {
        this.jam = jam;
    }

    @Column(name = "total")
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Column(name = "pembayaran")
    public BigDecimal getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(BigDecimal pembayaran) {
        this.pembayaran = pembayaran;
    }

    @Column(name = "sisa")
    public BigDecimal getSisa() {
        return sisa;
    }

    public void setSisa(BigDecimal sisa) {
        this.sisa = sisa;
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
