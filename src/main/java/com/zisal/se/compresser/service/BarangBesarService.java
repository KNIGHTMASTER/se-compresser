package com.zisal.se.compresser.service;

import com.zisal.se.compresser.dao.BarangBesarDAO;
import com.zisal.se.compresser.entity.BarangBesar;
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
public class BarangBesarService {

    @Autowired
    private BarangBesarDAO barangBesarDAO;

    @Transactional
    public void setImageNull(String p_Id) {
        barangBesarDAO.setImageNull(p_Id);
    }

    public List<BarangBesar> findAll() {
        return barangBesarDAO.findAll();
    }

    @Transactional
    public void save(BarangBesar p_BarangBesar) {
        barangBesarDAO.save(p_BarangBesar);
    }
}
