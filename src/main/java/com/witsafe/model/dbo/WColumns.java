package com.witsafe.model.dbo;

import java.util.Date;

public class WColumns {
    private Integer id;

    private Integer parentid;

    private Integer userid;

    private Integer siteid;

    private Short type;

    private Integer childid;

    private String columns;

    private String introduc;

    private String img;

    private String links;

    private String keywords;

    private String description;

    private Integer sequence;

    private Date addtime;

    private Integer indexs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getChildid() {
        return childid;
    }

    public void setChildid(Integer childid) {
        this.childid = childid;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns == null ? null : columns.trim();
    }

    public String getIntroduc() {
        return introduc;
    }

    public void setIntroduc(String introduc) {
        this.introduc = introduc == null ? null : introduc.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links == null ? null : links.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getIndexs() {
        return indexs;
    }

    public void setIndexs(Integer indexs) {
        this.indexs = indexs;
    }
}