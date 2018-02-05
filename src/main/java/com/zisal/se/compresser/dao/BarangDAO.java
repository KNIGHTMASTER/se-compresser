package com.zisal.se.compresser.dao;

import com.zisal.se.compresser.entity.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created on 2/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface BarangDAO extends JpaRepository<Barang, String> {

    @Query(value = "update barang set gambar = null where idbarang = ?1", nativeQuery = true)
    void setImageNull(String p_Id);
}
