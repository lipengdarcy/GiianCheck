package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WReplykeywordcontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WReplykeywordcontentExample() {
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

        public Criteria andKeywordidIsNull() {
            addCriterion("KeywordID is null");
            return (Criteria) this;
        }

        public Criteria andKeywordidIsNotNull() {
            addCriterion("KeywordID is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordidEqualTo(Integer value) {
            addCriterion("KeywordID =", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotEqualTo(Integer value) {
            addCriterion("KeywordID <>", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidGreaterThan(Integer value) {
            addCriterion("KeywordID >", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KeywordID >=", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidLessThan(Integer value) {
            addCriterion("KeywordID <", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidLessThanOrEqualTo(Integer value) {
            addCriterion("KeywordID <=", value, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidIn(List<Integer> values) {
            addCriterion("KeywordID in", values, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotIn(List<Integer> values) {
            addCriterion("KeywordID not in", values, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidBetween(Integer value1, Integer value2) {
            addCriterion("KeywordID between", value1, value2, "keywordid");
            return (Criteria) this;
        }

        public Criteria andKeywordidNotBetween(Integer value1, Integer value2) {
            addCriterion("KeywordID not between", value1, value2, "keywordid");
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

        public Criteria andImgIsNull() {
            addCriterion("Img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("Img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("Img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("Img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("Img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("Img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("Img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("Img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("Img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("Img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("Img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("Img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("Img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("Img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andLinksIsNull() {
            addCriterion("Links is null");
            return (Criteria) this;
        }

        public Criteria andLinksIsNotNull() {
            addCriterion("Links is not null");
            return (Criteria) this;
        }

        public Criteria andLinksEqualTo(String value) {
            addCriterion("Links =", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotEqualTo(String value) {
            addCriterion("Links <>", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThan(String value) {
            addCriterion("Links >", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksGreaterThanOrEqualTo(String value) {
            addCriterion("Links >=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThan(String value) {
            addCriterion("Links <", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLessThanOrEqualTo(String value) {
            addCriterion("Links <=", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksLike(String value) {
            addCriterion("Links like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotLike(String value) {
            addCriterion("Links not like", value, "links");
            return (Criteria) this;
        }

        public Criteria andLinksIn(List<String> values) {
            addCriterion("Links in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotIn(List<String> values) {
            addCriterion("Links not in", values, "links");
            return (Criteria) this;
        }

        public Criteria andLinksBetween(String value1, String value2) {
            addCriterion("Links between", value1, value2, "links");
            return (Criteria) this;
        }

        public Criteria andLinksNotBetween(String value1, String value2) {
            addCriterion("Links not between", value1, value2, "links");
            return (Criteria) this;
        }

        public Criteria andLinks2IsNull() {
            addCriterion("Links2 is null");
            return (Criteria) this;
        }

        public Criteria andLinks2IsNotNull() {
            addCriterion("Links2 is not null");
            return (Criteria) this;
        }

        public Criteria andLinks2EqualTo(String value) {
            addCriterion("Links2 =", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2NotEqualTo(String value) {
            addCriterion("Links2 <>", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2GreaterThan(String value) {
            addCriterion("Links2 >", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2GreaterThanOrEqualTo(String value) {
            addCriterion("Links2 >=", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2LessThan(String value) {
            addCriterion("Links2 <", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2LessThanOrEqualTo(String value) {
            addCriterion("Links2 <=", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2Like(String value) {
            addCriterion("Links2 like", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2NotLike(String value) {
            addCriterion("Links2 not like", value, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2In(List<String> values) {
            addCriterion("Links2 in", values, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2NotIn(List<String> values) {
            addCriterion("Links2 not in", values, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2Between(String value1, String value2) {
            addCriterion("Links2 between", value1, value2, "links2");
            return (Criteria) this;
        }

        public Criteria andLinks2NotBetween(String value1, String value2) {
            addCriterion("Links2 not between", value1, value2, "links2");
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

        public Criteria andKeycontentIsNull() {
            addCriterion("KeyContent is null");
            return (Criteria) this;
        }

        public Criteria andKeycontentIsNotNull() {
            addCriterion("KeyContent is not null");
            return (Criteria) this;
        }

        public Criteria andKeycontentEqualTo(String value) {
            addCriterion("KeyContent =", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotEqualTo(String value) {
            addCriterion("KeyContent <>", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentGreaterThan(String value) {
            addCriterion("KeyContent >", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentGreaterThanOrEqualTo(String value) {
            addCriterion("KeyContent >=", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLessThan(String value) {
            addCriterion("KeyContent <", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLessThanOrEqualTo(String value) {
            addCriterion("KeyContent <=", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentLike(String value) {
            addCriterion("KeyContent like", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotLike(String value) {
            addCriterion("KeyContent not like", value, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentIn(List<String> values) {
            addCriterion("KeyContent in", values, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotIn(List<String> values) {
            addCriterion("KeyContent not in", values, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentBetween(String value1, String value2) {
            addCriterion("KeyContent between", value1, value2, "keycontent");
            return (Criteria) this;
        }

        public Criteria andKeycontentNotBetween(String value1, String value2) {
            addCriterion("KeyContent not between", value1, value2, "keycontent");
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