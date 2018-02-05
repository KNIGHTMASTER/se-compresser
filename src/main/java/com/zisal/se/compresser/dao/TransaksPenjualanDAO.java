package com.zisal.se.compresser.dao;

import com.zisal.se.compresser.entity.TransaksiPenjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface TransaksPenjualanDAO extends JpaRepository<TransaksiPenjualan, Integer> {

    @Query(value = "select * from transaksipenjualan where tanggal <= :tanggal", nativeQuery = true)
    List<TransaksiPenjualan> findTanggalBefore(@Param("tanggal") String p_Tanggal);
}
