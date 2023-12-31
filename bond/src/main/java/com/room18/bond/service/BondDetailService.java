package com.room18.bond.service;

import com.room18.bond.dao.BondDetailDao;
import com.room18.common.entity.BondDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BondDetailService {
    @Autowired
    private BondDetailDao bondDetailDao;

    public List<BondDetail> getAllBondDetails() {
        return bondDetailDao.findAll();
    }

    public BondDetail getBondDetailById(Long bondDetailId) {
        return bondDetailDao.findById(bondDetailId).orElse(null);
    }

    public BondDetail saveBondDetail(BondDetail bondDetail) {
        return bondDetailDao.save(bondDetail);
    }

    public void deleteBondDetail(Long bondDetailId) {
        bondDetailDao.deleteById(bondDetailId);
    }

    public BondDetail findBondDetailByBondId(Long bondId){
        return bondDetailDao.findBondDetailByBondId(bondId);
    }

    // 其他服务方法
}