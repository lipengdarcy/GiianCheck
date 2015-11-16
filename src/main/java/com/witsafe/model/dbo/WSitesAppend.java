package com.witsafe.model.dbo;

import java.util.Date;

public class WSitesAppend {
    private Integer id;

    private Integer siteid;

    private Integer toptempindex;

    private Integer foottempindex;

    private Integer lbsreply;

    private Integer teltempindex;

    private String memberlookurl;

    private Integer memberlookisshow;

    private String accountusername;

    private String accountpassword;

    private String qrcodepath;

    private Integer industryid;

    private String merchantid;

    private Integer isopenprint;

    private Date lasttimesendmessage;

    private Date lasttimejobprocess;

    private String guid;

    private Integer foodtempindex;

    private String siteinfo;

    private String brandimg;

    private Integer istogo;

    private String domain;

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

    public Integer getToptempindex() {
        return toptempindex;
    }

    public void setToptempindex(Integer toptempindex) {
        this.toptempindex = toptempindex;
    }

    public Integer getFoottempindex() {
        return foottempindex;
    }

    public void setFoottempindex(Integer foottempindex) {
        this.foottempindex = foottempindex;
    }

    public Integer getLbsreply() {
        return lbsreply;
    }

    public void setLbsreply(Integer lbsreply) {
        this.lbsreply = lbsreply;
    }

    public Integer getTeltempindex() {
        return teltempindex;
    }

    public void setTeltempindex(Integer teltempindex) {
        this.teltempindex = teltempindex;
    }

    public String getMemberlookurl() {
        return memberlookurl;
    }

    public void setMemberlookurl(String memberlookurl) {
        this.memberlookurl = memberlookurl == null ? null : memberlookurl.trim();
    }

    public Integer getMemberlookisshow() {
        return memberlookisshow;
    }

    public void setMemberlookisshow(Integer memberlookisshow) {
        this.memberlookisshow = memberlookisshow;
    }

    public String getAccountusername() {
        return accountusername;
    }

    public void setAccountusername(String accountusername) {
        this.accountusername = accountusername == null ? null : accountusername.trim();
    }

    public String getAccountpassword() {
        return accountpassword;
    }

    public void setAccountpassword(String accountpassword) {
        this.accountpassword = accountpassword == null ? null : accountpassword.trim();
    }

    public String getQrcodepath() {
        return qrcodepath;
    }

    public void setQrcodepath(String qrcodepath) {
        this.qrcodepath = qrcodepath == null ? null : qrcodepath.trim();
    }

    public Integer getIndustryid() {
        return industryid;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public Integer getIsopenprint() {
        return isopenprint;
    }

    public void setIsopenprint(Integer isopenprint) {
        this.isopenprint = isopenprint;
    }

    public Date getLasttimesendmessage() {
        return lasttimesendmessage;
    }

    public void setLasttimesendmessage(Date lasttimesendmessage) {
        this.lasttimesendmessage = lasttimesendmessage;
    }

    public Date getLasttimejobprocess() {
        return lasttimejobprocess;
    }

    public void setLasttimejobprocess(Date lasttimejobprocess) {
        this.lasttimejobprocess = lasttimejobprocess;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public Integer getFoodtempindex() {
        return foodtempindex;
    }

    public void setFoodtempindex(Integer foodtempindex) {
        this.foodtempindex = foodtempindex;
    }

    public String getSiteinfo() {
        return siteinfo;
    }

    public void setSiteinfo(String siteinfo) {
        this.siteinfo = siteinfo == null ? null : siteinfo.trim();
    }

    public String getBrandimg() {
        return brandimg;
    }

    public void setBrandimg(String brandimg) {
        this.brandimg = brandimg == null ? null : brandimg.trim();
    }

    public Integer getIstogo() {
        return istogo;
    }

    public void setIstogo(Integer istogo) {
        this.istogo = istogo;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }
}