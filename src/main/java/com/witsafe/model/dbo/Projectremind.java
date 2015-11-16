package com.witsafe.model.dbo;

import java.util.Date;

public class Projectremind {
    private Integer id;

    private Integer projectid;

    private String projectname;

    private Integer stepid;

    private Integer isLook;

    private String stepname;

    private Date createtime;

    private String createuserid;

    private String reminddescrip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getStepid() {
        return stepid;
    }

    public void setStepid(Integer stepid) {
        this.stepid = stepid;
    }

    public Integer getIsLook() {
        return isLook;
    }

    public void setIsLook(Integer isLook) {
        this.isLook = isLook;
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
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

    public String getReminddescrip() {
        return reminddescrip;
    }

    public void setReminddescrip(String reminddescrip) {
        this.reminddescrip = reminddescrip == null ? null : reminddescrip.trim();
    }
}