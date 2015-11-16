package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.List;

public class WReplykeywordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WReplykeywordExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNull() {
            addCriterion("IsFirst is null");
            return (Criteria) this;
        }

        public Criteria andIsfirstIsNotNull() {
            addCriterion("IsFirst is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirstEqualTo(Short value) {
            addCriterion("IsFirst =", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotEqualTo(Short value) {
            addCriterion("IsFirst <>", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThan(Short value) {
            addCriterion("IsFirst >", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstGreaterThanOrEqualTo(Short value) {
            addCriterion("IsFirst >=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThan(Short value) {
            addCriterion("IsFirst <", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstLessThanOrEqualTo(Short value) {
            addCriterion("IsFirst <=", value, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstIn(List<Short> values) {
            addCriterion("IsFirst in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotIn(List<Short> values) {
            addCriterion("IsFirst not in", values, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstBetween(Short value1, Short value2) {
            addCriterion("IsFirst between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andIsfirstNotBetween(Short value1, Short value2) {
            addCriterion("IsFirst not between", value1, value2, "isfirst");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIsNull() {
            addCriterion("MatchType is null");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIsNotNull() {
            addCriterion("MatchType is not null");
            return (Criteria) this;
        }

        public Criteria andMatchtypeEqualTo(Short value) {
            addCriterion("MatchType =", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotEqualTo(Short value) {
            addCriterion("MatchType <>", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeGreaterThan(Short value) {
            addCriterion("MatchType >", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MatchType >=", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeLessThan(Short value) {
            addCriterion("MatchType <", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeLessThanOrEqualTo(Short value) {
            addCriterion("MatchType <=", value, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeIn(List<Short> values) {
            addCriterion("MatchType in", values, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotIn(List<Short> values) {
            addCriterion("MatchType not in", values, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeBetween(Short value1, Short value2) {
            addCriterion("MatchType between", value1, value2, "matchtype");
            return (Criteria) this;
        }

        public Criteria andMatchtypeNotBetween(Short value1, Short value2) {
            addCriterion("MatchType not between", value1, value2, "matchtype");
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

        public Criteria andApptypeIsNull() {
            addCriterion("AppType is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("AppType is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(Integer value) {
            addCriterion("AppType =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(Integer value) {
            addCriterion("AppType <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(Integer value) {
            addCriterion("AppType >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppType >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(Integer value) {
            addCriterion("AppType <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(Integer value) {
            addCriterion("AppType <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<Integer> values) {
            addCriterion("AppType in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<Integer> values) {
            addCriterion("AppType not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(Integer value1, Integer value2) {
            addCriterion("AppType between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AppType not between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("AppID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("AppID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Integer value) {
            addCriterion("AppID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Integer value) {
            addCriterion("AppID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Integer value) {
            addCriterion("AppID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Integer value) {
            addCriterion("AppID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Integer value) {
            addCriterion("AppID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Integer> values) {
            addCriterion("AppID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Integer> values) {
            addCriterion("AppID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Integer value1, Integer value2) {
            addCriterion("AppID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("AppID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andIsmassIsNull() {
            addCriterion("IsMass is null");
            return (Criteria) this;
        }

        public Criteria andIsmassIsNotNull() {
            addCriterion("IsMass is not null");
            return (Criteria) this;
        }

        public Criteria andIsmassEqualTo(Integer value) {
            addCriterion("IsMass =", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassNotEqualTo(Integer value) {
            addCriterion("IsMass <>", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassGreaterThan(Integer value) {
            addCriterion("IsMass >", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsMass >=", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassLessThan(Integer value) {
            addCriterion("IsMass <", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassLessThanOrEqualTo(Integer value) {
            addCriterion("IsMass <=", value, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassIn(List<Integer> values) {
            addCriterion("IsMass in", values, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassNotIn(List<Integer> values) {
            addCriterion("IsMass not in", values, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassBetween(Integer value1, Integer value2) {
            addCriterion("IsMass between", value1, value2, "ismass");
            return (Criteria) this;
        }

        public Criteria andIsmassNotBetween(Integer value1, Integer value2) {
            addCriterion("IsMass not between", value1, value2, "ismass");
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