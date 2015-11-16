package com.witsafe.model.dbo;

public class WReplykeyword {
    private Integer id;

    private Integer siteid;

    private Short type;

    private Short isfirst;

    private Short matchtype;

    private String keywords;

    private Integer apptype;

    private Integer appid;

    private Integer ismass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(Short isfirst) {
        this.isfirst = isfirst;
    }

    public Short getMatchtype() {
        return matchtype;
    }

    public void setMatchtype(Short matchtype) {
        this.matchtype = matchtype;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Integer getApptype() {
        return apptype;
    }

    public void setApptype(Integer apptype) {
        this.apptype = apptype;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getIsmass() {
        return ismass;
    }

    public void setIsmass(Integer ismass) {
        this.ismass = ismass;
    }
}