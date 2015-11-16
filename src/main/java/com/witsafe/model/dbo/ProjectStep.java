package com.witsafe.model.dbo;

import java.util.Date;

public class ProjectStep {
    private Integer id;

    private Integer projectid;

    private String stepname;

    private Integer ptype;

    private Integer status;

    private Date statustime;

    private Date createtime;

    private String createuserid;

    private String stepdescrip;

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

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStatustime() {
        return statustime;
    }

    public void setStatustime(Date statustime) {
        this.statustime = statustime;
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

    public String getStepdescrip() {
        return stepdescrip;
    }

    public void setStepdescrip(String stepdescrip) {
        this.stepdescrip = stepdescrip == null ? null : stepdescrip.trim();
    }
}