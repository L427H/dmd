package com.jk.model;

import java.io.Serializable;

public class countModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer counterid;

    private String shebeibianma;

    private String guijizhuangtai;

    private String shebeiname;

    private Integer shangpinzhuangtai;

    private String counterdizhi;

    private String dangqiandizhi;

    private String quehuishuliang;

    public Integer getCounterid() {
        return counterid;
    }

    public void setCounterid(Integer counterid) {
        this.counterid = counterid;
    }

    public String getShebeibianma() {
        return shebeibianma;
    }

    public void setShebeibianma(String shebeibianma) {
        this.shebeibianma = shebeibianma == null ? null : shebeibianma.trim();
    }

    public String getGuijizhuangtai() {
        return guijizhuangtai;
    }

    public void setGuijizhuangtai(String guijizhuangtai) {
        this.guijizhuangtai = guijizhuangtai == null ? null : guijizhuangtai.trim();
    }

    public String getShebeiname() {
        return shebeiname;
    }

    public void setShebeiname(String shebeiname) {
        this.shebeiname = shebeiname == null ? null : shebeiname.trim();
    }

    public Integer getShangpinzhuangtai() {
        return shangpinzhuangtai;
    }

    public void setShangpinzhuangtai(Integer shangpinzhuangtai) {
        this.shangpinzhuangtai = shangpinzhuangtai;
    }

    public String getCounterdizhi() {
        return counterdizhi;
    }

    public void setCounterdizhi(String counterdizhi) {
        this.counterdizhi = counterdizhi == null ? null : counterdizhi.trim();
    }

    public String getDangqiandizhi() {
        return dangqiandizhi;
    }

    public void setDangqiandizhi(String dangqiandizhi) {
        this.dangqiandizhi = dangqiandizhi == null ? null : dangqiandizhi.trim();
    }

    public String getQuehuishuliang() {
        return quehuishuliang;
    }

    public void setQuehuishuliang(String quehuishuliang) {
        this.quehuishuliang = quehuishuliang;
    }
}