package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WRequestlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WRequestlogExample() {
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

        public Criteria andMsgtypeIsNull() {
            addCriterion("MsgType is null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNotNull() {
            addCriterion("MsgType is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeEqualTo(String value) {
            addCriterion("MsgType =", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotEqualTo(String value) {
            addCriterion("MsgType <>", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThan(String value) {
            addCriterion("MsgType >", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("MsgType >=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThan(String value) {
            addCriterion("MsgType <", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThanOrEqualTo(String value) {
            addCriterion("MsgType <=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLike(String value) {
            addCriterion("MsgType like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotLike(String value) {
            addCriterion("MsgType not like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIn(List<String> values) {
            addCriterion("MsgType in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotIn(List<String> values) {
            addCriterion("MsgType not in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeBetween(String value1, String value2) {
            addCriterion("MsgType between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotBetween(String value1, String value2) {
            addCriterion("MsgType not between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andFromusernameIsNull() {
            addCriterion("FromUserName is null");
            return (Criteria) this;
        }

        public Criteria andFromusernameIsNotNull() {
            addCriterion("FromUserName is not null");
            return (Criteria) this;
        }

        public Criteria andFromusernameEqualTo(String value) {
            addCriterion("FromUserName =", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotEqualTo(String value) {
            addCriterion("FromUserName <>", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameGreaterThan(String value) {
            addCriterion("FromUserName >", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameGreaterThanOrEqualTo(String value) {
            addCriterion("FromUserName >=", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLessThan(String value) {
            addCriterion("FromUserName <", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLessThanOrEqualTo(String value) {
            addCriterion("FromUserName <=", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameLike(String value) {
            addCriterion("FromUserName like", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotLike(String value) {
            addCriterion("FromUserName not like", value, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameIn(List<String> values) {
            addCriterion("FromUserName in", values, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotIn(List<String> values) {
            addCriterion("FromUserName not in", values, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameBetween(String value1, String value2) {
            addCriterion("FromUserName between", value1, value2, "fromusername");
            return (Criteria) this;
        }

        public Criteria andFromusernameNotBetween(String value1, String value2) {
            addCriterion("FromUserName not between", value1, value2, "fromusername");
            return (Criteria) this;
        }

        public Criteria andTousernameIsNull() {
            addCriterion("ToUserName is null");
            return (Criteria) this;
        }

        public Criteria andTousernameIsNotNull() {
            addCriterion("ToUserName is not null");
            return (Criteria) this;
        }

        public Criteria andTousernameEqualTo(String value) {
            addCriterion("ToUserName =", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameNotEqualTo(String value) {
            addCriterion("ToUserName <>", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameGreaterThan(String value) {
            addCriterion("ToUserName >", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameGreaterThanOrEqualTo(String value) {
            addCriterion("ToUserName >=", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameLessThan(String value) {
            addCriterion("ToUserName <", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameLessThanOrEqualTo(String value) {
            addCriterion("ToUserName <=", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameLike(String value) {
            addCriterion("ToUserName like", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameNotLike(String value) {
            addCriterion("ToUserName not like", value, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameIn(List<String> values) {
            addCriterion("ToUserName in", values, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameNotIn(List<String> values) {
            addCriterion("ToUserName not in", values, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameBetween(String value1, String value2) {
            addCriterion("ToUserName between", value1, value2, "tousername");
            return (Criteria) this;
        }

        public Criteria andTousernameNotBetween(String value1, String value2) {
            addCriterion("ToUserName not between", value1, value2, "tousername");
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

        public Criteria andRequesttimeIsNull() {
            addCriterion("RequestTime is null");
            return (Criteria) this;
        }

        public Criteria andRequesttimeIsNotNull() {
            addCriterion("RequestTime is not null");
            return (Criteria) this;
        }

        public Criteria andRequesttimeEqualTo(Date value) {
            addCriterion("RequestTime =", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotEqualTo(Date value) {
            addCriterion("RequestTime <>", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeGreaterThan(Date value) {
            addCriterion("RequestTime >", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RequestTime >=", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeLessThan(Date value) {
            addCriterion("RequestTime <", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeLessThanOrEqualTo(Date value) {
            addCriterion("RequestTime <=", value, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeIn(List<Date> values) {
            addCriterion("RequestTime in", values, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotIn(List<Date> values) {
            addCriterion("RequestTime not in", values, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeBetween(Date value1, Date value2) {
            addCriterion("RequestTime between", value1, value2, "requesttime");
            return (Criteria) this;
        }

        public Criteria andRequesttimeNotBetween(Date value1, Date value2) {
            addCriterion("RequestTime not between", value1, value2, "requesttime");
            return (Criteria) this;
        }

        public Criteria andPoststringIsNull() {
            addCriterion("PostString is null");
            return (Criteria) this;
        }

        public Criteria andPoststringIsNotNull() {
            addCriterion("PostString is not null");
            return (Criteria) this;
        }

        public Criteria andPoststringEqualTo(String value) {
            addCriterion("PostString =", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringNotEqualTo(String value) {
            addCriterion("PostString <>", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringGreaterThan(String value) {
            addCriterion("PostString >", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringGreaterThanOrEqualTo(String value) {
            addCriterion("PostString >=", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringLessThan(String value) {
            addCriterion("PostString <", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringLessThanOrEqualTo(String value) {
            addCriterion("PostString <=", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringLike(String value) {
            addCriterion("PostString like", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringNotLike(String value) {
            addCriterion("PostString not like", value, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringIn(List<String> values) {
            addCriterion("PostString in", values, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringNotIn(List<String> values) {
            addCriterion("PostString not in", values, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringBetween(String value1, String value2) {
            addCriterion("PostString between", value1, value2, "poststring");
            return (Criteria) this;
        }

        public Criteria andPoststringNotBetween(String value1, String value2) {
            addCriterion("PostString not between", value1, value2, "poststring");
            return (Criteria) this;
        }

        public Criteria andMsgeventIsNull() {
            addCriterion("MsgEvent is null");
            return (Criteria) this;
        }

        public Criteria andMsgeventIsNotNull() {
            addCriterion("MsgEvent is not null");
            return (Criteria) this;
        }

        public Criteria andMsgeventEqualTo(String value) {
            addCriterion("MsgEvent =", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventNotEqualTo(String value) {
            addCriterion("MsgEvent <>", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventGreaterThan(String value) {
            addCriterion("MsgEvent >", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventGreaterThanOrEqualTo(String value) {
            addCriterion("MsgEvent >=", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventLessThan(String value) {
            addCriterion("MsgEvent <", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventLessThanOrEqualTo(String value) {
            addCriterion("MsgEvent <=", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventLike(String value) {
            addCriterion("MsgEvent like", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventNotLike(String value) {
            addCriterion("MsgEvent not like", value, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventIn(List<String> values) {
            addCriterion("MsgEvent in", values, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventNotIn(List<String> values) {
            addCriterion("MsgEvent not in", values, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventBetween(String value1, String value2) {
            addCriterion("MsgEvent between", value1, value2, "msgevent");
            return (Criteria) this;
        }

        public Criteria andMsgeventNotBetween(String value1, String value2) {
            addCriterion("MsgEvent not between", value1, value2, "msgevent");
            return (Criteria) this;
        }

        public Criteria andArgumentIsNull() {
            addCriterion("Argument is null");
            return (Criteria) this;
        }

        public Criteria andArgumentIsNotNull() {
            addCriterion("Argument is not null");
            return (Criteria) this;
        }

        public Criteria andArgumentEqualTo(String value) {
            addCriterion("Argument =", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentNotEqualTo(String value) {
            addCriterion("Argument <>", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentGreaterThan(String value) {
            addCriterion("Argument >", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentGreaterThanOrEqualTo(String value) {
            addCriterion("Argument >=", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentLessThan(String value) {
            addCriterion("Argument <", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentLessThanOrEqualTo(String value) {
            addCriterion("Argument <=", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentLike(String value) {
            addCriterion("Argument like", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentNotLike(String value) {
            addCriterion("Argument not like", value, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentIn(List<String> values) {
            addCriterion("Argument in", values, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentNotIn(List<String> values) {
            addCriterion("Argument not in", values, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentBetween(String value1, String value2) {
            addCriterion("Argument between", value1, value2, "argument");
            return (Criteria) this;
        }

        public Criteria andArgumentNotBetween(String value1, String value2) {
            addCriterion("Argument not between", value1, value2, "argument");
            return (Criteria) this;
        }

        public Criteria andRetypeIsNull() {
            addCriterion("ReType is null");
            return (Criteria) this;
        }

        public Criteria andRetypeIsNotNull() {
            addCriterion("ReType is not null");
            return (Criteria) this;
        }

        public Criteria andRetypeEqualTo(String value) {
            addCriterion("ReType =", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotEqualTo(String value) {
            addCriterion("ReType <>", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThan(String value) {
            addCriterion("ReType >", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ReType >=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThan(String value) {
            addCriterion("ReType <", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThanOrEqualTo(String value) {
            addCriterion("ReType <=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLike(String value) {
            addCriterion("ReType like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotLike(String value) {
            addCriterion("ReType not like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeIn(List<String> values) {
            addCriterion("ReType in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotIn(List<String> values) {
            addCriterion("ReType not in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeBetween(String value1, String value2) {
            addCriterion("ReType between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotBetween(String value1, String value2) {
            addCriterion("ReType not between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andRekeywordsIsNull() {
            addCriterion("ReKeywords is null");
            return (Criteria) this;
        }

        public Criteria andRekeywordsIsNotNull() {
            addCriterion("ReKeywords is not null");
            return (Criteria) this;
        }

        public Criteria andRekeywordsEqualTo(String value) {
            addCriterion("ReKeywords =", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsNotEqualTo(String value) {
            addCriterion("ReKeywords <>", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsGreaterThan(String value) {
            addCriterion("ReKeywords >", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("ReKeywords >=", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsLessThan(String value) {
            addCriterion("ReKeywords <", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsLessThanOrEqualTo(String value) {
            addCriterion("ReKeywords <=", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsLike(String value) {
            addCriterion("ReKeywords like", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsNotLike(String value) {
            addCriterion("ReKeywords not like", value, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsIn(List<String> values) {
            addCriterion("ReKeywords in", values, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsNotIn(List<String> values) {
            addCriterion("ReKeywords not in", values, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsBetween(String value1, String value2) {
            addCriterion("ReKeywords between", value1, value2, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andRekeywordsNotBetween(String value1, String value2) {
            addCriterion("ReKeywords not between", value1, value2, "rekeywords");
            return (Criteria) this;
        }

        public Criteria andReidIsNull() {
            addCriterion("ReID is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("ReID is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("ReID =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("ReID <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("ReID >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReID >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("ReID <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("ReID <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("ReID in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("ReID not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("ReID between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("ReID not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andRetoplaceIsNull() {
            addCriterion("ReToPlace is null");
            return (Criteria) this;
        }

        public Criteria andRetoplaceIsNotNull() {
            addCriterion("ReToPlace is not null");
            return (Criteria) this;
        }

        public Criteria andRetoplaceEqualTo(String value) {
            addCriterion("ReToPlace =", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceNotEqualTo(String value) {
            addCriterion("ReToPlace <>", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceGreaterThan(String value) {
            addCriterion("ReToPlace >", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceGreaterThanOrEqualTo(String value) {
            addCriterion("ReToPlace >=", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceLessThan(String value) {
            addCriterion("ReToPlace <", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceLessThanOrEqualTo(String value) {
            addCriterion("ReToPlace <=", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceLike(String value) {
            addCriterion("ReToPlace like", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceNotLike(String value) {
            addCriterion("ReToPlace not like", value, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceIn(List<String> values) {
            addCriterion("ReToPlace in", values, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceNotIn(List<String> values) {
            addCriterion("ReToPlace not in", values, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceBetween(String value1, String value2) {
            addCriterion("ReToPlace between", value1, value2, "retoplace");
            return (Criteria) this;
        }

        public Criteria andRetoplaceNotBetween(String value1, String value2) {
            addCriterion("ReToPlace not between", value1, value2, "retoplace");
            return (Criteria) this;
        }

        public Criteria andReimgIsNull() {
            addCriterion("ReImg is null");
            return (Criteria) this;
        }

        public Criteria andReimgIsNotNull() {
            addCriterion("ReImg is not null");
            return (Criteria) this;
        }

        public Criteria andReimgEqualTo(String value) {
            addCriterion("ReImg =", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgNotEqualTo(String value) {
            addCriterion("ReImg <>", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgGreaterThan(String value) {
            addCriterion("ReImg >", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgGreaterThanOrEqualTo(String value) {
            addCriterion("ReImg >=", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgLessThan(String value) {
            addCriterion("ReImg <", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgLessThanOrEqualTo(String value) {
            addCriterion("ReImg <=", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgLike(String value) {
            addCriterion("ReImg like", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgNotLike(String value) {
            addCriterion("ReImg not like", value, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgIn(List<String> values) {
            addCriterion("ReImg in", values, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgNotIn(List<String> values) {
            addCriterion("ReImg not in", values, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgBetween(String value1, String value2) {
            addCriterion("ReImg between", value1, value2, "reimg");
            return (Criteria) this;
        }

        public Criteria andReimgNotBetween(String value1, String value2) {
            addCriterion("ReImg not between", value1, value2, "reimg");
            return (Criteria) this;
        }

        public Criteria andThedateIsNull() {
            addCriterion("TheDate is null");
            return (Criteria) this;
        }

        public Criteria andThedateIsNotNull() {
            addCriterion("TheDate is not null");
            return (Criteria) this;
        }

        public Criteria andThedateEqualTo(Date value) {
            addCriterion("TheDate =", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateNotEqualTo(Date value) {
            addCriterion("TheDate <>", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateGreaterThan(Date value) {
            addCriterion("TheDate >", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateGreaterThanOrEqualTo(Date value) {
            addCriterion("TheDate >=", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateLessThan(Date value) {
            addCriterion("TheDate <", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateLessThanOrEqualTo(Date value) {
            addCriterion("TheDate <=", value, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateIn(List<Date> values) {
            addCriterion("TheDate in", values, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateNotIn(List<Date> values) {
            addCriterion("TheDate not in", values, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateBetween(Date value1, Date value2) {
            addCriterion("TheDate between", value1, value2, "thedate");
            return (Criteria) this;
        }

        public Criteria andThedateNotBetween(Date value1, Date value2) {
            addCriterion("TheDate not between", value1, value2, "thedate");
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