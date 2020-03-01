package com.jk.model;

import java.io.Serializable;

public class commModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer spid;

    private String spname;

    private String haosheng;

    private String baozhuang;

    private Double jine;

    private Integer kucunshuliang;

    private Integer yujingzhi;

    private Integer sunhuaishuliang;

    private Integer zaishoushuliang;

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname == null ? null : spname.trim();
    }

    public String getHaosheng() {
        return haosheng;
    }

    public void setHaosheng(String haosheng) {
        this.haosheng = haosheng == null ? null : haosheng.trim();
    }

    public String getBaozhuang() {
        return baozhuang;
    }

    public void setBaozhuang(String baozhuang) {
        this.baozhuang = baozhuang == null ? null : baozhuang.trim();
    }

    public Double getJine() {
        return jine;
    }

    public void setJine(Double jine) {
        this.jine = jine;
    }

    public Integer getKucunshuliang() {
        return kucunshuliang;
    }

    public void setKucunshuliang(Integer kucunshuliang) {
        this.kucunshuliang = kucunshuliang;
    }

    public Integer getYujingzhi() {
        return yujingzhi;
    }

    public void setYujingzhi(Integer yujingzhi) {
        this.yujingzhi = yujingzhi;
    }

    public Integer getSunhuaishuliang() {
        return sunhuaishuliang;
    }

    public void setSunhuaishuliang(Integer sunhuaishuliang) {
        this.sunhuaishuliang = sunhuaishuliang;
    }

    public Integer getZaishoushuliang() {
        return zaishoushuliang;
    }

    public void setZaishoushuliang(Integer zaishoushuliang) {
        this.zaishoushuliang = zaishoushuliang;
    }
}