package com.witsafe.model.dbo;

import java.util.Date;

public class SysNews {
    private Integer id;

    private String title;

    private String titletype;

    private String picpath;

    private String descrip;

    private String newscontent;

    private Integer istop;

    private Date addtime;

    private Integer showtimes;

    private String newstype;

    private String theauthor;

    private String keywords;

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

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype == null ? null : titletype.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Integer showtimes) {
        this.showtimes = showtimes;
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype == null ? null : newstype.trim();
    }

    public String getTheauthor() {
        return theauthor;
    }

    public void setTheauthor(String theauthor) {
        this.theauthor = theauthor == null ? null : theauthor.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }
}