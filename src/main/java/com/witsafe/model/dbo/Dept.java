package com.witsafe.model.dbo;

import java.util.Date;

public class Dept {
    private Integer id;

    private String deptname;

    private Integer fatherid;

    private String qrcodeimgurl;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    public String getQrcodeimgurl() {
        return qrcodeimgurl;
    }

    public void setQrcodeimgurl(String qrcodeimgurl) {
        this.qrcodeimgurl = qrcodeimgurl == null ? null : qrcodeimgurl.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}