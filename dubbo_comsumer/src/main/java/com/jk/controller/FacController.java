package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.FacModel;
import com.jk.model.commModel;
import com.jk.model.countModel;
import com.jk.model.repModel;
import com.jk.service.FacService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("dmd")
@ComponentScan(basePackages = {"com.jk.*"})
public class FacController {

    @Reference
    private FacService fs;

    @RequestMapping("dzym")
    public String dzym(){
        return "e_1设备管理";
    }

    @RequestMapping("fanhui")
    public String fanhui(){
        return "e_柜机管理";
    }

    @RequestMapping("fhsy")
    public String fanhuisy(){
        return "a_2首页";
    }

    @RequestMapping("rkgl")
    public String tzrkgl(){
        return "e_2入库管理";
    }

    @RequestMapping("ckgl")
    public String tzckgl(){
        return "e_3出库管理";
    }

    @RequestMapping("ckpd")
    public String tzckpd(){
        return "e_4库存盘点";
    }

    @RequestMapping("kcck")
    public String tzkcck(){
        return "e_5库存查看";
    }

    /*货柜管理*/
    @RequestMapping("querySheBei")
    @ResponseBody
    public List<countModel> querySheBei(){
        List<countModel> list = fs.querySheBei();
        return list;
    }

    /*入库管理*/
    @RequestMapping("queryRuKu")
    @ResponseBody
    public List<repModel> queryRuKu(){
        List<repModel> list = fs.queryRuKu();
        return list;
    }

    /*设备保修下拉框*/
    @RequestMapping("toFacility")
    @ResponseBody
    public List<FacModel> toFacility(){
        return fs.toFacility();
    }

    /*设备保修*/
    @RequestMapping("addfacility")
    @ResponseBody
    public void addfacility(countModel countmodel){
        fs.addfacility(countmodel);
    }

    /*盘点详情*/
    @RequestMapping("queryShangPin")
    @ResponseBody
    public List<commModel> ShangPinPanDian(){
        List<commModel> list = fs.ShangPinPanDian();
        return list ;
    }

}
