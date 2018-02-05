package com.zisal.se.compresser;

import com.zisal.se.compresser.dao.*;
import com.zisal.se.compresser.entity.*;
import com.zisal.se.compresser.service.BarangBesarService;
import com.zisal.se.compresser.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class SeCompresserApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeCompresserApplication.class, args);
	}

	@Autowired
	private BarangService barangService;

	@Autowired
	private BarangBesarService barangBesarService;

	@Autowired
	private ReturDAO returDAO;

	@Autowired
	private BarangTokoDAO barangTokoDAO;

	@Autowired
	private TransaksPenjualanDAO transaksPenjualanDAO;

	@Autowired
	private DetailTransaksiPenjualanDAO detailTransaksiPenjualanDAO;

	@Autowired
	private DetailTransaksiTransferBarangBesarDAO detailTransaksiTransferBarangBesarDAO;

	@Autowired
	private TransaksiPenjualanBarangBesarDAO transaksiPenjualanBarangBesarDAO;

	@Autowired
	private DetailTransaksiPenjualanBarangBesarDAO detailTransaksiPenjualanBarangBesarDAO;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Start Cleaning Image DATA");
		cleanImageData();
		System.out.println("Done Cleaning Image DATA");

		System.out.println("Start Cleaning Retur DATA");
		cleanReturData();
		System.out.println("Done Cleaning Retur DATA");

		System.out.println("Start Cleaning Transaksi DATA");
		cleanTransaksiPenjualan();
		System.out.println("Done Cleaning Transaksi DATA");

		System.out.println("Start Cleaning Transfer BB DATA");
		cleanTransferBarangBesar();
		System.out.println("Done Cleaning Transfer BB DATA");

		System.out.println("Start Cleaning Transaksi BB DATA");
		cleanTransaksiBB();
		System.out.println("Done Cleaning Transaksi BB DATA");
	}

	private void cleanImageData() {
		for (Barang barang : barangService.findAll()) {
			barang.setGambar(null);
			barangService.save(barang);
		}

		for(BarangBesar barangBesar : barangBesarService.findAll()) {
			barangBesar.setGambar(null);
			barangBesarService.save(barangBesar);
		}
		for (BarangToko barangToko : barangTokoDAO.findAll()) {
			barangToko.setGambar(null);
			barangTokoDAO.save(barangToko);
		}
	}

	private void cleanReturData() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String last2017 = "31-12-2017";
		System.out.println("Retur List Total 1 : "+returDAO.findAll().size());
		System.out.println(last2017);
		List<Retur> returList = returDAO.findByTanggalBefore(last2017);
		System.out.println("Retur List Total 2 : "+returList.size());
		for (Retur retur : returList) {
			returDAO.delete(retur.getId());
		}
	}

	private void cleanTransaksiPenjualan() {
		String last2017 = "31-12-2017";
		for (TransaksiPenjualan transaksiPenjualan : transaksPenjualanDAO.findTanggalBefore(last2017)) {
			transaksPenjualanDAO.delete(transaksiPenjualan.getIdTransaksi());
		}

		for (DetailTransaksiPenjualan detailTransaksiPenjualan : detailTransaksiPenjualanDAO.findTanggalBefore(last2017)) {
			detailTransaksiPenjualanDAO.delete(detailTransaksiPenjualan.getIdDetailTransaksi());
		}
	}

	private void cleanTransferBarangBesar() {
		String last2017 = "31-12-2017";
		for (DetailTransaksiTransferBarangBesar detailTransaksiTransferBarangBesar : detailTransaksiTransferBarangBesarDAO.findTanggalBefore(last2017)) {
			detailTransaksiTransferBarangBesarDAO.delete(detailTransaksiTransferBarangBesar.getIddetailtransaksi());
		}
	}

	private void cleanTransaksiBB () {
		String last2017 = "31-12-2017";
		for (TransaksiPenjualanBarangBesar transaksiPenjualanBarangBesar : transaksiPenjualanBarangBesarDAO.findTanggalBefore(last2017)) {
			transaksiPenjualanBarangBesarDAO.delete(transaksiPenjualanBarangBesar.getIdTransaksi());
		}
		for (DetailTransaksiPenjualanBarangBesar detailTransaksiPenjualanBarangBesar : detailTransaksiPenjualanBarangBesarDAO.findTanggalBefore(last2017)) {
			detailTransaksiPenjualanBarangBesarDAO.delete(detailTransaksiPenjualanBarangBesar.getIdDetailTransaksi());
		}
	}
}
