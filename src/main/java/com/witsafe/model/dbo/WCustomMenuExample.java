package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WCustomMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WCustomMenuExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
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

        public Criteria andNamesIsNull() {
            addCriterion("Names is null");
            return (Criteria) this;
        }

        public Criteria andNamesIsNotNull() {
            addCriterion("Names is not null");
            return (Criteria) this;
        }

        public Criteria andNamesEqualTo(String value) {
            addCriterion("Names =", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotEqualTo(String value) {
            addCriterion("Names <>", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThan(String value) {
            addCriterion("Names >", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesGreaterThanOrEqualTo(String value) {
            addCriterion("Names >=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThan(String value) {
            addCriterion("Names <", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLessThanOrEqualTo(String value) {
            addCriterion("Names <=", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesLike(String value) {
            addCriterion("Names like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotLike(String value) {
            addCriterion("Names not like", value, "names");
            return (Criteria) this;
        }

        public Criteria andNamesIn(List<String> values) {
            addCriterion("Names in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotIn(List<String> values) {
            addCriterion("Names not in", values, "names");
            return (Criteria) this;
        }

        public Criteria andNamesBetween(String value1, String value2) {
            addCriterion("Names between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andNamesNotBetween(String value1, String value2) {
            addCriterion("Names not between", value1, value2, "names");
            return (Criteria) this;
        }

        public Criteria andEventkeyIsNull() {
            addCriterion("EventKey is null");
            return (Criteria) this;
        }

        public Criteria andEventkeyIsNotNull() {
            addCriterion("EventKey is not null");
            return (Criteria) this;
        }

        public Criteria andEventkeyEqualTo(String value) {
            addCriterion("EventKey =", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyNotEqualTo(String value) {
            addCriterion("EventKey <>", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyGreaterThan(String value) {
            addCriterion("EventKey >", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyGreaterThanOrEqualTo(String value) {
            addCriterion("EventKey >=", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyLessThan(String value) {
            addCriterion("EventKey <", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyLessThanOrEqualTo(String value) {
            addCriterion("EventKey <=", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyLike(String value) {
            addCriterion("EventKey like", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyNotLike(String value) {
            addCriterion("EventKey not like", value, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyIn(List<String> values) {
            addCriterion("EventKey in", values, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyNotIn(List<String> values) {
            addCriterion("EventKey not in", values, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyBetween(String value1, String value2) {
            addCriterion("EventKey between", value1, value2, "eventkey");
            return (Criteria) this;
        }

        public Criteria andEventkeyNotBetween(String value1, String value2) {
            addCriterion("EventKey not between", value1, value2, "eventkey");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("KeyID is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("KeyID is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(Integer value) {
            addCriterion("KeyID =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(Integer value) {
            addCriterion("KeyID <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(Integer value) {
            addCriterion("KeyID >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KeyID >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(Integer value) {
            addCriterion("KeyID <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(Integer value) {
            addCriterion("KeyID <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<Integer> values) {
            addCriterion("KeyID in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<Integer> values) {
            addCriterion("KeyID not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(Integer value1, Integer value2) {
            addCriterion("KeyID between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(Integer value1, Integer value2) {
            addCriterion("KeyID not between", value1, value2, "keyid");
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