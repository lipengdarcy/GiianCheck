package com.witsafe.model.dbo;

import java.math.BigDecimal;
import java.util.Date;

public class WSites {
    private Integer id;

    private Integer userid;

    private Integer agentsid;

    private String sitename;

    private BigDecimal cost;

    private Short state;

    private String auditreason;

    private String company;

    private String introduc;

    private String password;

    private String publicAccounts;

    private String token;

    private String tousername;

    private String appid;

    private String appsecret;

    private String accessToken;

    private Date accessTokentime;

    private String defaultpic;

    private Double longitude;

    private Double latitude;

    private String tel;

    private Boolean isshowtel;

    private Boolean isshortcutmenu;

    private Boolean isbuttonmenu;

    private String address;

    private String memberinfo;

    private Short templateindex;

    private Short listindex;

    private Short detailindex;

    private Short productindex;

    private String title;

    private String keywords;

    private String description;

    private String bakimgindex;

    private String bakimg;

    private String bakmusic;

    private Boolean isbakimg;

    private Boolean isbakmusic;

    private String copyright;

    private String copyrighturl;

    private String techsupport;

    private String techsupporturl;

    private String statcode;

    private Integer sequence;

    private Date addtime;

    private String nextOpenid;

    private Integer weitype;

    private String logo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAgentsid() {
        return agentsid;
    }

    public void setAgentsid(Integer agentsid) {
        this.agentsid = agentsid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename == null ? null : sitename.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getAuditreason() {
        return auditreason;
    }

    public void setAuditreason(String auditreason) {
        this.auditreason = auditreason == null ? null : auditreason.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getIntroduc() {
        return introduc;
    }

    public void setIntroduc(String introduc) {
        this.introduc = introduc == null ? null : introduc.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPublicAccounts() {
        return publicAccounts;
    }

    public void setPublicAccounts(String publicAccounts) {
        this.publicAccounts = publicAccounts == null ? null : publicAccounts.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getTousername() {
        return tousername;
    }

    public void setTousername(String tousername) {
        this.tousername = tousername == null ? null : tousername.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Date getAccessTokentime() {
        return accessTokentime;
    }

    public void setAccessTokentime(Date accessTokentime) {
        this.accessTokentime = accessTokentime;
    }

    public String getDefaultpic() {
        return defaultpic;
    }

    public void setDefaultpic(String defaultpic) {
        this.defaultpic = defaultpic == null ? null : defaultpic.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Boolean getIsshowtel() {
        return isshowtel;
    }

    public void setIsshowtel(Boolean isshowtel) {
        this.isshowtel = isshowtel;
    }

    public Boolean getIsshortcutmenu() {
        return isshortcutmenu;
    }

    public void setIsshortcutmenu(Boolean isshortcutmenu) {
        this.isshortcutmenu = isshortcutmenu;
    }

    public Boolean getIsbuttonmenu() {
        return isbuttonmenu;
    }

    public void setIsbuttonmenu(Boolean isbuttonmenu) {
        this.isbuttonmenu = isbuttonmenu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMemberinfo() {
        return memberinfo;
    }

    public void setMemberinfo(String memberinfo) {
        this.memberinfo = memberinfo == null ? null : memberinfo.trim();
    }

    public Short getTemplateindex() {
        return templateindex;
    }

    public void setTemplateindex(Short templateindex) {
        this.templateindex = templateindex;
    }

    public Short getListindex() {
        return listindex;
    }

    public void setListindex(Short listindex) {
        this.listindex = listindex;
    }

    public Short getDetailindex() {
        return detailindex;
    }

    public void setDetailindex(Short detailindex) {
        this.detailindex = detailindex;
    }

    public Short getProductindex() {
        return productindex;
    }

    public void setProductindex(Short productindex) {
        this.productindex = productindex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getBakimgindex() {
        return bakimgindex;
    }

    public void setBakimgindex(String bakimgindex) {
        this.bakimgindex = bakimgindex == null ? null : bakimgindex.trim();
    }

    public String getBakimg() {
        return bakimg;
    }

    public void setBakimg(String bakimg) {
        this.bakimg = bakimg == null ? null : bakimg.trim();
    }

    public String getBakmusic() {
        return bakmusic;
    }

    public void setBakmusic(String bakmusic) {
        this.bakmusic = bakmusic == null ? null : bakmusic.trim();
    }

    public Boolean getIsbakimg() {
        return isbakimg;
    }

    public void setIsbakimg(Boolean isbakimg) {
        this.isbakimg = isbakimg;
    }

    public Boolean getIsbakmusic() {
        return isbakmusic;
    }

    public void setIsbakmusic(Boolean isbakmusic) {
        this.isbakmusic = isbakmusic;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getCopyrighturl() {
        return copyrighturl;
    }

    public void setCopyrighturl(String copyrighturl) {
        this.copyrighturl = copyrighturl == null ? null : copyrighturl.trim();
    }

    public String getTechsupport() {
        return techsupport;
    }

    public void setTechsupport(String techsupport) {
        this.techsupport = techsupport == null ? null : techsupport.trim();
    }

    public String getTechsupporturl() {
        return techsupporturl;
    }

    public void setTechsupporturl(String techsupporturl) {
        this.techsupporturl = techsupporturl == null ? null : techsupporturl.trim();
    }

    public String getStatcode() {
        return statcode;
    }

    public void setStatcode(String statcode) {
        this.statcode = statcode == null ? null : statcode.trim();
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

    public String getNextOpenid() {
        return nextOpenid;
    }

    public void setNextOpenid(String nextOpenid) {
        this.nextOpenid = nextOpenid == null ? null : nextOpenid.trim();
    }

    public Integer getWeitype() {
        return weitype;
    }

    public void setWeitype(Integer weitype) {
        this.weitype = weitype;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}