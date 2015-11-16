package com.witsafe.model.dbo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WSitesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WSitesExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAgentsidIsNull() {
            addCriterion("AgentsID is null");
            return (Criteria) this;
        }

        public Criteria andAgentsidIsNotNull() {
            addCriterion("AgentsID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentsidEqualTo(Integer value) {
            addCriterion("AgentsID =", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidNotEqualTo(Integer value) {
            addCriterion("AgentsID <>", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidGreaterThan(Integer value) {
            addCriterion("AgentsID >", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgentsID >=", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidLessThan(Integer value) {
            addCriterion("AgentsID <", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidLessThanOrEqualTo(Integer value) {
            addCriterion("AgentsID <=", value, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidIn(List<Integer> values) {
            addCriterion("AgentsID in", values, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidNotIn(List<Integer> values) {
            addCriterion("AgentsID not in", values, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidBetween(Integer value1, Integer value2) {
            addCriterion("AgentsID between", value1, value2, "agentsid");
            return (Criteria) this;
        }

        public Criteria andAgentsidNotBetween(Integer value1, Integer value2) {
            addCriterion("AgentsID not between", value1, value2, "agentsid");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("SiteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("SiteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("SiteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("SiteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("SiteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("SiteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("SiteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("SiteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("SiteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("SiteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("SiteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("SiteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("SiteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("SiteName not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("Cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("Cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("Cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("Cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("Cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("Cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("Cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("Cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cost not between", value1, value2, "cost");
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

        public Criteria andStateEqualTo(Short value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIsNull() {
            addCriterion("AuditReason is null");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIsNotNull() {
            addCriterion("AuditReason is not null");
            return (Criteria) this;
        }

        public Criteria andAuditreasonEqualTo(String value) {
            addCriterion("AuditReason =", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotEqualTo(String value) {
            addCriterion("AuditReason <>", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonGreaterThan(String value) {
            addCriterion("AuditReason >", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonGreaterThanOrEqualTo(String value) {
            addCriterion("AuditReason >=", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLessThan(String value) {
            addCriterion("AuditReason <", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLessThanOrEqualTo(String value) {
            addCriterion("AuditReason <=", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonLike(String value) {
            addCriterion("AuditReason like", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotLike(String value) {
            addCriterion("AuditReason not like", value, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonIn(List<String> values) {
            addCriterion("AuditReason in", values, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotIn(List<String> values) {
            addCriterion("AuditReason not in", values, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonBetween(String value1, String value2) {
            addCriterion("AuditReason between", value1, value2, "auditreason");
            return (Criteria) this;
        }

        public Criteria andAuditreasonNotBetween(String value1, String value2) {
            addCriterion("AuditReason not between", value1, value2, "auditreason");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andIntroducIsNull() {
            addCriterion("Introduc is null");
            return (Criteria) this;
        }

        public Criteria andIntroducIsNotNull() {
            addCriterion("Introduc is not null");
            return (Criteria) this;
        }

        public Criteria andIntroducEqualTo(String value) {
            addCriterion("Introduc =", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducNotEqualTo(String value) {
            addCriterion("Introduc <>", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducGreaterThan(String value) {
            addCriterion("Introduc >", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducGreaterThanOrEqualTo(String value) {
            addCriterion("Introduc >=", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducLessThan(String value) {
            addCriterion("Introduc <", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducLessThanOrEqualTo(String value) {
            addCriterion("Introduc <=", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducLike(String value) {
            addCriterion("Introduc like", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducNotLike(String value) {
            addCriterion("Introduc not like", value, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducIn(List<String> values) {
            addCriterion("Introduc in", values, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducNotIn(List<String> values) {
            addCriterion("Introduc not in", values, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducBetween(String value1, String value2) {
            addCriterion("Introduc between", value1, value2, "introduc");
            return (Criteria) this;
        }

        public Criteria andIntroducNotBetween(String value1, String value2) {
            addCriterion("Introduc not between", value1, value2, "introduc");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsIsNull() {
            addCriterion("Public_Accounts is null");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsIsNotNull() {
            addCriterion("Public_Accounts is not null");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsEqualTo(String value) {
            addCriterion("Public_Accounts =", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsNotEqualTo(String value) {
            addCriterion("Public_Accounts <>", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsGreaterThan(String value) {
            addCriterion("Public_Accounts >", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("Public_Accounts >=", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsLessThan(String value) {
            addCriterion("Public_Accounts <", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsLessThanOrEqualTo(String value) {
            addCriterion("Public_Accounts <=", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsLike(String value) {
            addCriterion("Public_Accounts like", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsNotLike(String value) {
            addCriterion("Public_Accounts not like", value, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsIn(List<String> values) {
            addCriterion("Public_Accounts in", values, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsNotIn(List<String> values) {
            addCriterion("Public_Accounts not in", values, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsBetween(String value1, String value2) {
            addCriterion("Public_Accounts between", value1, value2, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andPublicAccountsNotBetween(String value1, String value2) {
            addCriterion("Public_Accounts not between", value1, value2, "publicAccounts");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("Token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("Token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("Token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("Token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("Token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("Token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("Token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("Token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("Token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("Token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("Token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("Token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("Token not between", value1, value2, "token");
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

        public Criteria andAppidIsNull() {
            addCriterion("AppId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("AppId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("AppId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("AppId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("AppId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("AppId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("AppId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("AppId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("AppId like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("AppId not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("AppId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("AppId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("AppId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("AppId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("AppSecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("AppSecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("AppSecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("AppSecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("AppSecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("AppSecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("AppSecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("AppSecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("AppSecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("AppSecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("AppSecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("AppSecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("AppSecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("AppSecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("Access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("Access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("Access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("Access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("Access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("Access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("Access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("Access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("Access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("Access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("Access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("Access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("Access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("Access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeIsNull() {
            addCriterion("Access_tokenTime is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeIsNotNull() {
            addCriterion("Access_tokenTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeEqualTo(Date value) {
            addCriterion("Access_tokenTime =", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeNotEqualTo(Date value) {
            addCriterion("Access_tokenTime <>", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeGreaterThan(Date value) {
            addCriterion("Access_tokenTime >", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Access_tokenTime >=", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeLessThan(Date value) {
            addCriterion("Access_tokenTime <", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeLessThanOrEqualTo(Date value) {
            addCriterion("Access_tokenTime <=", value, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeIn(List<Date> values) {
            addCriterion("Access_tokenTime in", values, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeNotIn(List<Date> values) {
            addCriterion("Access_tokenTime not in", values, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeBetween(Date value1, Date value2) {
            addCriterion("Access_tokenTime between", value1, value2, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andAccessTokentimeNotBetween(Date value1, Date value2) {
            addCriterion("Access_tokenTime not between", value1, value2, "accessTokentime");
            return (Criteria) this;
        }

        public Criteria andDefaultpicIsNull() {
            addCriterion("DefaultPic is null");
            return (Criteria) this;
        }

        public Criteria andDefaultpicIsNotNull() {
            addCriterion("DefaultPic is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultpicEqualTo(String value) {
            addCriterion("DefaultPic =", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicNotEqualTo(String value) {
            addCriterion("DefaultPic <>", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicGreaterThan(String value) {
            addCriterion("DefaultPic >", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicGreaterThanOrEqualTo(String value) {
            addCriterion("DefaultPic >=", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicLessThan(String value) {
            addCriterion("DefaultPic <", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicLessThanOrEqualTo(String value) {
            addCriterion("DefaultPic <=", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicLike(String value) {
            addCriterion("DefaultPic like", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicNotLike(String value) {
            addCriterion("DefaultPic not like", value, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicIn(List<String> values) {
            addCriterion("DefaultPic in", values, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicNotIn(List<String> values) {
            addCriterion("DefaultPic not in", values, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicBetween(String value1, String value2) {
            addCriterion("DefaultPic between", value1, value2, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andDefaultpicNotBetween(String value1, String value2) {
            addCriterion("DefaultPic not between", value1, value2, "defaultpic");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelIsNull() {
            addCriterion("IsShowTel is null");
            return (Criteria) this;
        }

        public Criteria andIsshowtelIsNotNull() {
            addCriterion("IsShowTel is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowtelEqualTo(Boolean value) {
            addCriterion("IsShowTel =", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelNotEqualTo(Boolean value) {
            addCriterion("IsShowTel <>", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelGreaterThan(Boolean value) {
            addCriterion("IsShowTel >", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsShowTel >=", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelLessThan(Boolean value) {
            addCriterion("IsShowTel <", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelLessThanOrEqualTo(Boolean value) {
            addCriterion("IsShowTel <=", value, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelIn(List<Boolean> values) {
            addCriterion("IsShowTel in", values, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelNotIn(List<Boolean> values) {
            addCriterion("IsShowTel not in", values, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShowTel between", value1, value2, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshowtelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShowTel not between", value1, value2, "isshowtel");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuIsNull() {
            addCriterion("IsShortcutMenu is null");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuIsNotNull() {
            addCriterion("IsShortcutMenu is not null");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuEqualTo(Boolean value) {
            addCriterion("IsShortcutMenu =", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuNotEqualTo(Boolean value) {
            addCriterion("IsShortcutMenu <>", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuGreaterThan(Boolean value) {
            addCriterion("IsShortcutMenu >", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsShortcutMenu >=", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuLessThan(Boolean value) {
            addCriterion("IsShortcutMenu <", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuLessThanOrEqualTo(Boolean value) {
            addCriterion("IsShortcutMenu <=", value, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuIn(List<Boolean> values) {
            addCriterion("IsShortcutMenu in", values, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuNotIn(List<Boolean> values) {
            addCriterion("IsShortcutMenu not in", values, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShortcutMenu between", value1, value2, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsshortcutmenuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsShortcutMenu not between", value1, value2, "isshortcutmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuIsNull() {
            addCriterion("IsButtonMenu is null");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuIsNotNull() {
            addCriterion("IsButtonMenu is not null");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuEqualTo(Boolean value) {
            addCriterion("IsButtonMenu =", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuNotEqualTo(Boolean value) {
            addCriterion("IsButtonMenu <>", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuGreaterThan(Boolean value) {
            addCriterion("IsButtonMenu >", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsButtonMenu >=", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuLessThan(Boolean value) {
            addCriterion("IsButtonMenu <", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuLessThanOrEqualTo(Boolean value) {
            addCriterion("IsButtonMenu <=", value, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuIn(List<Boolean> values) {
            addCriterion("IsButtonMenu in", values, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuNotIn(List<Boolean> values) {
            addCriterion("IsButtonMenu not in", values, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuBetween(Boolean value1, Boolean value2) {
            addCriterion("IsButtonMenu between", value1, value2, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andIsbuttonmenuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsButtonMenu not between", value1, value2, "isbuttonmenu");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMemberinfoIsNull() {
            addCriterion("MemberInfo is null");
            return (Criteria) this;
        }

        public Criteria andMemberinfoIsNotNull() {
            addCriterion("MemberInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMemberinfoEqualTo(String value) {
            addCriterion("MemberInfo =", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoNotEqualTo(String value) {
            addCriterion("MemberInfo <>", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoGreaterThan(String value) {
            addCriterion("MemberInfo >", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoGreaterThanOrEqualTo(String value) {
            addCriterion("MemberInfo >=", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoLessThan(String value) {
            addCriterion("MemberInfo <", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoLessThanOrEqualTo(String value) {
            addCriterion("MemberInfo <=", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoLike(String value) {
            addCriterion("MemberInfo like", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoNotLike(String value) {
            addCriterion("MemberInfo not like", value, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoIn(List<String> values) {
            addCriterion("MemberInfo in", values, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoNotIn(List<String> values) {
            addCriterion("MemberInfo not in", values, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoBetween(String value1, String value2) {
            addCriterion("MemberInfo between", value1, value2, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andMemberinfoNotBetween(String value1, String value2) {
            addCriterion("MemberInfo not between", value1, value2, "memberinfo");
            return (Criteria) this;
        }

        public Criteria andTemplateindexIsNull() {
            addCriterion("TemplateIndex is null");
            return (Criteria) this;
        }

        public Criteria andTemplateindexIsNotNull() {
            addCriterion("TemplateIndex is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateindexEqualTo(Short value) {
            addCriterion("TemplateIndex =", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexNotEqualTo(Short value) {
            addCriterion("TemplateIndex <>", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexGreaterThan(Short value) {
            addCriterion("TemplateIndex >", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexGreaterThanOrEqualTo(Short value) {
            addCriterion("TemplateIndex >=", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexLessThan(Short value) {
            addCriterion("TemplateIndex <", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexLessThanOrEqualTo(Short value) {
            addCriterion("TemplateIndex <=", value, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexIn(List<Short> values) {
            addCriterion("TemplateIndex in", values, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexNotIn(List<Short> values) {
            addCriterion("TemplateIndex not in", values, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexBetween(Short value1, Short value2) {
            addCriterion("TemplateIndex between", value1, value2, "templateindex");
            return (Criteria) this;
        }

        public Criteria andTemplateindexNotBetween(Short value1, Short value2) {
            addCriterion("TemplateIndex not between", value1, value2, "templateindex");
            return (Criteria) this;
        }

        public Criteria andListindexIsNull() {
            addCriterion("ListIndex is null");
            return (Criteria) this;
        }

        public Criteria andListindexIsNotNull() {
            addCriterion("ListIndex is not null");
            return (Criteria) this;
        }

        public Criteria andListindexEqualTo(Short value) {
            addCriterion("ListIndex =", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexNotEqualTo(Short value) {
            addCriterion("ListIndex <>", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexGreaterThan(Short value) {
            addCriterion("ListIndex >", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexGreaterThanOrEqualTo(Short value) {
            addCriterion("ListIndex >=", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexLessThan(Short value) {
            addCriterion("ListIndex <", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexLessThanOrEqualTo(Short value) {
            addCriterion("ListIndex <=", value, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexIn(List<Short> values) {
            addCriterion("ListIndex in", values, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexNotIn(List<Short> values) {
            addCriterion("ListIndex not in", values, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexBetween(Short value1, Short value2) {
            addCriterion("ListIndex between", value1, value2, "listindex");
            return (Criteria) this;
        }

        public Criteria andListindexNotBetween(Short value1, Short value2) {
            addCriterion("ListIndex not between", value1, value2, "listindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexIsNull() {
            addCriterion("DetailIndex is null");
            return (Criteria) this;
        }

        public Criteria andDetailindexIsNotNull() {
            addCriterion("DetailIndex is not null");
            return (Criteria) this;
        }

        public Criteria andDetailindexEqualTo(Short value) {
            addCriterion("DetailIndex =", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotEqualTo(Short value) {
            addCriterion("DetailIndex <>", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexGreaterThan(Short value) {
            addCriterion("DetailIndex >", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexGreaterThanOrEqualTo(Short value) {
            addCriterion("DetailIndex >=", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexLessThan(Short value) {
            addCriterion("DetailIndex <", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexLessThanOrEqualTo(Short value) {
            addCriterion("DetailIndex <=", value, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexIn(List<Short> values) {
            addCriterion("DetailIndex in", values, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotIn(List<Short> values) {
            addCriterion("DetailIndex not in", values, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexBetween(Short value1, Short value2) {
            addCriterion("DetailIndex between", value1, value2, "detailindex");
            return (Criteria) this;
        }

        public Criteria andDetailindexNotBetween(Short value1, Short value2) {
            addCriterion("DetailIndex not between", value1, value2, "detailindex");
            return (Criteria) this;
        }

        public Criteria andProductindexIsNull() {
            addCriterion("ProductIndex is null");
            return (Criteria) this;
        }

        public Criteria andProductindexIsNotNull() {
            addCriterion("ProductIndex is not null");
            return (Criteria) this;
        }

        public Criteria andProductindexEqualTo(Short value) {
            addCriterion("ProductIndex =", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexNotEqualTo(Short value) {
            addCriterion("ProductIndex <>", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexGreaterThan(Short value) {
            addCriterion("ProductIndex >", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexGreaterThanOrEqualTo(Short value) {
            addCriterion("ProductIndex >=", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexLessThan(Short value) {
            addCriterion("ProductIndex <", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexLessThanOrEqualTo(Short value) {
            addCriterion("ProductIndex <=", value, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexIn(List<Short> values) {
            addCriterion("ProductIndex in", values, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexNotIn(List<Short> values) {
            addCriterion("ProductIndex not in", values, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexBetween(Short value1, Short value2) {
            addCriterion("ProductIndex between", value1, value2, "productindex");
            return (Criteria) this;
        }

        public Criteria andProductindexNotBetween(Short value1, Short value2) {
            addCriterion("ProductIndex not between", value1, value2, "productindex");
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

        public Criteria andKeywordsIsNull() {
            addCriterion("Keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("Keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("Keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("Keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("Keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("Keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("Keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("Keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("Keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("Keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("Keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBakimgindexIsNull() {
            addCriterion("BakImgIndex is null");
            return (Criteria) this;
        }

        public Criteria andBakimgindexIsNotNull() {
            addCriterion("BakImgIndex is not null");
            return (Criteria) this;
        }

        public Criteria andBakimgindexEqualTo(String value) {
            addCriterion("BakImgIndex =", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexNotEqualTo(String value) {
            addCriterion("BakImgIndex <>", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexGreaterThan(String value) {
            addCriterion("BakImgIndex >", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexGreaterThanOrEqualTo(String value) {
            addCriterion("BakImgIndex >=", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexLessThan(String value) {
            addCriterion("BakImgIndex <", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexLessThanOrEqualTo(String value) {
            addCriterion("BakImgIndex <=", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexLike(String value) {
            addCriterion("BakImgIndex like", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexNotLike(String value) {
            addCriterion("BakImgIndex not like", value, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexIn(List<String> values) {
            addCriterion("BakImgIndex in", values, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexNotIn(List<String> values) {
            addCriterion("BakImgIndex not in", values, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexBetween(String value1, String value2) {
            addCriterion("BakImgIndex between", value1, value2, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgindexNotBetween(String value1, String value2) {
            addCriterion("BakImgIndex not between", value1, value2, "bakimgindex");
            return (Criteria) this;
        }

        public Criteria andBakimgIsNull() {
            addCriterion("BakImg is null");
            return (Criteria) this;
        }

        public Criteria andBakimgIsNotNull() {
            addCriterion("BakImg is not null");
            return (Criteria) this;
        }

        public Criteria andBakimgEqualTo(String value) {
            addCriterion("BakImg =", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgNotEqualTo(String value) {
            addCriterion("BakImg <>", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgGreaterThan(String value) {
            addCriterion("BakImg >", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgGreaterThanOrEqualTo(String value) {
            addCriterion("BakImg >=", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgLessThan(String value) {
            addCriterion("BakImg <", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgLessThanOrEqualTo(String value) {
            addCriterion("BakImg <=", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgLike(String value) {
            addCriterion("BakImg like", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgNotLike(String value) {
            addCriterion("BakImg not like", value, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgIn(List<String> values) {
            addCriterion("BakImg in", values, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgNotIn(List<String> values) {
            addCriterion("BakImg not in", values, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgBetween(String value1, String value2) {
            addCriterion("BakImg between", value1, value2, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakimgNotBetween(String value1, String value2) {
            addCriterion("BakImg not between", value1, value2, "bakimg");
            return (Criteria) this;
        }

        public Criteria andBakmusicIsNull() {
            addCriterion("BakMusic is null");
            return (Criteria) this;
        }

        public Criteria andBakmusicIsNotNull() {
            addCriterion("BakMusic is not null");
            return (Criteria) this;
        }

        public Criteria andBakmusicEqualTo(String value) {
            addCriterion("BakMusic =", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicNotEqualTo(String value) {
            addCriterion("BakMusic <>", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicGreaterThan(String value) {
            addCriterion("BakMusic >", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicGreaterThanOrEqualTo(String value) {
            addCriterion("BakMusic >=", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicLessThan(String value) {
            addCriterion("BakMusic <", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicLessThanOrEqualTo(String value) {
            addCriterion("BakMusic <=", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicLike(String value) {
            addCriterion("BakMusic like", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicNotLike(String value) {
            addCriterion("BakMusic not like", value, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicIn(List<String> values) {
            addCriterion("BakMusic in", values, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicNotIn(List<String> values) {
            addCriterion("BakMusic not in", values, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicBetween(String value1, String value2) {
            addCriterion("BakMusic between", value1, value2, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andBakmusicNotBetween(String value1, String value2) {
            addCriterion("BakMusic not between", value1, value2, "bakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakimgIsNull() {
            addCriterion("IsBakImg is null");
            return (Criteria) this;
        }

        public Criteria andIsbakimgIsNotNull() {
            addCriterion("IsBakImg is not null");
            return (Criteria) this;
        }

        public Criteria andIsbakimgEqualTo(Boolean value) {
            addCriterion("IsBakImg =", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgNotEqualTo(Boolean value) {
            addCriterion("IsBakImg <>", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgGreaterThan(Boolean value) {
            addCriterion("IsBakImg >", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsBakImg >=", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgLessThan(Boolean value) {
            addCriterion("IsBakImg <", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgLessThanOrEqualTo(Boolean value) {
            addCriterion("IsBakImg <=", value, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgIn(List<Boolean> values) {
            addCriterion("IsBakImg in", values, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgNotIn(List<Boolean> values) {
            addCriterion("IsBakImg not in", values, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBakImg between", value1, value2, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakimgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBakImg not between", value1, value2, "isbakimg");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicIsNull() {
            addCriterion("IsBakMusic is null");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicIsNotNull() {
            addCriterion("IsBakMusic is not null");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicEqualTo(Boolean value) {
            addCriterion("IsBakMusic =", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicNotEqualTo(Boolean value) {
            addCriterion("IsBakMusic <>", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicGreaterThan(Boolean value) {
            addCriterion("IsBakMusic >", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsBakMusic >=", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicLessThan(Boolean value) {
            addCriterion("IsBakMusic <", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicLessThanOrEqualTo(Boolean value) {
            addCriterion("IsBakMusic <=", value, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicIn(List<Boolean> values) {
            addCriterion("IsBakMusic in", values, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicNotIn(List<Boolean> values) {
            addCriterion("IsBakMusic not in", values, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBakMusic between", value1, value2, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andIsbakmusicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsBakMusic not between", value1, value2, "isbakmusic");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("Copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("Copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("Copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("Copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("Copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("Copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("Copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("Copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("Copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("Copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("Copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("Copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("Copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("Copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlIsNull() {
            addCriterion("CopyrightUrl is null");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlIsNotNull() {
            addCriterion("CopyrightUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlEqualTo(String value) {
            addCriterion("CopyrightUrl =", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlNotEqualTo(String value) {
            addCriterion("CopyrightUrl <>", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlGreaterThan(String value) {
            addCriterion("CopyrightUrl >", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlGreaterThanOrEqualTo(String value) {
            addCriterion("CopyrightUrl >=", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlLessThan(String value) {
            addCriterion("CopyrightUrl <", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlLessThanOrEqualTo(String value) {
            addCriterion("CopyrightUrl <=", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlLike(String value) {
            addCriterion("CopyrightUrl like", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlNotLike(String value) {
            addCriterion("CopyrightUrl not like", value, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlIn(List<String> values) {
            addCriterion("CopyrightUrl in", values, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlNotIn(List<String> values) {
            addCriterion("CopyrightUrl not in", values, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlBetween(String value1, String value2) {
            addCriterion("CopyrightUrl between", value1, value2, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andCopyrighturlNotBetween(String value1, String value2) {
            addCriterion("CopyrightUrl not between", value1, value2, "copyrighturl");
            return (Criteria) this;
        }

        public Criteria andTechsupportIsNull() {
            addCriterion("TechSupport is null");
            return (Criteria) this;
        }

        public Criteria andTechsupportIsNotNull() {
            addCriterion("TechSupport is not null");
            return (Criteria) this;
        }

        public Criteria andTechsupportEqualTo(String value) {
            addCriterion("TechSupport =", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportNotEqualTo(String value) {
            addCriterion("TechSupport <>", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportGreaterThan(String value) {
            addCriterion("TechSupport >", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportGreaterThanOrEqualTo(String value) {
            addCriterion("TechSupport >=", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportLessThan(String value) {
            addCriterion("TechSupport <", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportLessThanOrEqualTo(String value) {
            addCriterion("TechSupport <=", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportLike(String value) {
            addCriterion("TechSupport like", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportNotLike(String value) {
            addCriterion("TechSupport not like", value, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportIn(List<String> values) {
            addCriterion("TechSupport in", values, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportNotIn(List<String> values) {
            addCriterion("TechSupport not in", values, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportBetween(String value1, String value2) {
            addCriterion("TechSupport between", value1, value2, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupportNotBetween(String value1, String value2) {
            addCriterion("TechSupport not between", value1, value2, "techsupport");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlIsNull() {
            addCriterion("TechSupportUrl is null");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlIsNotNull() {
            addCriterion("TechSupportUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlEqualTo(String value) {
            addCriterion("TechSupportUrl =", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlNotEqualTo(String value) {
            addCriterion("TechSupportUrl <>", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlGreaterThan(String value) {
            addCriterion("TechSupportUrl >", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlGreaterThanOrEqualTo(String value) {
            addCriterion("TechSupportUrl >=", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlLessThan(String value) {
            addCriterion("TechSupportUrl <", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlLessThanOrEqualTo(String value) {
            addCriterion("TechSupportUrl <=", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlLike(String value) {
            addCriterion("TechSupportUrl like", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlNotLike(String value) {
            addCriterion("TechSupportUrl not like", value, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlIn(List<String> values) {
            addCriterion("TechSupportUrl in", values, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlNotIn(List<String> values) {
            addCriterion("TechSupportUrl not in", values, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlBetween(String value1, String value2) {
            addCriterion("TechSupportUrl between", value1, value2, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andTechsupporturlNotBetween(String value1, String value2) {
            addCriterion("TechSupportUrl not between", value1, value2, "techsupporturl");
            return (Criteria) this;
        }

        public Criteria andStatcodeIsNull() {
            addCriterion("StatCode is null");
            return (Criteria) this;
        }

        public Criteria andStatcodeIsNotNull() {
            addCriterion("StatCode is not null");
            return (Criteria) this;
        }

        public Criteria andStatcodeEqualTo(String value) {
            addCriterion("StatCode =", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeNotEqualTo(String value) {
            addCriterion("StatCode <>", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeGreaterThan(String value) {
            addCriterion("StatCode >", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StatCode >=", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeLessThan(String value) {
            addCriterion("StatCode <", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeLessThanOrEqualTo(String value) {
            addCriterion("StatCode <=", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeLike(String value) {
            addCriterion("StatCode like", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeNotLike(String value) {
            addCriterion("StatCode not like", value, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeIn(List<String> values) {
            addCriterion("StatCode in", values, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeNotIn(List<String> values) {
            addCriterion("StatCode not in", values, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeBetween(String value1, String value2) {
            addCriterion("StatCode between", value1, value2, "statcode");
            return (Criteria) this;
        }

        public Criteria andStatcodeNotBetween(String value1, String value2) {
            addCriterion("StatCode not between", value1, value2, "statcode");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("Sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("Sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("Sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("Sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("Sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("Sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("Sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("Sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("Sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("Sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("Sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andNextOpenidIsNull() {
            addCriterion("next_openid is null");
            return (Criteria) this;
        }

        public Criteria andNextOpenidIsNotNull() {
            addCriterion("next_openid is not null");
            return (Criteria) this;
        }

        public Criteria andNextOpenidEqualTo(String value) {
            addCriterion("next_openid =", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidNotEqualTo(String value) {
            addCriterion("next_openid <>", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidGreaterThan(String value) {
            addCriterion("next_openid >", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("next_openid >=", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidLessThan(String value) {
            addCriterion("next_openid <", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidLessThanOrEqualTo(String value) {
            addCriterion("next_openid <=", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidLike(String value) {
            addCriterion("next_openid like", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidNotLike(String value) {
            addCriterion("next_openid not like", value, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidIn(List<String> values) {
            addCriterion("next_openid in", values, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidNotIn(List<String> values) {
            addCriterion("next_openid not in", values, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidBetween(String value1, String value2) {
            addCriterion("next_openid between", value1, value2, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andNextOpenidNotBetween(String value1, String value2) {
            addCriterion("next_openid not between", value1, value2, "nextOpenid");
            return (Criteria) this;
        }

        public Criteria andWeitypeIsNull() {
            addCriterion("weitype is null");
            return (Criteria) this;
        }

        public Criteria andWeitypeIsNotNull() {
            addCriterion("weitype is not null");
            return (Criteria) this;
        }

        public Criteria andWeitypeEqualTo(Integer value) {
            addCriterion("weitype =", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeNotEqualTo(Integer value) {
            addCriterion("weitype <>", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeGreaterThan(Integer value) {
            addCriterion("weitype >", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("weitype >=", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeLessThan(Integer value) {
            addCriterion("weitype <", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeLessThanOrEqualTo(Integer value) {
            addCriterion("weitype <=", value, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeIn(List<Integer> values) {
            addCriterion("weitype in", values, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeNotIn(List<Integer> values) {
            addCriterion("weitype not in", values, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeBetween(Integer value1, Integer value2) {
            addCriterion("weitype between", value1, value2, "weitype");
            return (Criteria) this;
        }

        public Criteria andWeitypeNotBetween(Integer value1, Integer value2) {
            addCriterion("weitype not between", value1, value2, "weitype");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("Logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("Logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("Logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("Logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("Logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("Logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("Logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("Logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("Logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("Logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("Logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("Logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("Logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("Logo not between", value1, value2, "logo");
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