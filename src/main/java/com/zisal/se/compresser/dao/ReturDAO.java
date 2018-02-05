package com.zisal.se.compresser.dao;

import com.zisal.se.compresser.entity.Retur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ReturDAO extends JpaRepository<Retur, Integer> {

    /*str_to_date(:tanggal, '%d-%m-%Y') */

    @Query(value = "select * from retur where tanggal <= :tanggal", nativeQuery = true)
    List<Retur> findByTanggalBefore(@Param("tanggal") String p_Tanggal);
}
