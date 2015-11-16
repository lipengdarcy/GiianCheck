package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WSitesAppendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WSitesAppendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("SiteID is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SiteID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(Integer value) {
            addCriterion("SiteID =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(Integer value) {
            addCriterion("SiteID <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(Integer value) {
            addCriterion("SiteID >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteID >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(Integer value) {
            addCriterion("SiteID <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(Integer value) {
            addCriterion("SiteID <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<Integer> values) {
            addCriterion("SiteID in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<Integer> values) {
            addCriterion("SiteID not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(Integer value1, Integer value2) {
            addCriterion("SiteID between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteID not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andToptempindexIsNull() {
            addCriterion("TopTempIndex is null");
            return (Criteria) this;
        }

        public Criteria andToptempindexIsNotNull() {
            addCriterion("TopTempIndex is not null");
            return (Criteria) this;
        }

        public Criteria andToptempindexEqualTo(Integer value) {
            addCriterion("TopTempIndex =", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexNotEqualTo(Integer value) {
            addCriterion("TopTempIndex <>", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexGreaterThan(Integer value) {
            addCriterion("TopTempIndex >", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopTempIndex >=", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexLessThan(Integer value) {
            addCriterion("TopTempIndex <", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexLessThanOrEqualTo(Integer value) {
            addCriterion("TopTempIndex <=", value, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexIn(List<Integer> values) {
            addCriterion("TopTempIndex in", values, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexNotIn(List<Integer> values) {
            addCriterion("TopTempIndex not in", values, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexBetween(Integer value1, Integer value2) {
            addCriterion("TopTempIndex between", value1, value2, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andToptempindexNotBetween(Integer value1, Integer value2) {
            addCriterion("TopTempIndex not between", value1, value2, "toptempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexIsNull() {
            addCriterion("FootTempIndex is null");
            return (Criteria) this;
        }

        public Criteria andFoottempindexIsNotNull() {
            addCriterion("FootTempIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFoottempindexEqualTo(Integer value) {
            addCriterion("FootTempIndex =", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexNotEqualTo(Integer value) {
            addCriterion("FootTempIndex <>", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexGreaterThan(Integer value) {
            addCriterion("FootTempIndex >", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("FootTempIndex >=", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexLessThan(Integer value) {
            addCriterion("FootTempIndex <", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexLessThanOrEqualTo(Integer value) {
            addCriterion("FootTempIndex <=", value, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexIn(List<Integer> values) {
            addCriterion("FootTempIndex in", values, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexNotIn(List<Integer> values) {
            addCriterion("FootTempIndex not in", values, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexBetween(Integer value1, Integer value2) {
            addCriterion("FootTempIndex between", value1, value2, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andFoottempindexNotBetween(Integer value1, Integer value2) {
            addCriterion("FootTempIndex not between", value1, value2, "foottempindex");
            return (Criteria) this;
        }

        public Criteria andLbsreplyIsNull() {
            addCriterion("LbsReply is null");
            return (Criteria) this;
        }

        public Criteria andLbsreplyIsNotNull() {
            addCriterion("LbsReply is not null");
            return (Criteria) this;
        }

        public Criteria andLbsreplyEqualTo(Integer value) {
            addCriterion("LbsReply =", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyNotEqualTo(Integer value) {
            addCriterion("LbsReply <>", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyGreaterThan(Integer value) {
            addCriterion("LbsReply >", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("LbsReply >=", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyLessThan(Integer value) {
            addCriterion("LbsReply <", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyLessThanOrEqualTo(Integer value) {
            addCriterion("LbsReply <=", value, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyIn(List<Integer> values) {
            addCriterion("LbsReply in", values, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyNotIn(List<Integer> values) {
            addCriterion("LbsReply not in", values, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyBetween(Integer value1, Integer value2) {
            addCriterion("LbsReply between", value1, value2, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andLbsreplyNotBetween(Integer value1, Integer value2) {
            addCriterion("LbsReply not between", value1, value2, "lbsreply");
            return (Criteria) this;
        }

        public Criteria andTeltempindexIsNull() {
            addCriterion("TelTempIndex is null");
            return (Criteria) this;
        }

        public Criteria andTeltempindexIsNotNull() {
            addCriterion("TelTempIndex is not null");
            return (Criteria) this;
        }

        public Criteria andTeltempindexEqualTo(Integer value) {
            addCriterion("TelTempIndex =", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexNotEqualTo(Integer value) {
            addCriterion("TelTempIndex <>", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexGreaterThan(Integer value) {
            addCriterion("TelTempIndex >", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("TelTempIndex >=", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexLessThan(Integer value) {
            addCriterion("TelTempIndex <", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexLessThanOrEqualTo(Integer value) {
            addCriterion("TelTempIndex <=", value, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexIn(List<Integer> values) {
            addCriterion("TelTempIndex in", values, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexNotIn(List<Integer> values) {
            addCriterion("TelTempIndex not in", values, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexBetween(Integer value1, Integer value2) {
            addCriterion("TelTempIndex between", value1, value2, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andTeltempindexNotBetween(Integer value1, Integer value2) {
            addCriterion("TelTempIndex not between", value1, value2, "teltempindex");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlIsNull() {
            addCriterion("MemberLookUrl is null");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlIsNotNull() {
            addCriterion("MemberLookUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlEqualTo(String value) {
            addCriterion("MemberLookUrl =", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlNotEqualTo(String value) {
            addCriterion("MemberLookUrl <>", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlGreaterThan(String value) {
            addCriterion("MemberLookUrl >", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlGreaterThanOrEqualTo(String value) {
            addCriterion("MemberLookUrl >=", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlLessThan(String value) {
            addCriterion("MemberLookUrl <", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlLessThanOrEqualTo(String value) {
            addCriterion("MemberLookUrl <=", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlLike(String value) {
            addCriterion("MemberLookUrl like", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlNotLike(String value) {
            addCriterion("MemberLookUrl not like", value, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlIn(List<String> values) {
            addCriterion("MemberLookUrl in", values, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlNotIn(List<String> values) {
            addCriterion("MemberLookUrl not in", values, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlBetween(String value1, String value2) {
            addCriterion("MemberLookUrl between", value1, value2, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookurlNotBetween(String value1, String value2) {
            addCriterion("MemberLookUrl not between", value1, value2, "memberlookurl");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowIsNull() {
            addCriterion("MemberLookIsShow is null");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowIsNotNull() {
            addCriterion("MemberLookIsShow is not null");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowEqualTo(Integer value) {
            addCriterion("MemberLookIsShow =", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowNotEqualTo(Integer value) {
            addCriterion("MemberLookIsShow <>", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowGreaterThan(Integer value) {
            addCriterion("MemberLookIsShow >", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("MemberLookIsShow >=", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowLessThan(Integer value) {
            addCriterion("MemberLookIsShow <", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowLessThanOrEqualTo(Integer value) {
            addCriterion("MemberLookIsShow <=", value, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowIn(List<Integer> values) {
            addCriterion("MemberLookIsShow in", values, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowNotIn(List<Integer> values) {
            addCriterion("MemberLookIsShow not in", values, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowBetween(Integer value1, Integer value2) {
            addCriterion("MemberLookIsShow between", value1, value2, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andMemberlookisshowNotBetween(Integer value1, Integer value2) {
            addCriterion("MemberLookIsShow not between", value1, value2, "memberlookisshow");
            return (Criteria) this;
        }

        public Criteria andAccountusernameIsNull() {
            addCriterion("AccountUserName is null");
            return (Criteria) this;
        }

        public Criteria andAccountusernameIsNotNull() {
            addCriterion("AccountUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountusernameEqualTo(String value) {
            addCriterion("AccountUserName =", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameNotEqualTo(String value) {
            addCriterion("AccountUserName <>", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameGreaterThan(String value) {
            addCriterion("AccountUserName >", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameGreaterThanOrEqualTo(String value) {
            addCriterion("AccountUserName >=", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameLessThan(String value) {
            addCriterion("AccountUserName <", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameLessThanOrEqualTo(String value) {
            addCriterion("AccountUserName <=", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameLike(String value) {
            addCriterion("AccountUserName like", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameNotLike(String value) {
            addCriterion("AccountUserName not like", value, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameIn(List<String> values) {
            addCriterion("AccountUserName in", values, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameNotIn(List<String> values) {
            addCriterion("AccountUserName not in", values, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameBetween(String value1, String value2) {
            addCriterion("AccountUserName between", value1, value2, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountusernameNotBetween(String value1, String value2) {
            addCriterion("AccountUserName not between", value1, value2, "accountusername");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordIsNull() {
            addCriterion("AccountPassword is null");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordIsNotNull() {
            addCriterion("AccountPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordEqualTo(String value) {
            addCriterion("AccountPassword =", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordNotEqualTo(String value) {
            addCriterion("AccountPassword <>", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordGreaterThan(String value) {
            addCriterion("AccountPassword >", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AccountPassword >=", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordLessThan(String value) {
            addCriterion("AccountPassword <", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordLessThanOrEqualTo(String value) {
            addCriterion("AccountPassword <=", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordLike(String value) {
            addCriterion("AccountPassword like", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordNotLike(String value) {
            addCriterion("AccountPassword not like", value, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordIn(List<String> values) {
            addCriterion("AccountPassword in", values, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordNotIn(List<String> values) {
            addCriterion("AccountPassword not in", values, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordBetween(String value1, String value2) {
            addCriterion("AccountPassword between", value1, value2, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andAccountpasswordNotBetween(String value1, String value2) {
            addCriterion("AccountPassword not between", value1, value2, "accountpassword");
            return (Criteria) this;
        }

        public Criteria andQrcodepathIsNull() {
            addCriterion("QrCodePath is null");
            return (Criteria) this;
        }

        public Criteria andQrcodepathIsNotNull() {
            addCriterion("QrCodePath is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodepathEqualTo(String value) {
            addCriterion("QrCodePath =", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathNotEqualTo(String value) {
            addCriterion("QrCodePath <>", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathGreaterThan(String value) {
            addCriterion("QrCodePath >", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathGreaterThanOrEqualTo(String value) {
            addCriterion("QrCodePath >=", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathLessThan(String value) {
            addCriterion("QrCodePath <", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathLessThanOrEqualTo(String value) {
            addCriterion("QrCodePath <=", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathLike(String value) {
            addCriterion("QrCodePath like", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathNotLike(String value) {
            addCriterion("QrCodePath not like", value, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathIn(List<String> values) {
            addCriterion("QrCodePath in", values, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathNotIn(List<String> values) {
            addCriterion("QrCodePath not in", values, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathBetween(String value1, String value2) {
            addCriterion("QrCodePath between", value1, value2, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andQrcodepathNotBetween(String value1, String value2) {
            addCriterion("QrCodePath not between", value1, value2, "qrcodepath");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNull() {
            addCriterion("IndustryID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNotNull() {
            addCriterion("IndustryID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryidEqualTo(Integer value) {
            addCriterion("IndustryID =", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotEqualTo(Integer value) {
            addCriterion("IndustryID <>", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThan(Integer value) {
            addCriterion("IndustryID >", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndustryID >=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThan(Integer value) {
            addCriterion("IndustryID <", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThanOrEqualTo(Integer value) {
            addCriterion("IndustryID <=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidIn(List<Integer> values) {
            addCriterion("IndustryID in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotIn(List<Integer> values) {
            addCriterion("IndustryID not in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidBetween(Integer value1, Integer value2) {
            addCriterion("IndustryID between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotBetween(Integer value1, Integer value2) {
            addCriterion("IndustryID not between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNull() {
            addCriterion("MerchantID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("MerchantID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(String value) {
            addCriterion("MerchantID =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(String value) {
            addCriterion("MerchantID <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(String value) {
            addCriterion("MerchantID >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantID >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(String value) {
            addCriterion("MerchantID <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(String value) {
            addCriterion("MerchantID <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLike(String value) {
            addCriterion("MerchantID like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotLike(String value) {
            addCriterion("MerchantID not like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<String> values) {
            addCriterion("MerchantID in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<String> values) {
            addCriterion("MerchantID not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(String value1, String value2) {
            addCriterion("MerchantID between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(String value1, String value2) {
            addCriterion("MerchantID not between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andIsopenprintIsNull() {
            addCriterion("IsOpenPrint is null");
            return (Criteria) this;
        }

        public Criteria andIsopenprintIsNotNull() {
            addCriterion("IsOpenPrint is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenprintEqualTo(Integer value) {
            addCriterion("IsOpenPrint =", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintNotEqualTo(Integer value) {
            addCriterion("IsOpenPrint <>", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintGreaterThan(Integer value) {
            addCriterion("IsOpenPrint >", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsOpenPrint >=", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintLessThan(Integer value) {
            addCriterion("IsOpenPrint <", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintLessThanOrEqualTo(Integer value) {
            addCriterion("IsOpenPrint <=", value, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintIn(List<Integer> values) {
            addCriterion("IsOpenPrint in", values, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintNotIn(List<Integer> values) {
            addCriterion("IsOpenPrint not in", values, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintBetween(Integer value1, Integer value2) {
            addCriterion("IsOpenPrint between", value1, value2, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andIsopenprintNotBetween(Integer value1, Integer value2) {
            addCriterion("IsOpenPrint not between", value1, value2, "isopenprint");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageIsNull() {
            addCriterion("LastTimeSendMessage is null");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageIsNotNull() {
            addCriterion("LastTimeSendMessage is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageEqualTo(Date value) {
            addCriterion("LastTimeSendMessage =", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageNotEqualTo(Date value) {
            addCriterion("LastTimeSendMessage <>", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageGreaterThan(Date value) {
            addCriterion("LastTimeSendMessage >", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageGreaterThanOrEqualTo(Date value) {
            addCriterion("LastTimeSendMessage >=", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageLessThan(Date value) {
            addCriterion("LastTimeSendMessage <", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageLessThanOrEqualTo(Date value) {
            addCriterion("LastTimeSendMessage <=", value, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageIn(List<Date> values) {
            addCriterion("LastTimeSendMessage in", values, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageNotIn(List<Date> values) {
            addCriterion("LastTimeSendMessage not in", values, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageBetween(Date value1, Date value2) {
            addCriterion("LastTimeSendMessage between", value1, value2, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimesendmessageNotBetween(Date value1, Date value2) {
            addCriterion("LastTimeSendMessage not between", value1, value2, "lasttimesendmessage");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessIsNull() {
            addCriterion("LastTimeJobProcess is null");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessIsNotNull() {
            addCriterion("LastTimeJobProcess is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessEqualTo(Date value) {
            addCriterion("LastTimeJobProcess =", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessNotEqualTo(Date value) {
            addCriterion("LastTimeJobProcess <>", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessGreaterThan(Date value) {
            addCriterion("LastTimeJobProcess >", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessGreaterThanOrEqualTo(Date value) {
            addCriterion("LastTimeJobProcess >=", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessLessThan(Date value) {
            addCriterion("LastTimeJobProcess <", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessLessThanOrEqualTo(Date value) {
            addCriterion("LastTimeJobProcess <=", value, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessIn(List<Date> values) {
            addCriterion("LastTimeJobProcess in", values, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessNotIn(List<Date> values) {
            addCriterion("LastTimeJobProcess not in", values, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessBetween(Date value1, Date value2) {
            addCriterion("LastTimeJobProcess between", value1, value2, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andLasttimejobprocessNotBetween(Date value1, Date value2) {
            addCriterion("LastTimeJobProcess not between", value1, value2, "lasttimejobprocess");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("GUID like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("GUID not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexIsNull() {
            addCriterion("FoodTempIndex is null");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexIsNotNull() {
            addCriterion("FoodTempIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexEqualTo(Integer value) {
            addCriterion("FoodTempIndex =", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexNotEqualTo(Integer value) {
            addCriterion("FoodTempIndex <>", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexGreaterThan(Integer value) {
            addCriterion("FoodTempIndex >", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("FoodTempIndex >=", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexLessThan(Integer value) {
            addCriterion("FoodTempIndex <", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexLessThanOrEqualTo(Integer value) {
            addCriterion("FoodTempIndex <=", value, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexIn(List<Integer> values) {
            addCriterion("FoodTempIndex in", values, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexNotIn(List<Integer> values) {
            addCriterion("FoodTempIndex not in", values, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexBetween(Integer value1, Integer value2) {
            addCriterion("FoodTempIndex between", value1, value2, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andFoodtempindexNotBetween(Integer value1, Integer value2) {
            addCriterion("FoodTempIndex not between", value1, value2, "foodtempindex");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIsNull() {
            addCriterion("SiteInfo is null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIsNotNull() {
            addCriterion("SiteInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSiteinfoEqualTo(String value) {
            addCriterion("SiteInfo =", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoNotEqualTo(String value) {
            addCriterion("SiteInfo <>", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoGreaterThan(String value) {
            addCriterion("SiteInfo >", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoGreaterThanOrEqualTo(String value) {
            addCriterion("SiteInfo >=", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLessThan(String value) {
            addCriterion("SiteInfo <", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLessThanOrEqualTo(String value) {
            addCriterion("SiteInfo <=", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoLike(String value) {
            addCriterion("SiteInfo like", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoNotLike(String value) {
            addCriterion("SiteInfo not like", value, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoIn(List<String> values) {
            addCriterion("SiteInfo in", values, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoNotIn(List<String> values) {
            addCriterion("SiteInfo not in", values, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoBetween(String value1, String value2) {
            addCriterion("SiteInfo between", value1, value2, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andSiteinfoNotBetween(String value1, String value2) {
            addCriterion("SiteInfo not between", value1, value2, "siteinfo");
            return (Criteria) this;
        }

        public Criteria andBrandimgIsNull() {
            addCriterion("BrandImg is null");
            return (Criteria) this;
        }

        public Criteria andBrandimgIsNotNull() {
            addCriterion("BrandImg is not null");
            return (Criteria) this;
        }

        public Criteria andBrandimgEqualTo(String value) {
            addCriterion("BrandImg =", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgNotEqualTo(String value) {
            addCriterion("BrandImg <>", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgGreaterThan(String value) {
            addCriterion("BrandImg >", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgGreaterThanOrEqualTo(String value) {
            addCriterion("BrandImg >=", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgLessThan(String value) {
            addCriterion("BrandImg <", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgLessThanOrEqualTo(String value) {
            addCriterion("BrandImg <=", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgLike(String value) {
            addCriterion("BrandImg like", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgNotLike(String value) {
            addCriterion("BrandImg not like", value, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgIn(List<String> values) {
            addCriterion("BrandImg in", values, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgNotIn(List<String> values) {
            addCriterion("BrandImg not in", values, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgBetween(String value1, String value2) {
            addCriterion("BrandImg between", value1, value2, "brandimg");
            return (Criteria) this;
        }

        public Criteria andBrandimgNotBetween(String value1, String value2) {
            addCriterion("BrandImg not between", value1, value2, "brandimg");
            return (Criteria) this;
        }

        public Criteria andIstogoIsNull() {
            addCriterion("IsToGo is null");
            return (Criteria) this;
        }

        public Criteria andIstogoIsNotNull() {
            addCriterion("IsToGo is not null");
            return (Criteria) this;
        }

        public Criteria andIstogoEqualTo(Integer value) {
            addCriterion("IsToGo =", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoNotEqualTo(Integer value) {
            addCriterion("IsToGo <>", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoGreaterThan(Integer value) {
            addCriterion("IsToGo >", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsToGo >=", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoLessThan(Integer value) {
            addCriterion("IsToGo <", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoLessThanOrEqualTo(Integer value) {
            addCriterion("IsToGo <=", value, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoIn(List<Integer> values) {
            addCriterion("IsToGo in", values, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoNotIn(List<Integer> values) {
            addCriterion("IsToGo not in", values, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoBetween(Integer value1, Integer value2) {
            addCriterion("IsToGo between", value1, value2, "istogo");
            return (Criteria) this;
        }

        public Criteria andIstogoNotBetween(Integer value1, Integer value2) {
            addCriterion("IsToGo not between", value1, value2, "istogo");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("Domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("Domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("Domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("Domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("Domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("Domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("Domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("Domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("Domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("Domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("Domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("Domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("Domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("Domain not between", value1, value2, "domain");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}