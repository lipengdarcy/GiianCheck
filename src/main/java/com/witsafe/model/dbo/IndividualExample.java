package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndividualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndividualExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("OpenID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OpenID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OpenID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OpenID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OpenID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OpenID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OpenID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OpenID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OpenID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OpenID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OpenID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OpenID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OpenID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OpenID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andManNoIsNull() {
            addCriterion("man_no is null");
            return (Criteria) this;
        }

        public Criteria andManNoIsNotNull() {
            addCriterion("man_no is not null");
            return (Criteria) this;
        }

        public Criteria andManNoEqualTo(String value) {
            addCriterion("man_no =", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoNotEqualTo(String value) {
            addCriterion("man_no <>", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoGreaterThan(String value) {
            addCriterion("man_no >", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoGreaterThanOrEqualTo(String value) {
            addCriterion("man_no >=", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoLessThan(String value) {
            addCriterion("man_no <", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoLessThanOrEqualTo(String value) {
            addCriterion("man_no <=", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoLike(String value) {
            addCriterion("man_no like", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoNotLike(String value) {
            addCriterion("man_no not like", value, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoIn(List<String> values) {
            addCriterion("man_no in", values, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoNotIn(List<String> values) {
            addCriterion("man_no not in", values, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoBetween(String value1, String value2) {
            addCriterion("man_no between", value1, value2, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNoNotBetween(String value1, String value2) {
            addCriterion("man_no not between", value1, value2, "manNo");
            return (Criteria) this;
        }

        public Criteria andManNameIsNull() {
            addCriterion("man_name is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("man_name is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("man_name =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("man_name <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("man_name >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("man_name >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("man_name <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("man_name <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("man_name like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("man_name not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("man_name in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("man_name not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("man_name between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("man_name not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andManZoneIsNull() {
            addCriterion("man_zone is null");
            return (Criteria) this;
        }

        public Criteria andManZoneIsNotNull() {
            addCriterion("man_zone is not null");
            return (Criteria) this;
        }

        public Criteria andManZoneEqualTo(String value) {
            addCriterion("man_zone =", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneNotEqualTo(String value) {
            addCriterion("man_zone <>", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneGreaterThan(String value) {
            addCriterion("man_zone >", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneGreaterThanOrEqualTo(String value) {
            addCriterion("man_zone >=", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneLessThan(String value) {
            addCriterion("man_zone <", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneLessThanOrEqualTo(String value) {
            addCriterion("man_zone <=", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneLike(String value) {
            addCriterion("man_zone like", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneNotLike(String value) {
            addCriterion("man_zone not like", value, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneIn(List<String> values) {
            addCriterion("man_zone in", values, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneNotIn(List<String> values) {
            addCriterion("man_zone not in", values, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneBetween(String value1, String value2) {
            addCriterion("man_zone between", value1, value2, "manZone");
            return (Criteria) this;
        }

        public Criteria andManZoneNotBetween(String value1, String value2) {
            addCriterion("man_zone not between", value1, value2, "manZone");
            return (Criteria) this;
        }

        public Criteria andManCompanyIsNull() {
            addCriterion("man_company is null");
            return (Criteria) this;
        }

        public Criteria andManCompanyIsNotNull() {
            addCriterion("man_company is not null");
            return (Criteria) this;
        }

        public Criteria andManCompanyEqualTo(String value) {
            addCriterion("man_company =", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyNotEqualTo(String value) {
            addCriterion("man_company <>", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyGreaterThan(String value) {
            addCriterion("man_company >", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("man_company >=", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyLessThan(String value) {
            addCriterion("man_company <", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyLessThanOrEqualTo(String value) {
            addCriterion("man_company <=", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyLike(String value) {
            addCriterion("man_company like", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyNotLike(String value) {
            addCriterion("man_company not like", value, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyIn(List<String> values) {
            addCriterion("man_company in", values, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyNotIn(List<String> values) {
            addCriterion("man_company not in", values, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyBetween(String value1, String value2) {
            addCriterion("man_company between", value1, value2, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManCompanyNotBetween(String value1, String value2) {
            addCriterion("man_company not between", value1, value2, "manCompany");
            return (Criteria) this;
        }

        public Criteria andManDoseIsNull() {
            addCriterion("man_dose is null");
            return (Criteria) this;
        }

        public Criteria andManDoseIsNotNull() {
            addCriterion("man_dose is not null");
            return (Criteria) this;
        }

        public Criteria andManDoseEqualTo(Double value) {
            addCriterion("man_dose =", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseNotEqualTo(Double value) {
            addCriterion("man_dose <>", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseGreaterThan(Double value) {
            addCriterion("man_dose >", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseGreaterThanOrEqualTo(Double value) {
            addCriterion("man_dose >=", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseLessThan(Double value) {
            addCriterion("man_dose <", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseLessThanOrEqualTo(Double value) {
            addCriterion("man_dose <=", value, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseIn(List<Double> values) {
            addCriterion("man_dose in", values, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseNotIn(List<Double> values) {
            addCriterion("man_dose not in", values, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseBetween(Double value1, Double value2) {
            addCriterion("man_dose between", value1, value2, "manDose");
            return (Criteria) this;
        }

        public Criteria andManDoseNotBetween(Double value1, Double value2) {
            addCriterion("man_dose not between", value1, value2, "manDose");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andPeroidIsNull() {
            addCriterion("peroid is null");
            return (Criteria) this;
        }

        public Criteria andPeroidIsNotNull() {
            addCriterion("peroid is not null");
            return (Criteria) this;
        }

        public Criteria andPeroidEqualTo(Integer value) {
            addCriterion("peroid =", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotEqualTo(Integer value) {
            addCriterion("peroid <>", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidGreaterThan(Integer value) {
            addCriterion("peroid >", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("peroid >=", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidLessThan(Integer value) {
            addCriterion("peroid <", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidLessThanOrEqualTo(Integer value) {
            addCriterion("peroid <=", value, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidIn(List<Integer> values) {
            addCriterion("peroid in", values, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotIn(List<Integer> values) {
            addCriterion("peroid not in", values, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidBetween(Integer value1, Integer value2) {
            addCriterion("peroid between", value1, value2, "peroid");
            return (Criteria) this;
        }

        public Criteria andPeroidNotBetween(Integer value1, Integer value2) {
            addCriterion("peroid not between", value1, value2, "peroid");
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