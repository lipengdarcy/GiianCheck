package com.witsafe.model.dbo;

import java.util.Date;

public class WReplykeywordcontent {
    private Integer id;

    private Integer siteid;

    private Integer keywordid;

    private String title;

    private String img;

    private String links;

    private String links2;

    private String description;

    private Integer sequence;

    private Date addtime;

    private String keycontent;

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

    public Integer getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(Integer keywordid) {
        this.keywordid = keywordid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getLinks2() {
        return links2;
    }

    public void setLinks2(String links2) {
        this.links2 = links2 == null ? null : links2.trim();
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

    public String getKeycontent() {
        return keycontent;
    }

    public void setKeycontent(String keycontent) {
        this.keycontent = keycontent == null ? null : keycontent.trim();
    }
}