package com.jk.model;


import java.io.Serializable;

public class FacModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer facilityid;

    private String facilityname;

    private String facilitybaoxiu;

    private String facilityimg;

    private String facilitybeizhu;

    private Integer facilitysuoding;

    public Integer getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(Integer facilityid) {
        this.facilityid = facilityid;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname == null ? null : facilityname.trim();
    }

    public String getFacilitybaoxiu() {
        return facilitybaoxiu;
    }

    public void setFacilitybaoxiu(String facilitybaoxiu) {
        this.facilitybaoxiu = facilitybaoxiu == null ? null : facilitybaoxiu.trim();
    }

    public String getFacilityimg() {
        return facilityimg;
    }

    public void setFacilityimg(String facilityimg) {
        this.facilityimg = facilityimg == null ? null : facilityimg.trim();
    }

    public String getFacilitybeizhu() {
        return facilitybeizhu;
    }

    public void setFacilitybeizhu(String facilitybeizhu) {
        this.facilitybeizhu = facilitybeizhu == null ? null : facilitybeizhu.trim();
    }

    public Integer getFacilitysuoding() {
        return facilitysuoding;
    }

    public void setFacilitysuoding(Integer facilitysuoding) {
        this.facilitysuoding = facilitysuoding;
    }
}