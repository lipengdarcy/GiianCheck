package com.witsafe.model.dbo;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Integer id;

    private String title;

    private String no;

    private String tocompany;

    private Date totime;

    private Integer state;

    private Integer ptype;

    private BigDecimal contractamount;

    private String thecontact;

    private String contactphone;

    private Date createtime;

    private String createuserid;

    private String projectbz;

    private Integer premind;

    private String projectmy;

    private String projectinfo;

    private String equipment;

    private String zone;

    private Date finishtime;

    private Integer finish;

    private String projectbzlist;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getTocompany() {
        return tocompany;
    }

    public void setTocompany(String tocompany) {
        this.tocompany = tocompany == null ? null : tocompany.trim();
    }

    public Date getTotime() {
        return totime;
    }

    public void setTotime(Date totime) {
        this.totime = totime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public BigDecimal getContractamount() {
        return contractamount;
    }

    public void setContractamount(BigDecimal contractamount) {
        this.contractamount = contractamount;
    }

    public String getThecontact() {
        return thecontact;
    }

    public void setThecontact(String thecontact) {
        this.thecontact = thecontact == null ? null : thecontact.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getProjectbz() {
        return projectbz;
    }

    public void setProjectbz(String projectbz) {
        this.projectbz = projectbz == null ? null : projectbz.trim();
    }

    public Integer getPremind() {
        return premind;
    }

    public void setPremind(Integer premind) {
        this.premind = premind;
    }

    public String getProjectmy() {
        return projectmy;
    }

    public void setProjectmy(String projectmy) {
        this.projectmy = projectmy == null ? null : projectmy.trim();
    }

    public String getProjectinfo() {
        return projectinfo;
    }

    public void setProjectinfo(String projectinfo) {
        this.projectinfo = projectinfo == null ? null : projectinfo.trim();
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment == null ? null : equipment.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    public String getProjectbzlist() {
        return projectbzlist;
    }

    public void setProjectbzlist(String projectbzlist) {
        this.projectbzlist = projectbzlist == null ? null : projectbzlist.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}