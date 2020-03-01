package com.jk.service;

import com.jk.model.FacModel;
import com.jk.model.commModel;
import com.jk.model.countModel;
import com.jk.model.repModel;

import java.util.List;

public interface FacService {
    List<FacModel> toFacility();

    List<countModel> querySheBei();

    void addfacility(countModel countmodel);

    List<repModel> queryRuKu();

    List<commModel> ShangPinPanDian();
}
