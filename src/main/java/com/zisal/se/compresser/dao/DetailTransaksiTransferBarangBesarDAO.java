package com.zisal.se.compresser.dao;

import com.zisal.se.compresser.entity.DetailTransaksiTransferBarangBesar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface DetailTransaksiTransferBarangBesarDAO extends JpaRepository<DetailTransaksiTransferBarangBesar, String> {

    @Query(value = "select * from detailtransaksitransferbb where tanggal <= :tanggal", nativeQuery = true)
    List<DetailTransaksiTransferBarangBesar> findTanggalBefore(@Param("tanggal") String p_Tanggal);
}
