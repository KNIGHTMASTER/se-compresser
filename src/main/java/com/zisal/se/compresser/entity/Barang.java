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
@Table(name = "barang")
public class Barang {

    private String idBarang;
    private String idBarcode;
    private String namaBarang;
    private String tipe;
    private String merek;
    private BigDecimal hargaModal;
    private BigDecimal grosir;
    private BigDecimal grosir2;
    private BigDecimal eceran;
    private String satuan;
    private Integer stok;
    private Integer stokMinimum;
    private String supplier;
    private String keterangan;
    private Byte[] gambar;
    private String garansi;
    private Integer lamaGaransi;
    private String kategori;

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

    @Column(name = "hargamodal")
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

    @Column(name = "grosir2")
    public BigDecimal getGrosir2() {
        return grosir2;
    }

    public void setGrosir2(BigDecimal grosir2) {
        this.grosir2 = grosir2;
    }

    @Column(name = "eceran")
    public BigDecimal getEceran() {
        return eceran;
    }

    public void setEceran(BigDecimal eceran) {
        this.eceran = eceran;
    }

    @Column(name = "satuan")
    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
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

    @Column(name = "kategori")
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
