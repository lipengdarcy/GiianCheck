package com.witsafe.model.dbo;

import java.util.Date;

public class Individual {
    private Integer id;

    private String openid;

    private String manNo;

    private String manName;

    private String sex;

    private String manZone;

    private String manCompany;

    private Double manDose;

    private Date startdate;

    private Integer peroid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getManNo() {
        return manNo;
    }

    public void setManNo(String manNo) {
        this.manNo = manNo == null ? null : manNo.trim();
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName == null ? null : manName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getManZone() {
        return manZone;
    }

    public void setManZone(String manZone) {
        this.manZone = manZone == null ? null : manZone.trim();
    }

    public String getManCompany() {
        return manCompany;
    }

    public void setManCompany(String manCompany) {
        this.manCompany = manCompany == null ? null : manCompany.trim();
    }

    public Double getManDose() {
        return manDose;
    }

    public void setManDose(Double manDose) {
        this.manDose = manDose;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Integer getPeroid() {
        return peroid;
    }

    public void setPeroid(Integer peroid) {
        this.peroid = peroid;
    }
}