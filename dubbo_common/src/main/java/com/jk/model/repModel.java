package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class repModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer repertoryid;

    private String rukudanbianhao;

    private String rukuhuogui;

    private Date rukushijian;

    private String caozuoren;

    private String rukuzhuangtai;

    private String shangpinmingcheng;

    private Integer rukushuliang;

    private Integer shijishuliang;

    private String shangpintupian;

    private String haosheng;

    private Double jine;

    private String shuliang;

    private String rukuyuanyin;

    public String getRukuyuanyin() {
        return rukuyuanyin;
    }

    public void setRukuyuanyin(String rukuyuanyin) {
        this.rukuyuanyin = rukuyuanyin;
    }

    public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
    }

    public String getRukudanbianhao() {
        return rukudanbianhao;
    }

    public void setRukudanbianhao(String rukudanbianhao) {
        this.rukudanbianhao = rukudanbianhao == null ? null : rukudanbianhao.trim();
    }

    public String getRukuhuogui() {
        return rukuhuogui;
    }

    public void setRukuhuogui(String rukuhuogui) {
        this.rukuhuogui = rukuhuogui == null ? null : rukuhuogui.trim();
    }

    public Date getRukushijian() {
        return rukushijian;
    }

    public void setRukushijian(Date rukushijian) {
        this.rukushijian = rukushijian;
    }

    public String getCaozuoren() {
        return caozuoren;
    }

    public void setCaozuoren(String caozuoren) {
        this.caozuoren = caozuoren == null ? null : caozuoren.trim();
    }

    public String getRukuzhuangtai() {
        return rukuzhuangtai;
    }

    public void setRukuzhuangtai(String rukuzhuangtai) {
        this.rukuzhuangtai = rukuzhuangtai == null ? null : rukuzhuangtai.trim();
    }

    public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }

    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
    }

    public Integer getRukushuliang() {
        return rukushuliang;
    }

    public void setRukushuliang(Integer rukushuliang) {
        this.rukushuliang = rukushuliang;
    }

    public Integer getShijishuliang() {
        return shijishuliang;
    }

    public void setShijishuliang(Integer shijishuliang) {
        this.shijishuliang = shijishuliang;
    }

    public String getShangpintupian() {
        return shangpintupian;
    }

    public void setShangpintupian(String shangpintupian) {
        this.shangpintupian = shangpintupian == null ? null : shangpintupian.trim();
    }

    public String getHaosheng() {
        return haosheng;
    }

    public void setHaosheng(String haosheng) {
        this.haosheng = haosheng == null ? null : haosheng.trim();
    }

    public Double getJine() {
        return jine;
    }

    public void setJine(Double jine) {
        this.jine = jine;
    }

    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang == null ? null : shuliang.trim();
    }
}