package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.FacModelMapper;
import com.jk.mapper.commModelMapper;
import com.jk.mapper.countModelMapper;
import com.jk.mapper.repModelMapper;
import com.jk.model.FacModel;
import com.jk.model.commModel;
import com.jk.model.countModel;
import com.jk.model.repModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = FacService.class)
@Component//把当前的类注入spring容器
public class FacServiceImpl implements FacService{

    @Autowired
    private FacModelMapper fmm;

    @Autowired
    private countModelMapper cmm;

    @Autowired
    private repModelMapper rmm;

    @Autowired
    private commModelMapper comm;

    /*设备保修下拉框*/
    @Override
    public List<FacModel> toFacility() {
        return fmm.toFacility();
    }

    /*货柜管理*/
    @Override
    public List<countModel> querySheBei() {
        return cmm.querySheBei();
    }

    /*入库管理*/
    @Override
    public List<repModel> queryRuKu() {
        return rmm.queryRuKu();
    }

    @Override
    public List<commModel> ShangPinPanDian() {
        return comm.ShangPinPanDian();
    }

    /*设备保修*/
    @Override
    public void addfacility(countModel countmodel) {
      fmm.addfacility(countmodel);
    }


}
