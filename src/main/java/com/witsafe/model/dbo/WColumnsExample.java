package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WColumnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WColumnsExample() {
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

        public Criteria andChildidIsNull() {
            addCriterion("ChildID is null");
            return (Criteria) this;
        }

        public Criteria andChildidIsNotNull() {
            addCriterion("ChildID is not null");
            return (Criteria) this;
        }

        public Criteria andChildidEqualTo(Integer value) {
            addCriterion("ChildID =", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotEqualTo(Integer value) {
            addCriterion("ChildID <>", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThan(Integer value) {
            addCriterion("ChildID >", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChildID >=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThan(Integer value) {
            addCriterion("ChildID <", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidLessThanOrEqualTo(Integer value) {
            addCriterion("ChildID <=", value, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidIn(List<Integer> values) {
            addCriterion("ChildID in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotIn(List<Integer> values) {
            addCriterion("ChildID not in", values, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidBetween(Integer value1, Integer value2) {
            addCriterion("ChildID between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andChildidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChildID not between", value1, value2, "childid");
            return (Criteria) this;
        }

        public Criteria andColumnsIsNull() {
            addCriterion("Columns is null");
            return (Criteria) this;
        }

        public Criteria andColumnsIsNotNull() {
            addCriterion("Columns is not null");
            return (Criteria) this;
        }

        public Criteria andColumnsEqualTo(String value) {
            addCriterion("Columns =", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotEqualTo(String value) {
            addCriterion("Columns <>", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsGreaterThan(String value) {
            addCriterion("Columns >", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsGreaterThanOrEqualTo(String value) {
            addCriterion("Columns >=", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLessThan(String value) {
            addCriterion("Columns <", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLessThanOrEqualTo(String value) {
            addCriterion("Columns <=", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsLike(String value) {
            addCriterion("Columns like", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotLike(String value) {
            addCriterion("Columns not like", value, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsIn(List<String> values) {
            addCriterion("Columns in", values, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotIn(List<String> values) {
            addCriterion("Columns not in", values, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsBetween(String value1, String value2) {
            addCriterion("Columns between", value1, value2, "columns");
            return (Criteria) this;
        }

        public Criteria andColumnsNotBetween(String value1, String value2) {
            addCriterion("Columns not between", value1, value2, "columns");
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

        public Criteria andIndexsIsNull() {
            addCriterion("Indexs is null");
            return (Criteria) this;
        }

        public Criteria andIndexsIsNotNull() {
            addCriterion("Indexs is not null");
            return (Criteria) this;
        }

        public Criteria andIndexsEqualTo(Integer value) {
            addCriterion("Indexs =", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsNotEqualTo(Integer value) {
            addCriterion("Indexs <>", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsGreaterThan(Integer value) {
            addCriterion("Indexs >", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Indexs >=", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsLessThan(Integer value) {
            addCriterion("Indexs <", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsLessThanOrEqualTo(Integer value) {
            addCriterion("Indexs <=", value, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsIn(List<Integer> values) {
            addCriterion("Indexs in", values, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsNotIn(List<Integer> values) {
            addCriterion("Indexs not in", values, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsBetween(Integer value1, Integer value2) {
            addCriterion("Indexs between", value1, value2, "indexs");
            return (Criteria) this;
        }

        public Criteria andIndexsNotBetween(Integer value1, Integer value2) {
            addCriterion("Indexs not between", value1, value2, "indexs");
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