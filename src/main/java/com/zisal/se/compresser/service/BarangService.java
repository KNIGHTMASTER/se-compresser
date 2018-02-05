package com.zisal.se.compresser.service;

import com.zisal.se.compresser.dao.BarangDAO;
import com.zisal.se.compresser.entity.Barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 2/5/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class BarangService {

    @Autowired
    private BarangDAO barangDAO;

    @Transactional
    public void save(Barang p_Barang) {
        barangDAO.save(p_Barang);
    }

    public List<Barang> findAll() {
        return barangDAO.findAll();
    }
}
