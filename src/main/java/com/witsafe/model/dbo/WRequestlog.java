package com.witsafe.model.dbo;

import java.util.Date;

public class WRequestlog {
    private Integer id;

    private String msgtype;

    private String fromusername;

    private String tousername;

    private Integer siteid;

    private Date requesttime;

    private String poststring;

    private String msgevent;

    private String argument;

    private String retype;

    private String rekeywords;

    private Integer reid;

    private String retoplace;

    private String reimg;

    private Date thedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername == null ? null : fromusername.trim();
    }

    public String getTousername() {
        return tousername;
    }

    public void setTousername(String tousername) {
        this.tousername = tousername == null ? null : tousername.trim();
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Date getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    public String getPoststring() {
        return poststring;
    }

    public void setPoststring(String poststring) {
        this.poststring = poststring == null ? null : poststring.trim();
    }

    public String getMsgevent() {
        return msgevent;
    }

    public void setMsgevent(String msgevent) {
        this.msgevent = msgevent == null ? null : msgevent.trim();
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument == null ? null : argument.trim();
    }

    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype == null ? null : retype.trim();
    }

    public String getRekeywords() {
        return rekeywords;
    }

    public void setRekeywords(String rekeywords) {
        this.rekeywords = rekeywords == null ? null : rekeywords.trim();
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getRetoplace() {
        return retoplace;
    }

    public void setRetoplace(String retoplace) {
        this.retoplace = retoplace == null ? null : retoplace.trim();
    }

    public String getReimg() {
        return reimg;
    }

    public void setReimg(String reimg) {
        this.reimg = reimg == null ? null : reimg.trim();
    }

    public Date getThedate() {
        return thedate;
    }

    public void setThedate(Date thedate) {
        this.thedate = thedate;
    }
}