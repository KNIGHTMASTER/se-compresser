package com.zisal.se.compresser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "barangtoko")
public class BarangToko {

    private String idBarang;
    private String idBarcode;
    private String namaBarang;
    private String tipe;
    private String merek;
    private BigDecimal hargaModal;
    private BigDecimal grosir;
    private BigDecimal eceran;
    private Integer stok;
    private Integer stokMinimum;
    private String supplier;
    private String keterangan;
    private Byte[] gambar;
    private String garansi;
    private Integer lamaGaransi;

    @Id
    @Column(name = "idbarang")
    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    @Column(name = "idbarcode")
    public String getIdBarcode() {
        return idBarcode;
    }

    public void setIdBarcode(String idBarcode) {
        this.idBarcode = idBarcode;
    }

    @Column(name = "namabarang")
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    @Column(name = "tipe")
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Column(name = "merek")
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    @Column(name = "modal")
    public BigDecimal getHargaModal() {
        return hargaModal;
    }

    public void setHargaModal(BigDecimal hargaModal) {
        this.hargaModal = hargaModal;
    }

    @Column(name = "grosir")
    public BigDecimal getGrosir() {
        return grosir;
    }

    public void setGrosir(BigDecimal grosir) {
        this.grosir = grosir;
    }

    @Column(name = "eceran")
    public BigDecimal getEceran() {
        return eceran;
    }

    public void setEceran(BigDecimal eceran) {
        this.eceran = eceran;
    }

    @Column(name = "stok")
    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    @Column(name = "stok_minimum")
    public Integer getStokMinimum() {
        return stokMinimum;
    }

    public void setStokMinimum(Integer stokMinimum) {
        this.stokMinimum = stokMinimum;
    }

    @Column(name = "supplier")
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Column(name = "keterangan")
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Column(name = "gambar")
    public Byte[] getGambar() {
        return gambar;
    }

    public void setGambar(Byte[] gambar) {
        this.gambar = gambar;
    }

    @Column(name = "garansi")
    public String getGaransi() {
        return garansi;
    }

    public void setGaransi(String garansi) {
        this.garansi = garansi;
    }

    @Column(name = "lamagaransi")
    public Integer getLamaGaransi() {
        return lamaGaransi;
    }

    public void setLamaGaransi(Integer lamaGaransi) {
        this.lamaGaransi = lamaGaransi;
    }

}
