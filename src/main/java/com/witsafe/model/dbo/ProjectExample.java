package com.witsafe.model.dbo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andTocompanyIsNull() {
            addCriterion("ToCompany is null");
            return (Criteria) this;
        }

        public Criteria andTocompanyIsNotNull() {
            addCriterion("ToCompany is not null");
            return (Criteria) this;
        }

        public Criteria andTocompanyEqualTo(String value) {
            addCriterion("ToCompany =", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyNotEqualTo(String value) {
            addCriterion("ToCompany <>", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyGreaterThan(String value) {
            addCriterion("ToCompany >", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ToCompany >=", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyLessThan(String value) {
            addCriterion("ToCompany <", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyLessThanOrEqualTo(String value) {
            addCriterion("ToCompany <=", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyLike(String value) {
            addCriterion("ToCompany like", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyNotLike(String value) {
            addCriterion("ToCompany not like", value, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyIn(List<String> values) {
            addCriterion("ToCompany in", values, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyNotIn(List<String> values) {
            addCriterion("ToCompany not in", values, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyBetween(String value1, String value2) {
            addCriterion("ToCompany between", value1, value2, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTocompanyNotBetween(String value1, String value2) {
            addCriterion("ToCompany not between", value1, value2, "tocompany");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNull() {
            addCriterion("ToTime is null");
            return (Criteria) this;
        }

        public Criteria andTotimeIsNotNull() {
            addCriterion("ToTime is not null");
            return (Criteria) this;
        }

        public Criteria andTotimeEqualTo(Date value) {
            addCriterion("ToTime =", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotEqualTo(Date value) {
            addCriterion("ToTime <>", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThan(Date value) {
            addCriterion("ToTime >", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ToTime >=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThan(Date value) {
            addCriterion("ToTime <", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeLessThanOrEqualTo(Date value) {
            addCriterion("ToTime <=", value, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeIn(List<Date> values) {
            addCriterion("ToTime in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotIn(List<Date> values) {
            addCriterion("ToTime not in", values, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeBetween(Date value1, Date value2) {
            addCriterion("ToTime between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andTotimeNotBetween(Date value1, Date value2) {
            addCriterion("ToTime not between", value1, value2, "totime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("PType is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("PType is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(Integer value) {
            addCriterion("PType =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(Integer value) {
            addCriterion("PType <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(Integer value) {
            addCriterion("PType >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PType >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(Integer value) {
            addCriterion("PType <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(Integer value) {
            addCriterion("PType <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<Integer> values) {
            addCriterion("PType in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<Integer> values) {
            addCriterion("PType not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(Integer value1, Integer value2) {
            addCriterion("PType between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PType not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("ContractAmount is null");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("ContractAmount is not null");
            return (Criteria) this;
        }

        public Criteria andContractamountEqualTo(BigDecimal value) {
            addCriterion("ContractAmount =", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotEqualTo(BigDecimal value) {
            addCriterion("ContractAmount <>", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThan(BigDecimal value) {
            addCriterion("ContractAmount >", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ContractAmount >=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThan(BigDecimal value) {
            addCriterion("ContractAmount <", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ContractAmount <=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountIn(List<BigDecimal> values) {
            addCriterion("ContractAmount in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotIn(List<BigDecimal> values) {
            addCriterion("ContractAmount not in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ContractAmount between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ContractAmount not between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andThecontactIsNull() {
            addCriterion("TheContact is null");
            return (Criteria) this;
        }

        public Criteria andThecontactIsNotNull() {
            addCriterion("TheContact is not null");
            return (Criteria) this;
        }

        public Criteria andThecontactEqualTo(String value) {
            addCriterion("TheContact =", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactNotEqualTo(String value) {
            addCriterion("TheContact <>", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactGreaterThan(String value) {
            addCriterion("TheContact >", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactGreaterThanOrEqualTo(String value) {
            addCriterion("TheContact >=", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactLessThan(String value) {
            addCriterion("TheContact <", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactLessThanOrEqualTo(String value) {
            addCriterion("TheContact <=", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactLike(String value) {
            addCriterion("TheContact like", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactNotLike(String value) {
            addCriterion("TheContact not like", value, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactIn(List<String> values) {
            addCriterion("TheContact in", values, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactNotIn(List<String> values) {
            addCriterion("TheContact not in", values, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactBetween(String value1, String value2) {
            addCriterion("TheContact between", value1, value2, "thecontact");
            return (Criteria) this;
        }

        public Criteria andThecontactNotBetween(String value1, String value2) {
            addCriterion("TheContact not between", value1, value2, "thecontact");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("ContactPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("ContactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("ContactPhone =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("ContactPhone <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("ContactPhone >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ContactPhone >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("ContactPhone <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("ContactPhone <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("ContactPhone like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("ContactPhone not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("ContactPhone in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("ContactPhone not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("ContactPhone between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("ContactPhone not between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CreateUserID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CreateUserID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CreateUserID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CreateUserID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CreateUserID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUserID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CreateUserID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CreateUserID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CreateUserID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CreateUserID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CreateUserID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CreateUserID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CreateUserID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CreateUserID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andProjectbzIsNull() {
            addCriterion("ProjectBz is null");
            return (Criteria) this;
        }

        public Criteria andProjectbzIsNotNull() {
            addCriterion("ProjectBz is not null");
            return (Criteria) this;
        }

        public Criteria andProjectbzEqualTo(String value) {
            addCriterion("ProjectBz =", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzNotEqualTo(String value) {
            addCriterion("ProjectBz <>", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzGreaterThan(String value) {
            addCriterion("ProjectBz >", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectBz >=", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzLessThan(String value) {
            addCriterion("ProjectBz <", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzLessThanOrEqualTo(String value) {
            addCriterion("ProjectBz <=", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzLike(String value) {
            addCriterion("ProjectBz like", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzNotLike(String value) {
            addCriterion("ProjectBz not like", value, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzIn(List<String> values) {
            addCriterion("ProjectBz in", values, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzNotIn(List<String> values) {
            addCriterion("ProjectBz not in", values, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzBetween(String value1, String value2) {
            addCriterion("ProjectBz between", value1, value2, "projectbz");
            return (Criteria) this;
        }

        public Criteria andProjectbzNotBetween(String value1, String value2) {
            addCriterion("ProjectBz not between", value1, value2, "projectbz");
            return (Criteria) this;
        }

        public Criteria andPremindIsNull() {
            addCriterion("PRemind is null");
            return (Criteria) this;
        }

        public Criteria andPremindIsNotNull() {
            addCriterion("PRemind is not null");
            return (Criteria) this;
        }

        public Criteria andPremindEqualTo(Integer value) {
            addCriterion("PRemind =", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindNotEqualTo(Integer value) {
            addCriterion("PRemind <>", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindGreaterThan(Integer value) {
            addCriterion("PRemind >", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRemind >=", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindLessThan(Integer value) {
            addCriterion("PRemind <", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindLessThanOrEqualTo(Integer value) {
            addCriterion("PRemind <=", value, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindIn(List<Integer> values) {
            addCriterion("PRemind in", values, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindNotIn(List<Integer> values) {
            addCriterion("PRemind not in", values, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindBetween(Integer value1, Integer value2) {
            addCriterion("PRemind between", value1, value2, "premind");
            return (Criteria) this;
        }

        public Criteria andPremindNotBetween(Integer value1, Integer value2) {
            addCriterion("PRemind not between", value1, value2, "premind");
            return (Criteria) this;
        }

        public Criteria andProjectmyIsNull() {
            addCriterion("ProjectMY is null");
            return (Criteria) this;
        }

        public Criteria andProjectmyIsNotNull() {
            addCriterion("ProjectMY is not null");
            return (Criteria) this;
        }

        public Criteria andProjectmyEqualTo(String value) {
            addCriterion("ProjectMY =", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyNotEqualTo(String value) {
            addCriterion("ProjectMY <>", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyGreaterThan(String value) {
            addCriterion("ProjectMY >", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectMY >=", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyLessThan(String value) {
            addCriterion("ProjectMY <", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyLessThanOrEqualTo(String value) {
            addCriterion("ProjectMY <=", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyLike(String value) {
            addCriterion("ProjectMY like", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyNotLike(String value) {
            addCriterion("ProjectMY not like", value, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyIn(List<String> values) {
            addCriterion("ProjectMY in", values, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyNotIn(List<String> values) {
            addCriterion("ProjectMY not in", values, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyBetween(String value1, String value2) {
            addCriterion("ProjectMY between", value1, value2, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectmyNotBetween(String value1, String value2) {
            addCriterion("ProjectMY not between", value1, value2, "projectmy");
            return (Criteria) this;
        }

        public Criteria andProjectinfoIsNull() {
            addCriterion("projectinfo is null");
            return (Criteria) this;
        }

        public Criteria andProjectinfoIsNotNull() {
            addCriterion("projectinfo is not null");
            return (Criteria) this;
        }

        public Criteria andProjectinfoEqualTo(String value) {
            addCriterion("projectinfo =", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoNotEqualTo(String value) {
            addCriterion("projectinfo <>", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoGreaterThan(String value) {
            addCriterion("projectinfo >", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoGreaterThanOrEqualTo(String value) {
            addCriterion("projectinfo >=", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoLessThan(String value) {
            addCriterion("projectinfo <", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoLessThanOrEqualTo(String value) {
            addCriterion("projectinfo <=", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoLike(String value) {
            addCriterion("projectinfo like", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoNotLike(String value) {
            addCriterion("projectinfo not like", value, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoIn(List<String> values) {
            addCriterion("projectinfo in", values, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoNotIn(List<String> values) {
            addCriterion("projectinfo not in", values, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoBetween(String value1, String value2) {
            addCriterion("projectinfo between", value1, value2, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andProjectinfoNotBetween(String value1, String value2) {
            addCriterion("projectinfo not between", value1, value2, "projectinfo");
            return (Criteria) this;
        }

        public Criteria andEquipmentIsNull() {
            addCriterion("Equipment is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIsNotNull() {
            addCriterion("Equipment is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentEqualTo(String value) {
            addCriterion("Equipment =", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotEqualTo(String value) {
            addCriterion("Equipment <>", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentGreaterThan(String value) {
            addCriterion("Equipment >", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("Equipment >=", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLessThan(String value) {
            addCriterion("Equipment <", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLessThanOrEqualTo(String value) {
            addCriterion("Equipment <=", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentLike(String value) {
            addCriterion("Equipment like", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotLike(String value) {
            addCriterion("Equipment not like", value, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentIn(List<String> values) {
            addCriterion("Equipment in", values, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotIn(List<String> values) {
            addCriterion("Equipment not in", values, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentBetween(String value1, String value2) {
            addCriterion("Equipment between", value1, value2, "equipment");
            return (Criteria) this;
        }

        public Criteria andEquipmentNotBetween(String value1, String value2) {
            addCriterion("Equipment not between", value1, value2, "equipment");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishtime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishtime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishtime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishtime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishtime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishtime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishtime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishtime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishtime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishtime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishtime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishtime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishIsNull() {
            addCriterion("finish is null");
            return (Criteria) this;
        }

        public Criteria andFinishIsNotNull() {
            addCriterion("finish is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEqualTo(Integer value) {
            addCriterion("finish =", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotEqualTo(Integer value) {
            addCriterion("finish <>", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThan(Integer value) {
            addCriterion("finish >", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish >=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThan(Integer value) {
            addCriterion("finish <", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThanOrEqualTo(Integer value) {
            addCriterion("finish <=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishIn(List<Integer> values) {
            addCriterion("finish in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotIn(List<Integer> values) {
            addCriterion("finish not in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishBetween(Integer value1, Integer value2) {
            addCriterion("finish between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("finish not between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistIsNull() {
            addCriterion("ProjectBzList is null");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistIsNotNull() {
            addCriterion("ProjectBzList is not null");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistEqualTo(String value) {
            addCriterion("ProjectBzList =", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistNotEqualTo(String value) {
            addCriterion("ProjectBzList <>", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistGreaterThan(String value) {
            addCriterion("ProjectBzList >", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectBzList >=", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistLessThan(String value) {
            addCriterion("ProjectBzList <", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistLessThanOrEqualTo(String value) {
            addCriterion("ProjectBzList <=", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistLike(String value) {
            addCriterion("ProjectBzList like", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistNotLike(String value) {
            addCriterion("ProjectBzList not like", value, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistIn(List<String> values) {
            addCriterion("ProjectBzList in", values, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistNotIn(List<String> values) {
            addCriterion("ProjectBzList not in", values, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistBetween(String value1, String value2) {
            addCriterion("ProjectBzList between", value1, value2, "projectbzlist");
            return (Criteria) this;
        }

        public Criteria andProjectbzlistNotBetween(String value1, String value2) {
            addCriterion("ProjectBzList not between", value1, value2, "projectbzlist");
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