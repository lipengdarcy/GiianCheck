package com.witsafe.model.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysNewsExample() {
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

        public Criteria andTitletypeIsNull() {
            addCriterion("TitleType is null");
            return (Criteria) this;
        }

        public Criteria andTitletypeIsNotNull() {
            addCriterion("TitleType is not null");
            return (Criteria) this;
        }

        public Criteria andTitletypeEqualTo(String value) {
            addCriterion("TitleType =", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotEqualTo(String value) {
            addCriterion("TitleType <>", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeGreaterThan(String value) {
            addCriterion("TitleType >", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeGreaterThanOrEqualTo(String value) {
            addCriterion("TitleType >=", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLessThan(String value) {
            addCriterion("TitleType <", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLessThanOrEqualTo(String value) {
            addCriterion("TitleType <=", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLike(String value) {
            addCriterion("TitleType like", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotLike(String value) {
            addCriterion("TitleType not like", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeIn(List<String> values) {
            addCriterion("TitleType in", values, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotIn(List<String> values) {
            addCriterion("TitleType not in", values, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeBetween(String value1, String value2) {
            addCriterion("TitleType between", value1, value2, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotBetween(String value1, String value2) {
            addCriterion("TitleType not between", value1, value2, "titletype");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("PicPath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("PicPath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("PicPath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("PicPath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("PicPath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("PicPath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("PicPath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("PicPath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("PicPath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("PicPath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("PicPath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("PicPath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("PicPath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("PicPath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andDescripIsNull() {
            addCriterion("Descrip is null");
            return (Criteria) this;
        }

        public Criteria andDescripIsNotNull() {
            addCriterion("Descrip is not null");
            return (Criteria) this;
        }

        public Criteria andDescripEqualTo(String value) {
            addCriterion("Descrip =", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotEqualTo(String value) {
            addCriterion("Descrip <>", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThan(String value) {
            addCriterion("Descrip >", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripGreaterThanOrEqualTo(String value) {
            addCriterion("Descrip >=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThan(String value) {
            addCriterion("Descrip <", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLessThanOrEqualTo(String value) {
            addCriterion("Descrip <=", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripLike(String value) {
            addCriterion("Descrip like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotLike(String value) {
            addCriterion("Descrip not like", value, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripIn(List<String> values) {
            addCriterion("Descrip in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotIn(List<String> values) {
            addCriterion("Descrip not in", values, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripBetween(String value1, String value2) {
            addCriterion("Descrip between", value1, value2, "descrip");
            return (Criteria) this;
        }

        public Criteria andDescripNotBetween(String value1, String value2) {
            addCriterion("Descrip not between", value1, value2, "descrip");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNull() {
            addCriterion("NewsContent is null");
            return (Criteria) this;
        }

        public Criteria andNewscontentIsNotNull() {
            addCriterion("NewsContent is not null");
            return (Criteria) this;
        }

        public Criteria andNewscontentEqualTo(String value) {
            addCriterion("NewsContent =", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotEqualTo(String value) {
            addCriterion("NewsContent <>", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThan(String value) {
            addCriterion("NewsContent >", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentGreaterThanOrEqualTo(String value) {
            addCriterion("NewsContent >=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThan(String value) {
            addCriterion("NewsContent <", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLessThanOrEqualTo(String value) {
            addCriterion("NewsContent <=", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentLike(String value) {
            addCriterion("NewsContent like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotLike(String value) {
            addCriterion("NewsContent not like", value, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentIn(List<String> values) {
            addCriterion("NewsContent in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotIn(List<String> values) {
            addCriterion("NewsContent not in", values, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentBetween(String value1, String value2) {
            addCriterion("NewsContent between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andNewscontentNotBetween(String value1, String value2) {
            addCriterion("NewsContent not between", value1, value2, "newscontent");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("IsTop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("IsTop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(Integer value) {
            addCriterion("IsTop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(Integer value) {
            addCriterion("IsTop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(Integer value) {
            addCriterion("IsTop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(Integer value) {
            addCriterion("IsTop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(Integer value) {
            addCriterion("IsTop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<Integer> values) {
            addCriterion("IsTop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<Integer> values) {
            addCriterion("IsTop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(Integer value1, Integer value2) {
            addCriterion("IsTop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTop not between", value1, value2, "istop");
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

        public Criteria andShowtimesIsNull() {
            addCriterion("ShowTimes is null");
            return (Criteria) this;
        }

        public Criteria andShowtimesIsNotNull() {
            addCriterion("ShowTimes is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimesEqualTo(Integer value) {
            addCriterion("ShowTimes =", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesNotEqualTo(Integer value) {
            addCriterion("ShowTimes <>", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesGreaterThan(Integer value) {
            addCriterion("ShowTimes >", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShowTimes >=", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesLessThan(Integer value) {
            addCriterion("ShowTimes <", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesLessThanOrEqualTo(Integer value) {
            addCriterion("ShowTimes <=", value, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesIn(List<Integer> values) {
            addCriterion("ShowTimes in", values, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesNotIn(List<Integer> values) {
            addCriterion("ShowTimes not in", values, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesBetween(Integer value1, Integer value2) {
            addCriterion("ShowTimes between", value1, value2, "showtimes");
            return (Criteria) this;
        }

        public Criteria andShowtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("ShowTimes not between", value1, value2, "showtimes");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNull() {
            addCriterion("NewsType is null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNotNull() {
            addCriterion("NewsType is not null");
            return (Criteria) this;
        }

        public Criteria andNewstypeEqualTo(String value) {
            addCriterion("NewsType =", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotEqualTo(String value) {
            addCriterion("NewsType <>", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThan(String value) {
            addCriterion("NewsType >", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThanOrEqualTo(String value) {
            addCriterion("NewsType >=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThan(String value) {
            addCriterion("NewsType <", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThanOrEqualTo(String value) {
            addCriterion("NewsType <=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLike(String value) {
            addCriterion("NewsType like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotLike(String value) {
            addCriterion("NewsType not like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeIn(List<String> values) {
            addCriterion("NewsType in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotIn(List<String> values) {
            addCriterion("NewsType not in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeBetween(String value1, String value2) {
            addCriterion("NewsType between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotBetween(String value1, String value2) {
            addCriterion("NewsType not between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andTheauthorIsNull() {
            addCriterion("TheAuthor is null");
            return (Criteria) this;
        }

        public Criteria andTheauthorIsNotNull() {
            addCriterion("TheAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andTheauthorEqualTo(String value) {
            addCriterion("TheAuthor =", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorNotEqualTo(String value) {
            addCriterion("TheAuthor <>", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorGreaterThan(String value) {
            addCriterion("TheAuthor >", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorGreaterThanOrEqualTo(String value) {
            addCriterion("TheAuthor >=", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorLessThan(String value) {
            addCriterion("TheAuthor <", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorLessThanOrEqualTo(String value) {
            addCriterion("TheAuthor <=", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorLike(String value) {
            addCriterion("TheAuthor like", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorNotLike(String value) {
            addCriterion("TheAuthor not like", value, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorIn(List<String> values) {
            addCriterion("TheAuthor in", values, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorNotIn(List<String> values) {
            addCriterion("TheAuthor not in", values, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorBetween(String value1, String value2) {
            addCriterion("TheAuthor between", value1, value2, "theauthor");
            return (Criteria) this;
        }

        public Criteria andTheauthorNotBetween(String value1, String value2) {
            addCriterion("TheAuthor not between", value1, value2, "theauthor");
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