package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectremindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectremindExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("ProjectID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("ProjectID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("ProjectID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("ProjectID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("ProjectID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("ProjectID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("ProjectID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("ProjectID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andStepidIsNull() {
            addCriterion("StepID is null");
            return (Criteria) this;
        }

        public Criteria andStepidIsNotNull() {
            addCriterion("StepID is not null");
            return (Criteria) this;
        }

        public Criteria andStepidEqualTo(Integer value) {
            addCriterion("StepID =", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotEqualTo(Integer value) {
            addCriterion("StepID <>", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidGreaterThan(Integer value) {
            addCriterion("StepID >", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StepID >=", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidLessThan(Integer value) {
            addCriterion("StepID <", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidLessThanOrEqualTo(Integer value) {
            addCriterion("StepID <=", value, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidIn(List<Integer> values) {
            addCriterion("StepID in", values, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotIn(List<Integer> values) {
            addCriterion("StepID not in", values, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidBetween(Integer value1, Integer value2) {
            addCriterion("StepID between", value1, value2, "stepid");
            return (Criteria) this;
        }

        public Criteria andStepidNotBetween(Integer value1, Integer value2) {
            addCriterion("StepID not between", value1, value2, "stepid");
            return (Criteria) this;
        }

        public Criteria andIsLookIsNull() {
            addCriterion("IS_LOOK is null");
            return (Criteria) this;
        }

        public Criteria andIsLookIsNotNull() {
            addCriterion("IS_LOOK is not null");
            return (Criteria) this;
        }

        public Criteria andIsLookEqualTo(Integer value) {
            addCriterion("IS_LOOK =", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotEqualTo(Integer value) {
            addCriterion("IS_LOOK <>", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThan(Integer value) {
            addCriterion("IS_LOOK >", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LOOK >=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThan(Integer value) {
            addCriterion("IS_LOOK <", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LOOK <=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookIn(List<Integer> values) {
            addCriterion("IS_LOOK in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotIn(List<Integer> values) {
            addCriterion("IS_LOOK not in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookBetween(Integer value1, Integer value2) {
            addCriterion("IS_LOOK between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LOOK not between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNull() {
            addCriterion("StepName is null");
            return (Criteria) this;
        }

        public Criteria andStepnameIsNotNull() {
            addCriterion("StepName is not null");
            return (Criteria) this;
        }

        public Criteria andStepnameEqualTo(String value) {
            addCriterion("StepName =", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotEqualTo(String value) {
            addCriterion("StepName <>", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThan(String value) {
            addCriterion("StepName >", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameGreaterThanOrEqualTo(String value) {
            addCriterion("StepName >=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThan(String value) {
            addCriterion("StepName <", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLessThanOrEqualTo(String value) {
            addCriterion("StepName <=", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameLike(String value) {
            addCriterion("StepName like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotLike(String value) {
            addCriterion("StepName not like", value, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameIn(List<String> values) {
            addCriterion("StepName in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotIn(List<String> values) {
            addCriterion("StepName not in", values, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameBetween(String value1, String value2) {
            addCriterion("StepName between", value1, value2, "stepname");
            return (Criteria) this;
        }

        public Criteria andStepnameNotBetween(String value1, String value2) {
            addCriterion("StepName not between", value1, value2, "stepname");
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

        public Criteria andReminddescripIsNull() {
            addCriterion("RemindDescrip is null");
            return (Criteria) this;
        }

        public Criteria andReminddescripIsNotNull() {
            addCriterion("RemindDescrip is not null");
            return (Criteria) this;
        }

        public Criteria andReminddescripEqualTo(String value) {
            addCriterion("RemindDescrip =", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripNotEqualTo(String value) {
            addCriterion("RemindDescrip <>", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripGreaterThan(String value) {
            addCriterion("RemindDescrip >", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripGreaterThanOrEqualTo(String value) {
            addCriterion("RemindDescrip >=", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripLessThan(String value) {
            addCriterion("RemindDescrip <", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripLessThanOrEqualTo(String value) {
            addCriterion("RemindDescrip <=", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripLike(String value) {
            addCriterion("RemindDescrip like", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripNotLike(String value) {
            addCriterion("RemindDescrip not like", value, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripIn(List<String> values) {
            addCriterion("RemindDescrip in", values, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripNotIn(List<String> values) {
            addCriterion("RemindDescrip not in", values, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripBetween(String value1, String value2) {
            addCriterion("RemindDescrip between", value1, value2, "reminddescrip");
            return (Criteria) this;
        }

        public Criteria andReminddescripNotBetween(String value1, String value2) {
            addCriterion("RemindDescrip not between", value1, value2, "reminddescrip");
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